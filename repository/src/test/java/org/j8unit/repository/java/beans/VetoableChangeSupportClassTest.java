package org.j8unit.repository.java.beans;

import java.beans.VetoableChangeSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VetoableChangeSupportClassTest
implements org.j8unit.repository.java.beans.VetoableChangeSupportClassTests<VetoableChangeSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.VetoableChangeSupport]

    @Override
    public Class<VetoableChangeSupport> createNewSUT() {
        return VetoableChangeSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link VetoableChangeSupport#VetoableChangeSupport(Object) public
     * java.beans.VetoableChangeSupport(java.lang.Object)}.
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
    public void create_VetoableChangeSupport_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final VetoableChangeSupport sut = null; // = new VetoableChangeSupport(Object);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.VetoableChangeSupport]

}
