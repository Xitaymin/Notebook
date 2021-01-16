package ua.training;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private Scanner scanner;

    public void initial() {
        Scanner scanner = new Scanner(System.in);
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
