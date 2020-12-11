package ua.training.model;

import java.util.Date;

public class Note {
    private String surname;
    private String name;
    private String patronymic;
    private String initials;
    private String nick;
    private String comment;
    private Enum group;
    private String homePhone;
    private String cellPhone;
    private String cellPhone2; //may be absent
    private String email;
    private String skype;
    private Adress adress;
    private String formalizedAdress;
    private Date noteInputDate;
    private Date lastModificationDate;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Enum getGroup() {
        return group;
    }

    public void setGroup(Enum group) {
        this.group = group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCellPhone2() {
        return cellPhone2;
    }

    public void setCellPhone2(String cellPhone2) {
        this.cellPhone2 = cellPhone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getFormalizedAdress() {
        return formalizedAdress;
    }

    public void setFormalizedAdress(String formalizedAdress) {
        this.formalizedAdress = formalizedAdress;
    }

    public Date getNoteInputDate() {
        return noteInputDate;
    }

    public void setNoteInputDate(Date noteInputDate) {
        this.noteInputDate = noteInputDate;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }
}
