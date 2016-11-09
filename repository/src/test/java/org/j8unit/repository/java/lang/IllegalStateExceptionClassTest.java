package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IllegalStateException} (by simply reusing
 * the J8Unit test interface {@link IllegalStateExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IllegalStateExceptionClassTest
implements IllegalStateExceptionClassTests<IllegalStateException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.IllegalStateException]

    @Override
    public Class<IllegalStateException> createNewSUT() {
        return IllegalStateException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalStateException#IllegalStateException(Throwable) public
     * java.lang.IllegalStateException(java.lang.Throwable)}.
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
    public void create_IllegalStateException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalStateException sut = null; // = new IllegalStateException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalStateException#IllegalStateException(String, Throwable) public
     * java.lang.IllegalStateException(java.lang.String,java.lang.Throwable)}.
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
    public void create_IllegalStateException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalStateException sut = null; // = new IllegalStateException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalStateException#IllegalStateException(String) public
     * java.lang.IllegalStateException(java.lang.String)}.
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
    public void create_IllegalStateException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalStateException sut = null; // = new IllegalStateException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link IllegalStateException#IllegalStateException()
     * public java.lang.IllegalStateException()}.
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
    public void create_IllegalStateException()
    throws Exception {
        // create new instance
        final IllegalStateException sut = new IllegalStateException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.IllegalStateException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.IllegalStateException]

}
