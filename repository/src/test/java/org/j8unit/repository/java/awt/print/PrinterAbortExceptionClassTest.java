package org.j8unit.repository.java.awt.print;

import java.awt.print.PrinterAbortException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrinterAbortException} (by simply reusing
 * the J8Unit test interface {@link PrinterAbortExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrinterAbortExceptionClassTest
implements PrinterAbortExceptionClassTests<PrinterAbortException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.PrinterAbortException]

    @Override
    public Class<PrinterAbortException> createNewSUT() {
        return PrinterAbortException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.print.PrinterAbortException#PrinterAbortException() public
     * java.awt.print.PrinterAbortException()}.
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
    public void create_PrinterAbortException()
    throws Exception {
        // create new instance
        final PrinterAbortException sut = new PrinterAbortException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.print.PrinterAbortException#PrinterAbortException(String) public
     * java.awt.print.PrinterAbortException(java.lang.String)}.
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
    public void create_PrinterAbortException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrinterAbortException sut = null; // = new PrinterAbortException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.print.PrinterAbortException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.PrinterAbortException]

}
