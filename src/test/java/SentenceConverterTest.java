import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SentenceConverterTest {

    SentenceConverter converter;
    @Before
    public void setupConverter() {
        converter = new SentenceConverter();
    }
    @Test
    public void testConvertOneQuestionSentenceWith3Words() {
        String sentence = "Hello world hi?";
        assertEquals("Hello dlrow hi?", converter.reverseWords(sentence));
    }


    @Test
    public void testConvertOneQuestionSentenceWith2Words() {
        String sentence = "Hello hi?";
        assertEquals("Hello hi?", converter.reverseWords(sentence));
    }


    @Test
    public void testConvertOneQuestionSentenceWith1Word() {
        String sentence = "Hello?";
        assertEquals("Hello?", converter.reverseWords(sentence));
    }


    @Test
    public void testConvert3SentencesWith2QuestionSentences() {
        String sentence = "Hello, what is your name? Hi! Can you buy this?";
        assertEquals("Hello, what si your name? Hi! Can uoy yub this?", converter.reverseWords(sentence));
    }

    @Test
    public void testConvertSentenceWithoutQuestions() {
        String sentence = "Hello, my name is John. I like eating icecream.";
        assertEquals("Hello, my name is John. I like eating icecream.", converter.reverseWords(sentence));
    }

    @Test
    public void testConvertWithDash() {
        String sentence = "Hello - can you buy this?";
        assertEquals("Hello - nac you buy this?", converter.reverseWords(sentence));
    }

    @Test
    public void testEmpty() {
        SentenceConverter sentenceConverter =new SentenceConverter();
        String rezMet = sentenceConverter.reverseWords("");
        String rezMy = "";
        assertTrue(rezMy.equals(rezMet));
    }
}
