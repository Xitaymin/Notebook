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
    private Address address;
    private String formalizedAdress;
    private LocalDate noteInputDate;
    private LocalDate lastModificationDate;

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

    /**
     * Creates String which consist of surname, space, first letter of the name and dot.
     */
    public void setInitials() {
        String firstNameLetter = this.getName().substring(0, 1);
        String divider1 = " ";
        String divider2 = ".";
        this.initials = concatenateStrings(false, this.getSurname(), divider1, firstNameLetter, divider2);
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        setLastModificationDate();
    }

    public String getFormalizedAdress() {
        return formalizedAdress;
    }

    /**
     * Creates String that provides summary address information.
     * String contains index, city name, street name, house number and apartment number separated by space.
     */
    public void setFormalizedAdress() {
        this.formalizedAdress = concatenateStrings(true, address.getIndex(), address.getCity(), address.getStreet(),
                address.getHouseNumber(),
                address.getApartmentNumber());
    }

    public LocalDate getNoteInputDate() {
        return noteInputDate;
    }

    public void setNoteInputDate(LocalDate noteInputDate) {
        this.noteInputDate = noteInputDate;
    }

    public LocalDate getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate() {
        this.lastModificationDate = LocalDate.now();
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
                ", formalizedAdress='" + formalizedAdress + '\'' +
                ", noteInputDate=" + noteInputDate +
                ", lastModificationDate=" + lastModificationDate +
                '}';
    }

    private String concatenateStrings(boolean addSpace, String... strings) {
        StringBuilder sb = new StringBuilder();
        String option = "";
        if (addSpace) {
            option = " ";
        } //if first argument true space after every input string will be added
        for (String s : strings) {
            sb.append(s);
            sb.append(option);
        }
        return sb.toString();
    }
}
