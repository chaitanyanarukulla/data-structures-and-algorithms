package RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void test_Repeat_two_Word() {
        String testing = "I like Beer and I like testing,";
        System.out.println(RepeatedWord.RepeatedWord(testing));
        assertTrue(RepeatedWord.RepeatedWord(testing).equals("i"));
    }

    @Test
    public void test_Repeat_one_Word() {
        String testing = "Once upon a time, there was a brave princess who...";
        assertTrue(RepeatedWord.RepeatedWord(testing).equals("a"));
    }

    @Test (expected = NullPointerException.class)
    public void testNoRepeatWord() {
        String testing = "seattle baseball team needs help.";
        assertTrue(RepeatedWord.RepeatedWord(testing).equals(null));
    }
}
