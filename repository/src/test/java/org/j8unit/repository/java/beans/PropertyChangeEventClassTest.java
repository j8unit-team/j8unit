package org.j8unit.repository.java.beans;

import java.beans.PropertyChangeEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PropertyChangeEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.PropertyChangeEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class PropertyChangeEventClassTest
implements PropertyChangeEventClassTests<PropertyChangeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.PropertyChangeEvent]

    @Override
    public Class<PropertyChangeEvent> createNewSUT() {
        return PropertyChangeEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.PropertyChangeEvent#PropertyChangeEvent(Object, String, Object, Object) public
     * java.beans.PropertyChangeEvent(java.lang.Object,java.lang.String,java.lang.Object,java.lang.Object)}.
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
    public void create_PropertyChangeEvent_Object_String_Object_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PropertyChangeEvent sut = null; // = new PropertyChangeEvent(Object, String, Object, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.PropertyChangeEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.PropertyChangeEvent]

}
