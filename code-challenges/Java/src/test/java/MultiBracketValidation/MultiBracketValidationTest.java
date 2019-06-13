package MultiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void test_multiBracketValidation_with_one() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertTrue(classUndertest.multiBracketValidation("()"));
    }
    @Test
    public void test_multiBracketValidation_with_one_curly() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertTrue(classUndertest.multiBracketValidation("{}"));
    }
    @Test
    public void test_multiBracketValidation_with_one_brackets() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertTrue(classUndertest.multiBracketValidation("[]"));
    }

    @Test
    public void test_multiBracketValidation_with_all_barackets() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertTrue(classUndertest.multiBracketValidation("([{}])"));
    }

    @Test
    public void test_multiBracketValidation_with_all_barackets_stuff() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertTrue(classUndertest.multiBracketValidation("([{abcd}])"));
    }
    @Test
    public void test_multiBracketValidation_with_all_barackets_dif_order() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertTrue(classUndertest.multiBracketValidation("([]){}"));
    }
    @Test
    public void test_multiBracketValidation_with_all_barackets_dif_order_2() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertTrue(classUndertest.multiBracketValidation("()[]{}"));
    }
    @Test
    public void test_multiBracketValidation_false_one() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertFalse(classUndertest.multiBracketValidation("("));
    }

    @Test
    public void test_multiBracketValidation_false_curly() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertFalse(classUndertest.multiBracketValidation("}"));
    }
    @Test
    public void test_multiBracketValidation_with_false_with_other_brackets() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertFalse(classUndertest.multiBracketValidation("()}[]"));
    }

    @Test
    public void test_multiBracketValidation_with_false_with_other_brackets_2() {
        MultiBracketValidation classUndertest = new MultiBracketValidation();
        assertFalse(classUndertest.multiBracketValidation("(){}]"));
    }
}