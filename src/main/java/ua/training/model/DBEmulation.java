package ua.training.model;

public enum DBEmulation {
    USER("derfulim"),ADMIN("Xitaymin");
    private String login;

    DBEmulation(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
