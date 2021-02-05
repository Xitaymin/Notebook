package ua.training.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ControllerTest extends Controller {
    private String[] validUkrainianSurnameExamples;
    private String[] invalidUkrainianSurnameExamples;
    private String[] validCommentsExamples;
    private String[] validPhoneNumbers;
    private String[] validEmailExamples;
    private String[] invalidEmailExamples;
    private String[] validNicknameExamples;
    private String[] invalidNicknameExamples;
    private String[] validEnglishPatronymicExamples;
    private String[] validUkrainianHouseNumbersExamples;
    private String[] validCellPhone2Examples;
    private  ResourceBundle uaRegexpBundle = ResourceBundle.getBundle("regexes", new Locale("ua"));
    private  ResourceBundle enRegexpBundle = ResourceBundle.getBundle("regexes", new Locale("en"));

    @Before
    public void prepareValidUkrainianSurnames() {
        validUkrainianSurnameExamples = new String[]{"Єненков", "Нечуй-Левицький", "О'Коннор"};
    }
    //todo make symbols like . or ' or space not repeatable one after another
    @Test
    public void testIfValidUkrainianSurnameAccepted() {
        checkIfEveryValidItemAccepted(validUkrainianSurnameExamples, uaRegexpBundle.getString(RegexContainer.SURNAME));
    }

    @Before
    public void prepareInvalidUkrainianSurnames() {
        invalidUkrainianSurnameExamples = new String[]{"", "A", "B0nd","малыш"};
    }
    @Test
    public void testIfInvalidUkrainianSurnameRejected() {
        checkIfEveryInvalidItemRejected(invalidUkrainianSurnameExamples, uaRegexpBundle.getString(RegexContainer.SURNAME));
    }

    @Before
    public void prepareValidComment() {
        validCommentsExamples = new String[]{"Comment12", "Комментарий"};
    }
    @Test
    public void testIfValidCommentAccepted() {
    checkIfEveryValidItemAccepted(validCommentsExamples,uaRegexpBundle.getString(RegexContainer.COMMENT));
    }

    @Before
    public void prepareValidPhoneNumbers() {
        validPhoneNumbers = new String[]{"+380965841732", "+15554555648"};
    }
    @Test
    public void testIfValidPhoneNumberAccepted(){
        checkIfEveryValidItemAccepted(validPhoneNumbers,uaRegexpBundle.getString(RegexContainer.PHONE));
    }

    @Before
    public void prepareValidEmails(){
        validEmailExamples = new String[]{"ivanov@inbox.ru","1234abc@mail.ru","p.petrov@ukr.net"};
    }
    @Test
    public void testIfValidEmailAccepted(){
        checkIfEveryValidItemAccepted(validEmailExamples,uaRegexpBundle.getString(RegexContainer.EMAIL));
    }

    @Before
    public void prepareInvalidEmails(){
        invalidEmailExamples = new String[]{"@domainsample.com","johndoedomainsample.com","john.doe@.net","john.doe43@domainsample",".badguy@gmail.com","&geekforce@gmai.com",
        //"badguy..2@gmail.com"
        };
    }
    @Test
    public void testIfInvalidEmailRejected(){
        checkIfEveryInvalidItemRejected(invalidEmailExamples,uaRegexpBundle.getString(RegexContainer.EMAIL));
    }

    @Before
    public void prepareValidNickname(){
        validNicknameExamples = new String[]{"BadJack","hack-ker","cool_guy"};
    }
    @Test
    public void testIfValidNicknameAccepted(){
        checkIfEveryValidItemAccepted(validNicknameExamples,uaRegexpBundle.getString(RegexContainer.NICKNAME));
    }

    @Before
    public void prepareInvalidNicknames(){
        invalidNicknameExamples = new String[]{"Nice nick"
        };
    }
    @Test
    public void testIfInvalidNicknameRejected(){
        checkIfEveryInvalidItemRejected(invalidNicknameExamples,uaRegexpBundle.getString(RegexContainer.NICKNAME));
    }

    @Before
    public void prepareValidUkrainianHouseNumbers(){
        validUkrainianHouseNumbersExamples = new String[]{"118а","240/3","25","205/34"};
    }
    @Test
    public void testIfValidUkrainianHouseNumbersAccepted(){
        checkIfEveryValidItemAccepted(validUkrainianHouseNumbersExamples, uaRegexpBundle.getString(RegexContainer.HOUSE));
    }

    @Before
    public void prepareValidCellPhone2Numbers(){
        validCellPhone2Examples = new String[]{"+380966374221"," ",""};
    }
    @Test
    public void testIfValidCellPhone2NumbersAccepted(){
        checkIfEveryValidItemAccepted(validCellPhone2Examples,uaRegexpBundle.getString(RegexContainer.CELL_PHONE2));
    }
    @Before
    public void setValidEnglishPatronymicExamples() {
        validEnglishPatronymicExamples = new String[] {"Junior",""};
    }
    @Test
    public void checkIfValidEnglishPatronymicAccepted() {
        checkIfEveryValidItemAccepted(validEnglishPatronymicExamples,enRegexpBundle.getString(RegexContainer.PATRONYMIC));
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
