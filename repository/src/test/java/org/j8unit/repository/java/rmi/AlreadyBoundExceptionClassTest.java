package org.j8unit.repository.java.rmi;

import java.rmi.AlreadyBoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AlreadyBoundException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.AlreadyBoundExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class AlreadyBoundExceptionClassTest
implements AlreadyBoundExceptionClassTests<AlreadyBoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.AlreadyBoundException]

    @Override
    public Class<AlreadyBoundException> createNewSUT() {
        return AlreadyBoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.AlreadyBoundException#AlreadyBoundException() public java.rmi.AlreadyBoundException()}.
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
    public void create_AlreadyBoundException()
    throws Exception {
        // create new instance
        final AlreadyBoundException sut = new AlreadyBoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.AlreadyBoundException#AlreadyBoundException(String) public
     * java.rmi.AlreadyBoundException(java.lang.String)}.
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
    public void create_AlreadyBoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AlreadyBoundException sut = null; // = new AlreadyBoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.AlreadyBoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.AlreadyBoundException]

}
