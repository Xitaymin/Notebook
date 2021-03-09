package ua.training.controller;

import ua.training.model.NotUniqueLoginException;
import ua.training.model.Note;
import ua.training.model.Notebook;
import ua.training.view.View;

import java.util.Scanner;

public class SimpleController implements Utility {
    private View view = new View();
    private InputNote inputNote = new InputNote();
    private Scanner sc = new Scanner(System.in);
    private Note note;
    private Notebook notebook = new Notebook();

    //Just for test
    public Notebook getNotebook() {
        return notebook;
    }

    public void processUserInput(){
        prepareNoteItems();
        createNote();

        while(true) {
            try {
                notebook.tryToAddNote(note);
                break;
            } catch (NotUniqueLoginException e) {
                System.err.println(e.getMessage() + e.getLogin());
                changeUserLogin();
            }
        }
        sc.close();
    }

    private void createNote() {
        note = new Note();
        note.setSurname(inputNote.getSurname());
        note.setName(inputNote.getName());
        note.setPatronymic(inputNote.getPatronymic());
        note.setInitials();
        note.setNick(inputNote.getNickname());
        note.setComment(inputNote.getComment());
        note.setGroup(inputNote.getGroup());
        note.setHomePhone(inputNote.getHomePhone());
        note.setCellPhone(inputNote.getCellPhone());
        note.setCellPhone2(inputNote.getCellPhone2());
        note.setEmail(inputNote.getEmail());
        note.setSkype(inputNote.getSkype());
        note.setAddress(inputNote.getAddress());
        note.setFormalizedAdress();
    }

    private void prepareNoteItems() {
        do{askUserEnterField(View.REQUEST_SURNAME_INPUT);}
        while (!inputNote.trySetSurname(sc));

        do{askUserEnterField(View.REQUEST_NAME_INPUT);}
        while (!inputNote.trySetName(sc));

        do{askUserEnterField(View.REQUEST_PATRONYMIC_INPUT);}
        while (!inputNote.trySetPatronymic(sc));

        do{askUserEnterField(View.REQUEST_NICKNAME_INPUT);}
        while (!inputNote.trySetNickname(sc));

        do{askUserEnterField(View.REQUEST_COMMENT_INPUT);}
        while (!inputNote.trySetComment(sc));

        do{askUserEnterField(View.REQUEST_GROUP_INPUT);}
        while (!inputNote.trySetGroup(sc));

        do{askUserEnterField(View.REQUEST_PHONE_NUMBER_INPUT);}
        while (!inputNote.trySetHomePhone(sc));

        do{askUserEnterField(View.REQUEST_CELL_PHONE_NUMBER_INPUT);}
        while (!inputNote.trySetCellPhone(sc));

        do{askUserEnterField(View.REQUEST_CELL_PHONE2_NUMBER_INPUT);}
        while (!inputNote.trySetCellPhone2(sc));

        do{askUserEnterField(View.REQUEST_EMAIL_INPUT);}
        while (!inputNote.trySetEmail(sc));

        do{askUserEnterField(View.REQUEST_SKYPE_INPUT);}
        while (!inputNote.trySetSkype(sc));

        do{askUserEnterField(View.REQUEST_INDEX_INPUT);}
        while (!inputNote.trySetIndex(sc));

        do{askUserEnterField(View.REQUEST_CITY_INPUT);}
        while (!inputNote.trySetCity(sc));

        do{askUserEnterField(View.REQUEST_STREET_INPUT);}
        while (!inputNote.trySetStreet(sc));

        do{askUserEnterField(View.REQUEST_HOUSE_NUMBER_INPUT);}
        while (!inputNote.trySetHouseNumber(sc));

        do{askUserEnterField(View.REQUEST_APARTMENT_NUMBER_INPUT);}
        while (!inputNote.trySetAppartmentNumber(sc));

    }

    private void askUserEnterField(String message){
        view.printLocalizedMessage(message);
    }

    private void changeUserLogin(){
        String userInput;
        do {
            askUserEnterField(View.REQUEST_NICKNAME_INPUT);
            userInput = Utility.getUserInput(sc);
        }
        while (!Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.NICKNAME),userInput));
        note.setNick(userInput);
    }
}
