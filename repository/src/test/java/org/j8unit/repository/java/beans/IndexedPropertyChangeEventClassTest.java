package org.j8unit.repository.java.beans;

import java.beans.IndexedPropertyChangeEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IndexedPropertyChangeEvent} (by simply
 * reusing the J8Unit test interface {@link IndexedPropertyChangeEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class IndexedPropertyChangeEventClassTest
implements IndexedPropertyChangeEventClassTests<IndexedPropertyChangeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.IndexedPropertyChangeEvent]

    @Override
    public Class<IndexedPropertyChangeEvent> createNewSUT() {
        return IndexedPropertyChangeEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.IndexedPropertyChangeEvent#IndexedPropertyChangeEvent(Object, String, Object, Object, int)
     * public
     * java.beans.IndexedPropertyChangeEvent(java.lang.Object,java.lang.String,java.lang.Object,java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_IndexedPropertyChangeEvent_Object_String_Object_Object_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IndexedPropertyChangeEvent sut = null; // = new IndexedPropertyChangeEvent(Object, String, Object, Object,
                                                     // int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.IndexedPropertyChangeEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.IndexedPropertyChangeEvent]

}
