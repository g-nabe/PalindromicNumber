package palindromicnumber;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gaku
 */
public class PalindromicNumberTest {

    public PalindromicNumberTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPalindromicNumber method, of class PalindromicNumber.
     */
    @Test
    public void testGetPalindromicNumber() {
        System.out.println("getPalindromicNumber");
        int input = 12;
        int expResult = 33;
        int result = PalindromicNumber.getPalindromicNumber(input);
        assertEquals(expResult, result);

        input = 132;
        expResult = 363;
        result = PalindromicNumber.getPalindromicNumber(input);
        assertEquals(expResult, result);

        input = 49;
        expResult = 484;
        result = PalindromicNumber.getPalindromicNumber(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindromicNumber method, of class PalindromicNumber.
     */
    @Test
    public void testIsPalindromicNumber() {
        System.out.println("isPalindromicNumber");
        int input = 12;
        boolean expResult = false;
        boolean result = PalindromicNumber.isPalindromicNumber(input);
        assertEquals(expResult, result);

        input = 121;
        expResult = true;
        result = PalindromicNumber.isPalindromicNumber(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of getReversedNumber method, of class PalindromicNumber.
     */
    @Test
    public void testGetReversedNumber() {
        System.out.println("getReversedNumber");
        int input = 12;
        int expResult = 21;
        int result = PalindromicNumber.getReversedNumber(input);
        assertEquals(expResult, result);

        input = 132;
        expResult = 231;
        result = PalindromicNumber.getReversedNumber(input);
        assertEquals(expResult, result);

        input = 49;
        expResult = 94;
        result = PalindromicNumber.getReversedNumber(input);
        assertEquals(expResult, result);
    }

}
