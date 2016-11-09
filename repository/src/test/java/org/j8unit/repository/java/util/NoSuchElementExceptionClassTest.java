package org.j8unit.repository.java.util;

import java.util.NoSuchElementException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoSuchElementException} (by simply
 * reusing the J8Unit test interface {@link NoSuchElementExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class NoSuchElementExceptionClassTest
implements NoSuchElementExceptionClassTests<NoSuchElementException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.NoSuchElementException]

    @Override
    public Class<NoSuchElementException> createNewSUT() {
        return NoSuchElementException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.NoSuchElementException#NoSuchElementException() public java.util.NoSuchElementException()}.
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
    public void create_NoSuchElementException()
    throws Exception {
        // create new instance
        final NoSuchElementException sut = new NoSuchElementException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.NoSuchElementException#NoSuchElementException(String) public
     * java.util.NoSuchElementException(java.lang.String)}.
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
    public void create_NoSuchElementException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoSuchElementException sut = null; // = new NoSuchElementException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.NoSuchElementException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.NoSuchElementException]

}
