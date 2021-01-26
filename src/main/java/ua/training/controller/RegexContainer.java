package ua.training.controller;

public interface RegexContainer {
     String SURNAME = "^[^а-яЭЫЪ][А-ЩЬЮЯа-щьюяІЇЄіїє'\\s-]{1,20}$";
     String NAME = "^[^а-яЭЫЪ][А-ЩЬЮЯа-щьюяІЇЄіїє'\\s-]{1,20}$";
     String PATRONYMIC = "^[^а-яЭЫЪ][А-ЩЬЮЯа-щьюяІЇЄіїє'\\s-]{1,20}$";
     String NICKNAME = "^[-A-z0-9._]{6,20}$";
     String COMMENT = ".{0,60}";
     String PHONE = "^\\+380\\d{9}$";
     String CELL_PHONE2 = "^(\\+380\\d{9}|\\s*)$";
     String EMAIL = "^[^.\\W][-\\w._]{5,63}@[\\w-.]{1,253}\\.[a-z]{2,3}$";
//     String EMAIL_ADVANCED = "^[^.\\W][\\w]{5,30}@[\\w-\\.]{1,253}\\.[a-z]{2,3}$";
     String SKYPE = "^[-A-z0-9._]{6,20}$";
     String INDEX = "\\d{5}";
     String CITY = "^[^а-яЭЫЪ][А-ЩЬЮЯа-щьюяІЇЄіїє'\\s-]{1,20}$";
     String STREET = "^[^а-яЭЫЪ][А-ЩЬЮЯа-щьюяІЇЄіїє'\\s-]{1,20}$";
     String HOUSE = "^\\d{1,4}([а-щьюяіїє]|/\\d{1,4})?$";
     String APARTMENT = "\\d{1,4}";
}