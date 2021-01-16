package ua.training;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ControllerTest extends Controller {
    private String[] validSurnameExamples;
    private String[] invalidSurnameExamples;

    @Before
    public void prepareValidData() throws Exception {
        validSurnameExamples = new String[]{"Єненков","Нечуй-Левицький","О'Коннор","Smith"};
    }

    @Test
    public void testIfValidSurnameAccepted() {
        for (String s : validSurnameExamples) {
            Assert.assertTrue(checkIfUserInputValid(RegexContainer.SURNAME, s));
        }
    }

    @Before
    public void prepareInvalidData() {
        invalidSurnameExamples = new String[]{"Ьсин","","A","B0nd"};
    }

    @Test
    public void testIfInvalidSurnameRejected() {
        for (String s : invalidSurnameExamples) {
            Assert.assertFalse(checkIfUserInputValid(RegexContainer.SURNAME, s));
        }
    }
}
