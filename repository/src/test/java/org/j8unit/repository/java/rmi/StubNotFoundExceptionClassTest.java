package org.j8unit.repository.java.rmi;

import java.rmi.StubNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StubNotFoundException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.StubNotFoundExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class StubNotFoundExceptionClassTest
implements StubNotFoundExceptionClassTests<StubNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.StubNotFoundException]

    @Override
    public Class<StubNotFoundException> createNewSUT() {
        return StubNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.StubNotFoundException#StubNotFoundException(String) public
     * java.rmi.StubNotFoundException(java.lang.String)}.
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
    public void create_StubNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StubNotFoundException sut = null; // = new StubNotFoundException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.StubNotFoundException#StubNotFoundException(String, Exception) public
     * java.rmi.StubNotFoundException(java.lang.String,java.lang.Exception)}.
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
    public void create_StubNotFoundException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StubNotFoundException sut = null; // = new StubNotFoundException(String, Exception);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.StubNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.StubNotFoundException]

}
