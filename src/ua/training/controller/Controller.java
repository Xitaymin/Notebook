package ua.training.controller;

import ua.training.model.Group;
import ua.training.model.Note;
import ua.training.model.Notebook;
import ua.training.view.View;

import java.beans.Statement;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    private Scanner scanner;
    private Map<String, String> noteFields;
    private View view;
    private Note note;
    private Notebook notebook;


    public Controller(){
        this.notebook = new Notebook();
        /*
        noteFields map contains pairs of note's field name and appropriate regex name. This map is created for linking information which is used for
        automatically filling of note fields.
         */
        noteFields = new LinkedHashMap<>();
        noteFields.put("Surname", RegexContainer.SURNAME);
        noteFields.put("Name",RegexContainer.NAME);
        noteFields.put("Patronymic",RegexContainer.PATRONYMIC);
        noteFields.put("Nick",RegexContainer.NICKNAME);
        noteFields.put("Comment",RegexContainer.COMMENT);
        noteFields.put("HomePhone",RegexContainer.PHONE);
        noteFields.put("CellPhone",RegexContainer.PHONE);
        noteFields.put("CellPhone2",RegexContainer.CELL_PHONE2);
        noteFields.put("Email",RegexContainer.EMAIL);
        noteFields.put("Skype",RegexContainer.SKYPE);
        noteFields.put("Index",RegexContainer.INDEX);
        noteFields.put("City",RegexContainer.CITY);
        noteFields.put("Street",RegexContainer.STREET);
        noteFields.put("HomeNumber",RegexContainer.HOUSE);
        noteFields.put("ApartmentNumber",RegexContainer.APARTMENT);

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
        notebook.addNote(note);
    }

    private void processUserInput() {
        String userInput;
        boolean isInputProcessed;
        for (String field:noteFields.keySet()) {//for each note fields
            isInputProcessed = false;
            while (!isInputProcessed){
                askUserEnterField(field);
                userInput = getUserInput(scanner);
                if (checkIfUserInputValid(noteFields.get(field), userInput)) {
                    /*
                    if user input matches regex that we got from regex container by name from noteField map for certain field name
                    valid data will be transferred to the setter which name is set + current field name
                     */
                    Statement statement = new Statement(note, "set" + field, new Object[]{userInput});
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

    private void askUserEnterField(String fieldName){
        view.printMessage(View.REQUEST_INPUT,fieldName);
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
