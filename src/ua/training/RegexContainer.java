package ua.training;

public interface RegexContainer {
    /*
     * Shouldn't contain digits, may include few words, symbols -,' every word should contain less than 17 symbols and begin from capital letter
     */
    final String SURNAME = "(^[A-ZА-ЩЭ-ЯІЇЄ]{1}[a-zа-яіїє-']{1,15}){1,2}";
    //todo create test for surname
    //todo connect junit
}
