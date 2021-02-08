package ua.training.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    private Locale locale = new Locale("ua");
    private ResourceBundle messagesBundle = ResourceBundle.getBundle("messages",locale);
    public static final String REQUEST_SURNAME_INPUT = "request_input.surname";
    public static final String REQUEST_NAME_INPUT = "request_input.name";
    public static final String REQUEST_PATRONYMIC_INPUT = "request_input.patronymic";
    public static final String REQUEST_NICKNAME_INPUT = "request_input.nickname";
    public static final String REQUEST_COMMENT_INPUT = "request_input.comment";
    public static final String REQUEST_PHONE_NUMBER_INPUT = "request_input.phone";
    public static final String REQUEST_CELL_PHONE_NUMBER_INPUT = "request_input.cell_phone";
    public static final String REQUEST_CELL_PHONE2_NUMBER_INPUT = "request_input.cell_phone2";
    public static final String REQUEST_EMAIL_INPUT = "request_input.email";
    public static final String REQUEST_SKYPE_INPUT = "request_input.skype";
    public static final String REQUEST_INDEX_INPUT = "request_input.index";
    public static final String REQUEST_CITY_INPUT = "request_input.city";
    public static final String REQUEST_STREET_INPUT = "request_input.street";
    public static final String REQUEST_HOUSE_NUMBER_INPUT = "request_input.house";
    public static final String REQUEST_APARTMENT_NUMBER_INPUT = "request_input.apartment";


    public void printMessage(String... message) {
        StringBuilder sb = new StringBuilder();
        for (String m : message) {
            sb.append(m);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    public void printLocalizedMessage(String message) {
        System.out.println(messagesBundle.getString(message));
    }
}
