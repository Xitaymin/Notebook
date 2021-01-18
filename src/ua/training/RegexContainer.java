package ua.training;

public interface RegexContainer {
    final String SURNAME = "^[A-ZА-ЩЭ-ЯІЇЄа-яіїa-z'-]{2,20}$";
    final String NAME = "^[A-ZА-ЩЭ-ЯІЇЄа-яіїa-z'-]{2,20}$";
    final String PATRONYMIC = "^[A-ZА-ЩЭ-ЯІЇЄа-яіїa-z'-]{2,20}$";
    final String NICKNAME = "^[A-Za-z0-9_]{6,20}$";
    final String COMMENT = ".{0,60}";
    final String PHONE = "^\\+380\\d{9}$";
    final String EMAIL = "^\\w{1,64}@[\\w-\\.]{1,253}\\.[a-z]{2,3}$";
}
