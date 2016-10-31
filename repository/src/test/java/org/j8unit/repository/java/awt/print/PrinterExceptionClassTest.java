package org.j8unit.repository.java.awt.print;

import java.awt.print.PrinterException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterExceptionClassTest
implements org.j8unit.repository.java.awt.print.PrinterExceptionClassTests<PrinterException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.PrinterException]

    @Override
    public Class<PrinterException> createNewSUT() {
        return PrinterException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.print.PrinterException#PrinterException() public java.awt.print.PrinterException()}.
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
    public void create_PrinterException()
    throws Exception {
        // create new instance
        final PrinterException sut = new PrinterException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.print.PrinterException#PrinterException(String) public
     * java.awt.print.PrinterException(java.lang.String)}.
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
    public void create_PrinterException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrinterException sut = null; // = new PrinterException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.print.PrinterException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.PrinterException]

}
