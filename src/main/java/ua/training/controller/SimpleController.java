package ua.training.controller;

import ua.training.view.View;

import java.util.Scanner;

public class SimpleController {
    private View view = new View();
    private InputNote inputNote = new InputNote();
    private Scanner sc = new Scanner(System.in);


    public void processUserInput(){

        do{askUserEnterField(View.REQUEST_SURNAME_INPUT);}
        while (inputNote.trySetSurname(sc));

        do{askUserEnterField(View.REQUEST_SURNAME_INPUT);}
        while (inputNote.trySetSurname(sc));


    }

    private void askUserEnterField(String message){
        view.printLocalizedMessage(message);
    }
}
