package ua.training;

public interface RegexContainer {
    /*
     * Shouldn't contain digits, may include few words, symbols -,' every word should contain less than 17 symbols and begin from capital letter
     */
    final String SURNAME = "[A-ZА-ЩЭ-ЯІЇЄа-яіїa-z'-]{2,20}";
    final String SURNAME_ADVANCED = "[A-ZА-ЩЭ-ЯІЇЄа-яіїa-z'-]{2,20}";
    final String NAME = "[A-ZА-ЩЭ-ЯІЇЄа-яіїa-z'-]{2,20}";
    final String PATRONYMIC = "[A-ZА-ЩЭ-ЯІЇЄа-яіїa-z'-]{2,20}";
    final String NICKNAME = "[A-Za-z0-9]{6,20}";
}
