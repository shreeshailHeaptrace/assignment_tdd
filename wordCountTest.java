
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class wordCountTest {

    @Test
    public void testforSingleOccuranceOfWord() {
        String paragraph = "This is a simple example to count words in a paragraph. " +
                "gives back number of count ";

        Map<String, Integer> res = wordCount.countWords(paragraph);

        Assert.assertEquals(Integer.valueOf(1), res.get("This"));
        Assert.assertEquals(Integer.valueOf(1), res.get("simple"));

    }

    @Test
    public void testForNonExistingWord() {
        String paragraph = "This is is is  is a simple example to to count words in a paragraph.";

        Map<String, Integer> res = wordCount.countWords(paragraph);
        Assert.assertEquals(null, res.get("ex"));

    }

    @Test
    public void testForEmptyString() {
        String paragraph = "";
        Map<String, Integer> res = wordCount.countWords(paragraph);
        Assert.assertEquals(null, res);

    }

    @Test
    public void testForMultipleCountWords() {
        String paragraph = "This is a simple example to to count words in a paragraph.";

        Map<String, Integer> res = wordCount.countWords(paragraph);
        Assert.assertEquals(Integer.valueOf(2), res.get("to"));

    }
}