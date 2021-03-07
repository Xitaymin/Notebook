package ua.training.controller;

import ua.training.model.Group;

import java.time.LocalDate;
import java.util.Scanner;

public class InputNote implements Utility {
    private String surname;
    private String name;
    private String patronymic;
    private String initials;
    private String nickname;
    private String comment;
    private Enum<Group> group;
    private String homePhone;
    private String cellPhone;
    private String cellPhone2; //may be absent
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String homeNumber;
    private String apartmentNumber;
    private String formalizedAdress;
//    private final LocalDate noteInputDate;
    private LocalDate lastModificationDate;

    public boolean trySetSurname(Scanner sc){
        String userInput = Utility.getUserInput(sc);
        if(Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.SURNAME),userInput)){
            this.surname = userInput;
            return true;
        }
        else return false;
    }
    public boolean trySetName(Scanner sc){
        String userInput = Utility.getUserInput(sc);
        if(Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.NAME),userInput)){
            this.name = userInput;
            return true;
        }
        else return false;
    }
    public boolean trySetPatronymic(Scanner sc){
        String userInput = Utility.getUserInput(sc);
        if(Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.PATRONYMIC),userInput)){
            this.patronymic = userInput;
            return true;
        }
        else return false;
    }

    public void setInitials(){
        String firstNameLetter = this.getName().substring(0,1);
        String divider1 = " ";
        String divider2 = ".";
        this.initials = Utility.concatenateStrings(false,this.getSurname(),divider1,firstNameLetter,divider2);
    }

    public boolean trySetNickname(Scanner sc){
        String userInput = Utility.getUserInput(sc);
        if(Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.NICKNAME),userInput)){
            this.nickname = userInput;
            return true;
        }
        else return false;
    }

    public boolean trySetComment(Scanner sc){
        String userInput = Utility.getUserInput(sc);
        if(Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.COMMENT),userInput)){
            this.comment = userInput;
            return true;
        }
        else return false;
    }
    public boolean trySetGroup(Scanner sc){
        String userInput = Utility.getUserInput(sc);
        if(Utility.checkIfUserInputValid(regexBundle.getString(RegexContainer.GROUP),userInput)){
            if (locale.getDisplayLanguage() == "en"){
            this.group = Group.valueOf(userInput);
            return true;
        }
        else if (locale.getDisplayLanguage() == "ua") {
            if (userInput == "СІМ'Я"){
                this.group = Group.FAMILY;
                return true;
            }
            if (userInput == "РОБОТА"){
                this.group = Group.WORK;
                return true;
            }
            }

        }
         return false;
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

    public String getInitials() {
        return initials;
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

    public String getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getFormalizedAdress() {
        return formalizedAdress;
    }

    public LocalDate getLastModificationDate() {
        return lastModificationDate;
    }
}
