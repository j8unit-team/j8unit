package org.j8unit.repository.java.io;

import java.io.EOFException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EOFException} (by simply reusing the
 * J8Unit test interface {@link EOFExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class EOFExceptionClassTest
implements EOFExceptionClassTests<EOFException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.EOFException]

    @Override
    public Class<EOFException> createNewSUT() {
        return EOFException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.EOFException#EOFException() public
     * java.io.EOFException()}.
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
    public void create_EOFException()
    throws Exception {
        // create new instance
        final EOFException sut = new EOFException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.EOFException#EOFException(String)
     * public java.io.EOFException(java.lang.String)}.
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
    public void create_EOFException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EOFException sut = null; // = new EOFException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.EOFException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.EOFException]

}
