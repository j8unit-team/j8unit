package org.j8unit.repository.javax.swing;

import java.awt.Component;
import javax.swing.ProgressMonitor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProgressMonitorClassTest
implements org.j8unit.repository.javax.swing.ProgressMonitorClassTests<ProgressMonitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ProgressMonitor]

    @Override
    public Class<ProgressMonitor> createNewSUT() {
        return ProgressMonitor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ProgressMonitor#ProgressMonitor(Component, Object, String, int, int) public
     * javax.swing.ProgressMonitor(java.awt.Component,java.lang.Object,java.lang.String,int,int)}.
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
    public void create_ProgressMonitor_Component_Object_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProgressMonitor sut = null; // = new ProgressMonitor(Component, Object, String, int, int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ProgressMonitor]

}
