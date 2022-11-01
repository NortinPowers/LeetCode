package problems.number_6;

import junit.framework.TestCase;
import org.junit.Assert;

public class SolutionZigzagConversionTest extends TestCase {

    public void testConvert() {
        SolutionZigzagConversion conversion = new SolutionZigzagConversion();
        Assert.assertEquals("aibhjcgkodflnem", conversion.convert("abcdefghijklmno", 5));
        Assert.assertEquals("acb", conversion.convert("abc", 2));
        Assert.assertEquals("PAHNAPLSIIGYIR", conversion.convert("PAYPALISHIRING", 3));
        Assert.assertEquals("PINALSIGYAHRPI", conversion.convert("PAYPALISHIRING", 4));
        Assert.assertEquals("aebdc", conversion.convert("abcde", 3));
    }
}