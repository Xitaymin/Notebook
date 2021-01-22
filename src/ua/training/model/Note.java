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
    private String index;
    private String city;
    private String street;
    private String homeNumber;
    private String apartmentNumber;
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

    public void setInitials() {
        String firstNameLetter = this.getName().substring(0,1);
        String divider1 = " ";
        String divider2 = ".";
        this.initials = concatenateStrings(false,this.getSurname(),divider1,firstNameLetter,divider2);
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

    public String getFormalizedAdress() {
        return formalizedAdress;
    }

    public void setFormalizedAdress() {
        this.formalizedAdress = concatenateStrings(true,this.getIndex(),this.getCity(),
                this.getStreet(),this.getHomeNumber(),this.getApartmentNumber());
    }

    public Date getNoteInputDate() {
        return noteInputDate;
    }

    public void setNoteInputDate() {

    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return "Note{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", initials='" + initials + '\'' +
                ", nick='" + nick + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhone='" + homePhone + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", cellPhone2='" + cellPhone2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", index='" + index + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", formalizedAdress='" + formalizedAdress + '\'' +
                ", noteInputDate=" + noteInputDate +
                ", lastModificationDate=" + lastModificationDate +
                '}';
    }

    private String concatenateStrings(boolean addSpace, String ...strings) {
        StringBuilder sb = new StringBuilder();
        String option = "";
        if(addSpace){option = " ";}
        for (String s:strings) {
            sb.append(s);
            sb.append(option);
        }
        return sb.toString();
    }


}
