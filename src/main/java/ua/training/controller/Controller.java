package ua.training.controller;

import ua.training.model.Group;
import ua.training.model.NotUniqueLoginException;
import ua.training.model.Note;
import ua.training.model.Notebook;
import ua.training.view.View;

import java.beans.Statement;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    private Scanner scanner;
    private Map<Field, String> noteFields;
    private View view;
    private Note note;
    private Notebook notebook;
    private Locale locale = new Locale("ua");
    private ResourceBundle regexBundle = ResourceBundle.getBundle("regexes",locale);

//    todo simple version of controller without usage reflection (with class for storage note data before creation note itself)

    public Controller(){
        this.notebook = new Notebook();
        /*
        noteFields map contains pairs of note's field name and appropriate regex name. This map is created for linking information which is used for
        automatically filling of note fields.
         */

        noteFields = new LinkedHashMap<>();
        noteFields.put(new Field("Surname",RegexContainer.SURNAME), View.REQUEST_SURNAME_INPUT);
        noteFields.put(new Field("Name",RegexContainer.NAME),View.REQUEST_NAME_INPUT);
        noteFields.put(new Field("Patronymic",RegexContainer.PATRONYMIC),View.REQUEST_PATRONYMIC_INPUT);
        noteFields.put(new Field("Nick",RegexContainer.NICKNAME),View.REQUEST_NICKNAME_INPUT);
        noteFields.put(new Field("Comment",RegexContainer.COMMENT),View.REQUEST_COMMENT_INPUT);
        noteFields.put(new Field("HomePhone",RegexContainer.PHONE),View.REQUEST_PHONE_NUMBER_INPUT);
        noteFields.put(new Field("CellPhone",RegexContainer.PHONE),View.REQUEST_CELL_PHONE_NUMBER_INPUT);
        noteFields.put(new Field("CellPhone2",RegexContainer.CELL_PHONE2),View.REQUEST_CELL_PHONE2_NUMBER_INPUT);
        noteFields.put(new Field("Email",RegexContainer.EMAIL),View.REQUEST_EMAIL_INPUT);
        noteFields.put(new Field("Skype",RegexContainer.SKYPE),View.REQUEST_SKYPE_INPUT);
        noteFields.put(new Field("Index",RegexContainer.INDEX),View.REQUEST_INDEX_INPUT);
        noteFields.put(new Field("City",RegexContainer.CITY),View.REQUEST_CITY_INPUT);
        noteFields.put(new Field("Street",RegexContainer.STREET),View.REQUEST_STREET_INPUT);
        noteFields.put(new Field("HomeNumber",RegexContainer.HOUSE),View.REQUEST_HOUSE_NUMBER_INPUT);
        noteFields.put(new Field("ApartmentNumber",RegexContainer.APARTMENT),View.REQUEST_APARTMENT_NUMBER_INPUT);

        scanner = new Scanner(System.in);
        view = new View();
    }

    /**
     * Creates new note, fills it with data received from user and adds it into notebook.
     */
    public void makeNote() {
        note = new Note();
        processUserInput();
        note.setGroup(Group.ES);
        note.setInitials();
        note.setFormalizedAddress();
        note.setLastModificationDate();
        while(true) {
            try {
                notebook.tryToAddNote(note);
                break;
            } catch (NotUniqueLoginException e) {
                System.err.println(e.getMessage() + e.getLogin());
                changeUserLogin();
            }
        }
        scanner.close();
    }


    private void processUserInput() {
        String userInput;
        boolean isInputProcessed;
        for (Field field:noteFields.keySet()) {//for each note fields
            isInputProcessed = false;
            while (!isInputProcessed){
                askUserEnterField(noteFields.get(field));
                userInput = getUserInput(scanner);
                if (checkIfUserInputValid(regexBundle.getString(field.getFieldRegexp()), userInput)) {
                    /*
                    if user input matches regex that we got from regex container by name from noteField map for certain field name
                    valid data will be transferred to the setter which name is set + current field name
                     */
                    Statement statement = new Statement(note, "set" + field.getCapitalizedFieldName(), new Object[]{userInput});
                    try {
                        statement.execute();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    isInputProcessed = true;
                }
            }
        }
    }

    private void changeUserLogin(){
        String userInput;
        do {
            askUserEnterField(View.REQUEST_NICKNAME_INPUT);
            userInput = getUserInput(scanner);
        }
        while (!checkIfUserInputValid(regexBundle.getString(RegexContainer.NICKNAME),userInput));
        note.setNick(userInput);
    }

    private void askUserEnterField(String message){
        view.printLocalizedMessage(message);
    }

    private String getUserInput(Scanner scanner) {
        return scanner.nextLine();
    }

    public boolean checkIfUserInputValid(String regex, String userInput) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        return matcher.matches();
    }

    public Notebook getNotebook() {
        return notebook;
    }
}
