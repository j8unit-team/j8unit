package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.UnsupportedFlavorException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsupportedFlavorException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.awt.datatransfer.UnsupportedFlavorExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class UnsupportedFlavorExceptionClassTest
implements UnsupportedFlavorExceptionClassTests<UnsupportedFlavorException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.datatransfer.UnsupportedFlavorException]

    @Override
    public Class<UnsupportedFlavorException> createNewSUT() {
        return UnsupportedFlavorException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.datatransfer.UnsupportedFlavorException#UnsupportedFlavorException(java.awt.datatransfer.DataFlavor)
     * public java.awt.datatransfer.UnsupportedFlavorException(java.awt.datatransfer.DataFlavor)}.
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
    public void create_UnsupportedFlavorException_DataFlavor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedFlavorException sut = null; // = new
                                                     // UnsupportedFlavorException(java.awt.datatransfer.DataFlavor);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.datatransfer.UnsupportedFlavorException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.datatransfer.UnsupportedFlavorException]

}
