package ua.training.model;

public enum Group {
    FAMILY("Family members"),WORK("Colleges and supervisors");

    private String value;
     Group(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }


}
