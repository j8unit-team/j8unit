package org.j8unit.repository.java.rmi;

import java.rmi.UnexpectedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnexpectedExceptionClassTest
implements org.j8unit.repository.java.rmi.UnexpectedExceptionClassTests<UnexpectedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.UnexpectedException]

    @Override
    public Class<UnexpectedException> createNewSUT() {
        return UnexpectedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link UnexpectedException#UnexpectedException(String)
     * public java.rmi.UnexpectedException(java.lang.String)}.
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
    public void create_UnexpectedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnexpectedException sut = null; // = new UnexpectedException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnexpectedException#UnexpectedException(String, Exception) public
     * java.rmi.UnexpectedException(java.lang.String,java.lang.Exception)}.
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
    public void create_UnexpectedException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnexpectedException sut = null; // = new UnexpectedException(String, Exception);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.UnexpectedException]

}
