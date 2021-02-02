package ua.training.controller;

public class Field {
    private String capitalizedFieldName;
    private String fieldRegexp;

    public Field(String capitalizedFieldName, String fieldRegexp) {
        this.capitalizedFieldName = capitalizedFieldName;
        this.fieldRegexp = fieldRegexp;
    }

    public String getCapitalizedFieldName() {
        return capitalizedFieldName;
    }

    public void setCapitalizedFieldName(String capitalizedFieldName) {
        this.capitalizedFieldName = capitalizedFieldName;
    }

    public String getFieldRegexp() {
        return fieldRegexp;
    }

    public void setFieldRegexp(String fieldRegexp) {
        this.fieldRegexp = fieldRegexp;
    }
}
