package ua.training;

public interface RegexContainer {
    final String SURNAME = "^[^а-яЭЫЪ][А-ЩЬЮЯа-щьюяІЇЄіїє'\\s-]{1,20}$";
    final String NAME = "^[^а-яЭЫЪ][А-ЩЬЮЯа-щьюяІЇЄіїє'\\s-]{1,20}$";
    final String PATRONYMIC = "^[^а-яЭЫЪ][А-ЩЬЮЯа-щьюяІЇЄіїє'\\s-]{1,20}$";
    final String NICKNAME = "^[-A-z0-9._]{6,20}$";
    final String COMMENT = ".{0,60}";
    final String PHONE = "^\\+380\\d{9}$";
    final String EMAIL = "^[^.\\W][\\w.]{5,30}@[\\w-.]{1,253}\\.[a-z]{2,3}$";
    final String EMAIL_ADVANCED = "^[^.\\W][\\w]{5,30}@[\\w-\\.]{1,253}\\.[a-z]{2,3}$";
    final String SKYPE = "^[-A-z0-9._]{6,20}$";
    final String INDEX = "\\d{5}";
    final String CITY = "^[^а-яЭЫЪ][А-ЩЬЮЯа-щьюяІЇЄіїє'\\s-]{1,20}$";
}