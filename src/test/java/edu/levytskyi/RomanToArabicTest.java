package edu.levytskyi;
/* @author Sandoplay
 * @project Lab3-4
 * @class RomanToArabic
 * @version 1.0.0
 * @since 03.04.2025 - 19.43
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class RomanToArabicTest {

    @Test
    void whenRomanI_ThenArabic1() {
        assertEquals(1, Converter.romanToArabic("I"));
    }

    @Test
    void whenRomanV_ThenArabic5() {
        assertEquals(5, Converter.romanToArabic("V"));
    }

    @Test
    void whenRomanX_ThenArabic10() {
        assertEquals(10, Converter.romanToArabic("X"));
    }

    @Test
    void whenRomanL_ThenArabic50() {
        assertEquals(50, Converter.romanToArabic("L"));
    }

    @Test
    void whenRomanC_ThenArabic100() {
        assertEquals(100, Converter.romanToArabic("C"));
    }

    @Test
    void whenRomanD_ThenArabic500() {
        assertEquals(500, Converter.romanToArabic("D"));
    }

    @Test
    void whenRomanM_ThenArabic1000() {
        assertEquals(1000, Converter.romanToArabic("M"));
    }

    @Test
    void whenRomanIII_ThenArabic3() {
        assertEquals(3, Converter.romanToArabic("III"));
    }

    @Test
    void whenRomanXII_ThenArabic12() {
        assertEquals(12, Converter.romanToArabic("XII"));
    }

    @Test
    void whenRomanXXVII_ThenArabic27() {
        assertEquals(27, Converter.romanToArabic("XXVII"));
    }

    @Test
    void whenRomanIV_ThenArabic4() {
        assertEquals(4, Converter.romanToArabic("IV"));
    }

    @Test
    void whenRomanIX_ThenArabic9() {
        assertEquals(9, Converter.romanToArabic("IX"));
    }

    @Test
    void whenRomanMCMXCIV_ThenArabic1994() {
        assertEquals(1994, Converter.romanToArabic("MCMXCIV"));
    }

    @Test
    void whenRomanMMMCMXCIX_ThenArabic3999() {
        assertEquals(3999, Converter.romanToArabic("MMMCMXCIX"));
    }

    @Test
    void whenRomanLowercase_mcmxciv_ThenArabic1994() {
        assertEquals(1994, Converter.romanToArabic("mcmxciv"));
    }
}