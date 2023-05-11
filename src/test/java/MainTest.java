import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
/**
 * Test case by Yoël MARCIANO
 *     4, IV
 *     5, V
 *     7, VII
 *     9, IX
 *     10, X
 *     17, XVII
 *     30, XXX
 *     38, XXXVIII
 *     479, CDLXXIX
 *     3999, MMMCMXCIX
 */


/**
     * Unit test for simple App.
     */
@RunWith(JUnitParamsRunner.class)
    public class MainTest
    {
        Main app = new Main();

        @Test
        @Parameters({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "7, VII",
            "9, IX",
            "10, X",
            "17, XVII",
            "30, XXX",
            "38, XXXVIII",
            "479, CDLXXIX",
            "3999, MMMCMXCIX"
        })
        public void shouldConvertNumberToRomanSymbols(int inputToConvert, String expectedValue) {
            String result = app.converter(inputToConvert);
            assert(result.equals(expectedValue));
        }

    }
