package com.githib.roloreaper.cobalCopyBook4J.primitaves;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by
 * User :roloreaper
 * Date :2016/10/31.
 */
@Ignore
public class PIC_ATest {

    private PIC_A pic_a;

    @Before
    public void setUp() throws Exception {
        pic_a = new PIC_A();

    }

    @Test
    public void testRegexWillFailIfNoneAlphaCharactersAreUsed() throws Exception {
        String numbers = "1234567890A";
        assertThat(numbers.matches(pic_a.getRegexDefinition()), is(false));
    }

    @Test
    @Ignore
    public void testValidBlankString() throws Exception {
        assertThat("".matches(pic_a.getRegexDefinition()),is(true));

    }
}
