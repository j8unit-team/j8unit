package org.j8unit.repository.java.awt.print;

import java.awt.print.PrinterIOException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterIOExceptionClassTest
implements org.j8unit.repository.java.awt.print.PrinterIOExceptionClassTests<PrinterIOException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.PrinterIOException]

    @Override
    public Class<PrinterIOException> createNewSUT() {
        return PrinterIOException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.print.PrinterIOException#PrinterIOException(java.io.IOException) public
     * java.awt.print.PrinterIOException(java.io.IOException)}.
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
    public void create_PrinterIOException_IOException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrinterIOException sut = null; // = new PrinterIOException(java.io.IOException);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.print.PrinterIOException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.PrinterIOException]

}
