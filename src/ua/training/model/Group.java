package ua.training.model;

public enum Group {
    ES("Electronic systems"),MN("Micro and nano technologies");

    private String value;
     Group(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }


}
