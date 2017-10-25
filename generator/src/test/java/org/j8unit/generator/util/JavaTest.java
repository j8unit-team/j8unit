package org.j8unit.generator.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.j8unit.generator.util.Java.JAVA_LANG;
import static org.j8unit.generator.util.Java.annotation;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaTest {

    @Test
    public void testJavaLangValue()
    throws Exception {
        assertEquals("java.lang", JAVA_LANG);
    }

    @Test
    public void testEmptyAnnotation()
    throws Exception {
        final String annotation = annotation("SuppressWarnings", emptyList());
        assertEquals("", annotation);
    }

    @Test
    public void testSingleAnnotation()
    throws Exception {
        final String annotation = annotation("SuppressWarnings", asList("rawtypes"));
        assertEquals("@SuppressWarnings(\"rawtypes\")", annotation);
    }

    @Test
    public void testMultipleAnnotation()
    throws Exception {
        final String annotation = annotation("SuppressWarnings", asList("rawtypes", "deprecated"));
        assertEquals("@SuppressWarnings({\"rawtypes\", \"deprecated\"})", annotation);
    }

}
