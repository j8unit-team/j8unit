package org.j8unit.generator.util;

import static org.j8unit.generator.util.Java.JAVA_LANG;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaTest {

    @Test
    public void testJavaLangValue()
    throws Exception {
        assertEquals("java.lang", JAVA_LANG);
    }

}
