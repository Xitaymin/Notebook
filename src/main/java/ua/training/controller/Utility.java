package ua.training.controller;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Utility {
     Locale locale = new Locale("ua");
     ResourceBundle regexBundle = ResourceBundle.getBundle("regexes",locale);

    static boolean checkIfUserInputValid(String regex, String userInput){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        return matcher.matches();
    }

    static String getUserInput(Scanner sc){
        return sc.nextLine();
    }

    static String concatenateStrings(boolean addSpace, String ...strings) {
        StringBuilder sb = new StringBuilder();
        String option = "";
        if(addSpace){option = " ";} //if first argument true space after every input string will be added
        for (String s:strings) {
            sb.append(s);
            sb.append(option);
        }
        return sb.toString();
    }

}
