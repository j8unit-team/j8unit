package org.j8unit.generator.util;

import static org.j8unit.generator.util.TypeAnalysis.classHierarchy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class IteratorsTest {

    @Test(expected = NoSuchElementException.class)
    public void testNoSuchElementException()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = classHierarchy(null);
        assertFalse(classHierarchy.hasNext());
        classHierarchy.next();
    }

    @Test
    public void classHierarchyOfNull()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = classHierarchy(null);
        assertFalse(classHierarchy.hasNext());
    }

    @Test
    public void classHierarchyOfObject()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = classHierarchy(Object.class);
        assertTrue(classHierarchy.hasNext());
        assertEquals(Object.class, classHierarchy.next());
        assertFalse(classHierarchy.hasNext());
    }

    @Test
    public void classHierarchyOfCloneableInterface()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = classHierarchy(Cloneable.class);
        assertTrue(classHierarchy.hasNext());
        assertEquals(Cloneable.class, classHierarchy.next());
        assertFalse(classHierarchy.hasNext());
    }

    @Test
    public void classHierarchyOfXMLEventReader()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = classHierarchy(javax.xml.stream.XMLEventReader.class);
        assertTrue(classHierarchy.hasNext());
        assertEquals(javax.xml.stream.XMLEventReader.class, classHierarchy.next());
        assertFalse(classHierarchy.hasNext());
    }

    @Test
    public void classHierarchyOfInputStream()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = classHierarchy(java.io.InputStream.class);
        assertTrue(classHierarchy.hasNext());
        assertEquals(java.io.InputStream.class, classHierarchy.next());
        assertTrue(classHierarchy.hasNext());
        assertEquals(Object.class, classHierarchy.next());
        assertFalse(classHierarchy.hasNext());
    }

    @Test
    public void classHierarchyOfBigDecimal()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = classHierarchy(java.math.BigDecimal.class);
        assertTrue(classHierarchy.hasNext());
        assertEquals(java.math.BigDecimal.class, classHierarchy.next());
        assertTrue(classHierarchy.hasNext());
        assertEquals(Number.class, classHierarchy.next());
        assertTrue(classHierarchy.hasNext());
        assertEquals(Object.class, classHierarchy.next());
        assertFalse(classHierarchy.hasNext());
    }

}
