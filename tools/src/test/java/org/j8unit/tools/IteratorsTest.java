package org.j8unit.tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Iterator;
import org.j8unit.tools.util.Iterators;
import org.junit.Test;

public class IteratorsTest {

    @Test
    public void classHierarchyOfXMLEventReader()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = Iterators.classHierarchy(javax.xml.stream.XMLEventReader.class);
        assertTrue(classHierarchy.hasNext());
        assertEquals(javax.xml.stream.XMLEventReader.class, classHierarchy.next());
        assertFalse(classHierarchy.hasNext());
    }

    @Test
    public void classHierarchyOfInputStream()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = Iterators.classHierarchy(java.io.InputStream.class);
        assertTrue(classHierarchy.hasNext());
        assertEquals(java.io.InputStream.class, classHierarchy.next());
        assertTrue(classHierarchy.hasNext());
        assertEquals(java.lang.Object.class, classHierarchy.next());
        assertFalse(classHierarchy.hasNext());
    }

    @Test
    public void classHierarchyOfBigDecimal()
    throws Exception {
        final Iterator<Class<?>> classHierarchy = Iterators.classHierarchy(java.math.BigDecimal.class);
        assertTrue(classHierarchy.hasNext());
        assertEquals(java.math.BigDecimal.class, classHierarchy.next());
        assertTrue(classHierarchy.hasNext());
        assertEquals(java.lang.Number.class, classHierarchy.next());
        assertTrue(classHierarchy.hasNext());
        assertEquals(java.lang.Object.class, classHierarchy.next());
        assertFalse(classHierarchy.hasNext());
    }

}
