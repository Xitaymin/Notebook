package ua.training.view;

public class View {
    public static final String REQUEST_INPUT = "Enter your";

    public void printMessage(String... message) {
        StringBuilder sb = new StringBuilder();
        for (String m : message) {
            sb.append(m);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
