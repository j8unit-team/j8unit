package org.j8unit.repository.javax.swing;

import javax.swing.ProgressMonitorInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProgressMonitorInputStream} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.ProgressMonitorInputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class ProgressMonitorInputStreamClassTest
implements ProgressMonitorInputStreamClassTests<ProgressMonitorInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ProgressMonitorInputStream]

    @Override
    public Class<ProgressMonitorInputStream> createNewSUT() {
        return ProgressMonitorInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.ProgressMonitorInputStream#ProgressMonitorInputStream(java.awt.Component, Object, java.io.InputStream)
     * public javax.swing.ProgressMonitorInputStream(java.awt.Component,java.lang.Object,java.io.InputStream)}.
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
    public void create_ProgressMonitorInputStream_Component_Object_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProgressMonitorInputStream sut = null; // = new ProgressMonitorInputStream(java.awt.Component, Object,
                                                     // java.io.InputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ProgressMonitorInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ProgressMonitorInputStream]

}
