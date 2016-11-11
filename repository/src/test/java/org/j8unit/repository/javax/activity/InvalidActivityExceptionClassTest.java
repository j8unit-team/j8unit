package org.j8unit.repository.javax.activity;

import javax.activity.InvalidActivityException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidActivityException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.activity.InvalidActivityExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidActivityExceptionClassTest
implements InvalidActivityExceptionClassTests<InvalidActivityException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activity.InvalidActivityException]

    @Override
    public Class<InvalidActivityException> createNewSUT() {
        return InvalidActivityException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activity.InvalidActivityException#InvalidActivityException(String, Throwable) public
     * javax.activity.InvalidActivityException(java.lang.String,java.lang.Throwable)}.
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
    public void create_InvalidActivityException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidActivityException sut = null; // = new InvalidActivityException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activity.InvalidActivityException#InvalidActivityException(Throwable) public
     * javax.activity.InvalidActivityException(java.lang.Throwable)}.
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
    public void create_InvalidActivityException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidActivityException sut = null; // = new InvalidActivityException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activity.InvalidActivityException#InvalidActivityException(String) public
     * javax.activity.InvalidActivityException(java.lang.String)}.
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
    public void create_InvalidActivityException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidActivityException sut = null; // = new InvalidActivityException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activity.InvalidActivityException#InvalidActivityException() public
     * javax.activity.InvalidActivityException()}.
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
    public void create_InvalidActivityException()
    throws Exception {
        // create new instance
        final InvalidActivityException sut = new InvalidActivityException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activity.InvalidActivityException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activity.InvalidActivityException]

}
