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
    private String[] validNicknameExamples;
    private String[] invalidNicknameExamples;

    @Before
    public void prepareValidSurnames() throws Exception {
        validSurnameExamples = new String[]{"Єненков", "Нечуй-Левицький", "О'Коннор", "Кам'янець Подільський"};
    }

    //todo make symbols like . or ' or space not repeatable one after another
    @Test
    public void testIfValidSurnameAccepted() {
        checkIfEveryValidItemAccepted(validSurnameExamples, RegexContainer.SURNAME);
    }

    @Before
    public void prepareInvalidSurnames() {
        invalidSurnameExamples = new String[]{"", "A", "B0nd","малыш"};
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
        validEmailExamples = new String[]{"ivanov@inbox.ru","1234abc@mail.ru","p.petrov@ukr.net"};
    }

    @Test
    public void testIfValidEmailAccepted(){
        checkIfEveryValidItemAccepted(validEmailExamples,RegexContainer.EMAIL);
    }

    @Before
    public void prepareInvalidEmails(){
        invalidEmailExamples = new String[]{"@domainsample.com","johndoedomainsample.com","john.doe@.net","john.doe43@domainsample",".badguy@gmail.com","&geekforce@gmai.com",
        //"badguy..2@gmail.com"
        };
    }
    @Test
    public void testIfInvalidEmailRejected(){
        checkIfEveryInvalidItemRejected(invalidEmailExamples,RegexContainer.EMAIL);
    }

    @Before
    public void prepareValidNickname(){
        validNicknameExamples = new String[]{"BadJack","hack-ker","cool_guy"};
    }

    @Test
    public void testIfValidNicknameAccepted(){
        checkIfEveryValidItemAccepted(validNicknameExamples,RegexContainer.NICKNAME);
    }

    @Before
    public void prepareInvalidNicknames(){
        invalidNicknameExamples = new String[]{"Nice nick"
        };
    }
    @Test
    public void testIfInvalidNicknameRejected(){
        checkIfEveryInvalidItemRejected(invalidNicknameExamples,RegexContainer.NICKNAME);
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
