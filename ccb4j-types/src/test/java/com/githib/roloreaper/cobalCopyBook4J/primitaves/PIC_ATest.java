package com.githib.roloreaper.cobalCopyBook4J.primitaves;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.awt.datatransfer.StringSelection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by
 * User :roloreaper
 * Date :2016/10/31.
 */
public class PIC_ATest {

    private PIC_A pic_a;

    @Before
    public void setUp() throws Exception {
        pic_a = new PIC_A(5);

    }

    @Test
    public void testRegexWillFailIfNoneAlphaCharactersAreUsed() throws Exception {
        String numbers = "1234567890A";
        assertThat(numbers.matches(pic_a.getRegexDefinition()), is(false));
    }
    @Test
    public void testRegexWillPassOnWhiteSpace() throws Exception {
        String numbers = "     ";
        System.out.println(numbers.length());
        assertThat(numbers.matches(pic_a.getRegexDefinition()), is(true));
    }

    @Test
    public void testValidBlankStringFaild() throws Exception {
        assertThat("".matches(pic_a.getRegexDefinition()),is(false));
    }

    @Test
    public void testThatLengthIsTested() throws Exception {
        String testValue="";
        for (int i = 1; i < 7; i++) {
             testValue+=" ";
            assertThat(testValue.matches(pic_a.getRegexDefinition()),is(i==pic_a.getLength()));
        }
    }

    @Test
    public void testRandom5CharString() {
        String ascii = RandomStringUtils.randomAlphabetic(5);
        System.out.println(ascii);
        assertThat(ascii.matches(pic_a.getRegexDefinition()),is(true));

    }

    @Test
    public void test5AlphaStringPasses() {
        assertThat("abcde".matches(pic_a.getRegexDefinition()),is(true));
    }
}
