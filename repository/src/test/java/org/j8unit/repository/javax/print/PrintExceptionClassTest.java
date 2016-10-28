package org.j8unit.repository.javax.print;

import javax.print.PrintException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintExceptionClassTest
implements org.j8unit.repository.javax.print.PrintExceptionClassTests<PrintException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.PrintException]

    @Override
    public Class<PrintException> createNewSUT() {
        return PrintException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link PrintException#PrintException(String, Exception) public
     * javax.print.PrintException(java.lang.String,java.lang.Exception)}.
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
    public void create_PrintException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrintException sut = null; // = new PrintException(String, Exception);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PrintException#PrintException(Exception) public
     * javax.print.PrintException(java.lang.Exception)}.
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
    public void create_PrintException_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrintException sut = null; // = new PrintException(Exception);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PrintException#PrintException(String) public
     * javax.print.PrintException(java.lang.String)}.
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
    public void create_PrintException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrintException sut = null; // = new PrintException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PrintException#PrintException() public
     * javax.print.PrintException()}.
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
    public void create_PrintException()
    throws Exception {
        // create new instance
        final PrintException sut = new PrintException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.PrintException]

}
