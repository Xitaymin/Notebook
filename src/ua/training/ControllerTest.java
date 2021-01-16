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
    public void setUp() throws Exception {
        validSurnameExamples = new String[]{"Нечуй-Левицький"};
        invalidSurnameExamples = new String[]{"A", "smith", "b0nd"};

    }

    @Test
    public void testCheckIfUserInputValid() {
        for (String s : validSurnameExamples
        ) {
            Assert.assertTrue(checkIfUserInputValid(RegexContainer.SURNAME, s));}
            for (String s : invalidSurnameExamples
            ) {
                Assert.assertFalse(checkIfUserInputValid(RegexContainer.SURNAME, s));
            }

        }
    }
