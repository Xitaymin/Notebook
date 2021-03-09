package ua.training.controller;

import ua.training.model.Address;
import ua.training.model.Group;

import java.util.Scanner;

public class InputNote implements Utility {
    private String surname;
    private String name;
    private String patronymic;
    private String nickname;
    private String comment;
    private Enum<Group> group;
    private String homePhone;
    private String cellPhone;
    private String cellPhone2; //may be absent
    private String email;
    private String skype;
    private Address address = new Address();

    public boolean trySetSurname(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.SURNAME), userInput)) {
            this.surname = userInput;
            return true;
        } else return false;
    }

    public boolean trySetName(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.NAME), userInput)) {
            this.name = userInput;
            return true;
        } else return false;
    }

    public boolean trySetPatronymic(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.PATRONYMIC), userInput)) {
            this.patronymic = userInput;
            return true;
        } else return false;
    }

    public boolean trySetNickname(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.NICKNAME), userInput)) {
            this.nickname = userInput;
            return true;
        } else return false;
    }

    public boolean trySetComment(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.COMMENT), userInput)) {
            this.comment = userInput;
            return true;
        } else return false;
    }

    public boolean trySetGroup(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.GROUP), userInput)) {
            if (locale.getDisplayLanguage().equals("English")) {
                this.group = Group.valueOf(userInput);
                return true;
            } else if (locale.getDisplayLanguage().equals("ua")) {
                if (userInput.equals("СІМ'Я")) {
                    this.group = Group.FAMILY;
                    return true;
                }
                if (userInput.equals("РОБОТА")) {
                    this.group = Group.WORK;
                    return true;
                }
            }

        }
        return false;
    }

    public boolean trySetHomePhone(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.PHONE), userInput)) {
            this.homePhone = userInput;
            return true;
        } else return false;
    }

    public boolean trySetCellPhone(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.PHONE), userInput)) {
            this.cellPhone = userInput;
            return true;
        } else return false;
    }

    public boolean trySetCellPhone2(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.CELL_PHONE2), userInput)) {
            this.cellPhone2 = userInput;
            return true;
        } else return false;
    }

    public boolean trySetEmail(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.EMAIL), userInput)) {
            this.email = userInput;
            return true;
        } else return false;
    }

    public boolean trySetSkype(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.SKYPE), userInput)) {
            this.skype = userInput;
            return true;
        } else return false;
    }

    public boolean trySetIndex(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.INDEX), userInput)) {
            this.address.setIndex(userInput);
            return true;
        } else return false;
    }

    public boolean trySetCity(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.CITY), userInput)) {
            this.address.setCity(userInput);
            return true;
        } else return false;
    }

    public boolean trySetStreet(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.STREET), userInput)) {
            this.address.setStreet(userInput);
            return true;
        } else return false;
    }

    public boolean trySetHouseNumber(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.HOUSE), userInput)) {
            this.address.setHouseNumber(userInput);
            return true;
        } else return false;
    }

    public boolean trySetAppartmentNumber(Scanner sc) {
        String userInput = Utility.getUserInput(sc);
        if (Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.APARTMENT), userInput)) {
            this.address.setApartmentNumber(userInput);
            return true;
        } else return false;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public String getComment() {
        return comment;
    }

    public Enum<Group> getGroup() {
        return group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getCellPhone2() {
        return cellPhone2;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public Address getAddress() {
        return address;
    }

}
