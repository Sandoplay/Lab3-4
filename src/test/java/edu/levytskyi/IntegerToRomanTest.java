package edu.levytskyi;
/* @author Sandoplay
 * @project Lab3-4
 * @class IntegerToRoman
 * @version 1.0.0
 * @since 03.04.2025 - 19.17
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class IntegerToRomanTest {

    @Test
    void whenArabic1_ThenRomanI() {
        assertEquals("I", Converter.arabicToRoman(1));
    }

    @Test
    void whenArabic3_ThenRomanIII() {
        assertEquals("III", Converter.arabicToRoman(3));
    }

    @Test
    void whenArabic4_ThenRomanIV() {
        assertEquals("IV", Converter.arabicToRoman(4));
    }

    @Test
    void whenArabic5_ThenRomanV() {
        assertEquals("V", Converter.arabicToRoman(5));
    }

    @Test
    void whenArabic8_ThenRomanVIII() {
        assertEquals("VIII", Converter.arabicToRoman(8));
    }

    @Test
    void whenArabic9_ThenRomanIX() {
        assertEquals("IX", Converter.arabicToRoman(9));
    }

    @Test
    void whenArabic10_ThenRomanX() {
        assertEquals("X", Converter.arabicToRoman(10));
    }

    @Test
    void whenArabic12_ThenRomanXII() {
        assertEquals("XII", Converter.arabicToRoman(12));
    }

    @Test
    void whenArabic27_ThenRomanXXVII() {
        assertEquals("XXVII", Converter.arabicToRoman(27));
    }

    @Test
    void whenArabic40_ThenRomanXL() {
        assertEquals("XL", Converter.arabicToRoman(40));
    }

    @Test
    void whenArabic48_ThenRomanXLVIII() {
        assertEquals("XLVIII", Converter.arabicToRoman(48));
    }

    @Test
    void whenArabic50_ThenRomanL() {
        assertEquals("L", Converter.arabicToRoman(50));
    }

    @Test
    void whenArabic58_ThenRomanLVIII() {
        assertEquals("LVIII", Converter.arabicToRoman(58));
    }

    @Test
    void whenArabic88_ThenRomanLXXXVIII() {
        assertEquals("LXXXVIII", Converter.arabicToRoman(88));
    }

    @Test
    void whenArabic90_ThenRomanXC() {
        assertEquals("XC", Converter.arabicToRoman(90));
    }

    @Test
    void whenArabic99_ThenRomanXCIX() {
        assertEquals("XCIX", Converter.arabicToRoman(99));
    }

    @Test
    void whenArabic100_ThenRomanC() {
        assertEquals("C", Converter.arabicToRoman(100));
    }

    @Test
    void whenArabic198_ThenRomanCXCVIII() {
        assertEquals("CXCVIII", Converter.arabicToRoman(198));
    }

    @Test
    void whenArabic400_ThenRomanCD() {
        assertEquals("CD", Converter.arabicToRoman(400));
    }

    @Test
    void whenArabic444_ThenRomanCDXLIV() {
        assertEquals("CDXLIV", Converter.arabicToRoman(444));
    }

    @Test
    void whenArabic500_ThenRomanD() {
        assertEquals("D", Converter.arabicToRoman(500));
    }

    @Test
    void whenArabic900_ThenRomanCM() {
        assertEquals("CM", Converter.arabicToRoman(900));
    }

    @Test
    void whenArabic1000_ThenRomanM() {
        assertEquals("M", Converter.arabicToRoman(1000));
    }

    @Test
    void whenArabic1994_ThenRomanMCMXCIV() {
        assertEquals("MCMXCIV", Converter.arabicToRoman(1994));
    }

    @Test
    void whenArabic3999_ThenRomanMMMCMXCIX() {
        assertEquals("MMMCMXCIX", Converter.arabicToRoman(3999));
    }
}