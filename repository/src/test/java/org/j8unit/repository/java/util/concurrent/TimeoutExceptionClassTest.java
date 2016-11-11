package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.TimeoutException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TimeoutException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.TimeoutExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class TimeoutExceptionClassTest
implements TimeoutExceptionClassTests<TimeoutException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.TimeoutException]

    @Override
    public Class<TimeoutException> createNewSUT() {
        return TimeoutException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.TimeoutException#TimeoutException() public java.util.concurrent.TimeoutException()}.
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
    public void create_TimeoutException()
    throws Exception {
        // create new instance
        final TimeoutException sut = new TimeoutException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.TimeoutException#TimeoutException(String) public
     * java.util.concurrent.TimeoutException(java.lang.String)}.
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
    public void create_TimeoutException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TimeoutException sut = null; // = new TimeoutException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.TimeoutException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.TimeoutException]

}
