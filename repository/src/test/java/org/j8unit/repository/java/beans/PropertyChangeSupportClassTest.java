package org.j8unit.repository.java.beans;

import java.beans.PropertyChangeSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyChangeSupportClassTest
implements org.j8unit.repository.java.beans.PropertyChangeSupportClassTests<PropertyChangeSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.PropertyChangeSupport]

    @Override
    public Class<PropertyChangeSupport> createNewSUT() {
        return PropertyChangeSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.PropertyChangeSupport#PropertyChangeSupport(Object) public
     * java.beans.PropertyChangeSupport(java.lang.Object)}.
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
    public void create_PropertyChangeSupport_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PropertyChangeSupport sut = null; // = new PropertyChangeSupport(Object);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.PropertyChangeSupport]

}
