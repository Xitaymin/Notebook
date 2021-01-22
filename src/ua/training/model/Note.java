package ua.training.model;

import java.time.LocalDate;

public class Note {

    private String surname;
    private String name;
    private String patronymic;
    private String initials;
    private String nick;
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
    private final LocalDate noteInputDate;
    private LocalDate lastModificationDate;

    public Note() {
        this.noteInputDate = LocalDate.now();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        setLastModificationDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setLastModificationDate();
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        setLastModificationDate();
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials() {
        String firstNameLetter = this.getName().substring(0,1);
        String divider1 = " ";
        String divider2 = ".";
        this.initials = concatenateStrings(false,this.getSurname(),divider1,firstNameLetter,divider2);
        setLastModificationDate();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
        setLastModificationDate();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
        setLastModificationDate();
    }

    public Enum<Group> getGroup() {
        return group;
    }

    public void setGroup(Enum<Group> group) {
        this.group = group;
        setLastModificationDate();
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
        setLastModificationDate();
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
        setLastModificationDate();
    }

    public String getCellPhone2() {
        return cellPhone2;
    }

    public void setCellPhone2(String cellPhone2) {
        this.cellPhone2 = cellPhone2;
        setLastModificationDate();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        setLastModificationDate();
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
        setLastModificationDate();
    }

    public String getFormalizedAdress() {
        return formalizedAdress;
    }

    public void setFormalizedAdress() {
        this.formalizedAdress = concatenateStrings(true,this.getIndex(),this.getCity(),
                this.getStreet(),this.getHomeNumber(),this.getApartmentNumber());
        setLastModificationDate();
    }

    public LocalDate getNoteInputDate() {
        return noteInputDate;
    }

    public LocalDate getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate() {
        this.lastModificationDate = LocalDate.now();
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
        setLastModificationDate();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        setLastModificationDate();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
        setLastModificationDate();
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
        setLastModificationDate();
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        setLastModificationDate();
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
