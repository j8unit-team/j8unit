package org.j8unit.repository.java.util;

import java.util.ConcurrentModificationException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConcurrentModificationException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.ConcurrentModificationExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class ConcurrentModificationExceptionClassTest
implements ConcurrentModificationExceptionClassTests<ConcurrentModificationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.ConcurrentModificationException]

    @Override
    public Class<ConcurrentModificationException> createNewSUT() {
        return ConcurrentModificationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.ConcurrentModificationException#ConcurrentModificationException(String, Throwable) public
     * java.util.ConcurrentModificationException(java.lang.String,java.lang.Throwable)}.
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
    public void create_ConcurrentModificationException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentModificationException sut = null; // = new ConcurrentModificationException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.ConcurrentModificationException#ConcurrentModificationException(Throwable) public
     * java.util.ConcurrentModificationException(java.lang.Throwable)}.
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
    public void create_ConcurrentModificationException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentModificationException sut = null; // = new ConcurrentModificationException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.ConcurrentModificationException#ConcurrentModificationException(String) public
     * java.util.ConcurrentModificationException(java.lang.String)}.
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
    public void create_ConcurrentModificationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentModificationException sut = null; // = new ConcurrentModificationException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.ConcurrentModificationException#ConcurrentModificationException() public
     * java.util.ConcurrentModificationException()}.
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
    public void create_ConcurrentModificationException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentModificationException sut = new ConcurrentModificationException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.ConcurrentModificationException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.ConcurrentModificationException]

}
