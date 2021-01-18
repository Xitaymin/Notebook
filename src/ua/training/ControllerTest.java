package ua.training;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ControllerTest extends Controller {
    private String[] validSurnameExamples;
    private String[] invalidSurnameExamples;
    private String[] validCommentsExamples;
    private String[] validPhoneNumbers;
    private String[] validEmailExamples;
    private String[] invalidEmailExamples;

    @Before
    public void prepareValidSurnames() throws Exception {
        validSurnameExamples = new String[]{"Єненков", "Нечуй-Левицький", "О'Коннор", "Smith"};
    }

    @Test
    public void testIfValidSurnameAccepted() {
        checkIfEveryValidItemAccepted(validSurnameExamples, RegexContainer.SURNAME);
    }

    @Before
    public void prepareInvalidSurnames() {
        invalidSurnameExamples = new String[]{"Ьсин", "", "A", "B0nd"};
    }

    @Test
    public void testIfInvalidSurnameRejected() {
        checkIfEveryInvalidItemRejected(invalidSurnameExamples, RegexContainer.SURNAME);
    }

    @Before
    public void prepareValidComment() {
        validCommentsExamples = new String[]{"Comment12", "Комментарий"};
    }

    @Test
    public void testIfValidCommentAccepted() {
    checkIfEveryValidItemAccepted(validCommentsExamples,RegexContainer.COMMENT);
    }

    @Before
    public void prepareValidPhoneNumbers() {
        validPhoneNumbers = new String[]{"+380965841732"};
    }

    @Test
    public void testIfValidPhoneNumberAccepted(){
        checkIfEveryValidItemAccepted(validPhoneNumbers,RegexContainer.PHONE);
    }

    @Before
    public void prepareValidEmails(){
        validEmailExamples = new String[]{"ivanov@inbox.ru"};
    }

    @Test
    public void testIfValidEmailAccepted(){
        checkIfEveryValidItemAccepted(validEmailExamples,RegexContainer.EMAIL);
    }

    public void checkIfEveryValidItemAccepted(String[] validData, String regex) {
        for (String item : validData) {
            Assert.assertTrue(checkIfUserInputValid(regex, item));
            System.out.println(item);
        }
    }

    public void checkIfEveryInvalidItemRejected(String[] inValidData, String regex) {
        for (String item : inValidData) {
            Assert.assertFalse(checkIfUserInputValid(regex, item));
            System.out.println(item);
        }
    }


}
