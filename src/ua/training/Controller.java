package ua.training;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private Scanner scanner;
    private Map<String, String> noteFields;

    public void initial() {
        noteFields = new LinkedHashMap<>();
        noteFields.put("surname",RegexContainer.SURNAME);
        noteFields.put("name",RegexContainer.NAME);
        noteFields.put("patronymic",RegexContainer.PATRONYMIC);
        noteFields.put("nick",RegexContainer.NICKNAME);
        noteFields.put("comment",RegexContainer.COMMENT);
        noteFields.put("homePhone",RegexContainer.PHONE);
        noteFields.put("cellPhone",RegexContainer.PHONE);
        noteFields.put("cellPhone2",RegexContainer.PHONE);
        noteFields.put("email",RegexContainer.EMAIL);
        noteFields.put("skype",RegexContainer.SKYPE);

        Scanner scanner = new Scanner(System.in);
    }


    public void processUserInput() {

    }

    public String getUserInput(Scanner scanner) {
        return scanner.nextLine();
    }

    public boolean checkIfUserInputValid(String regex, String userInput) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        return matcher.matches();
    }
}
