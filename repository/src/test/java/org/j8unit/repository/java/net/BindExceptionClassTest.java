package org.j8unit.repository.java.net;

import java.net.BindException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BindException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.BindExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class BindExceptionClassTest
implements BindExceptionClassTests<BindException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.BindException]

    @Override
    public Class<BindException> createNewSUT() {
        return BindException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.BindException#BindException(String)
     * public java.net.BindException(java.lang.String)}.
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
    public void create_BindException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BindException sut = null; // = new BindException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.BindException#BindException() public
     * java.net.BindException()}.
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
    public void create_BindException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BindException sut = new BindException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.BindException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.BindException]

}
