package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoSuchFieldError} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.NoSuchFieldErrorClassTests}).
 */

@RunWith(J8Unit4.class)
public class NoSuchFieldErrorClassTest
implements NoSuchFieldErrorClassTests<NoSuchFieldError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.NoSuchFieldError]

    @Override
    public Class<NoSuchFieldError> createNewSUT() {
        return NoSuchFieldError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NoSuchFieldError#NoSuchFieldError() public
     * java.lang.NoSuchFieldError()}.
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
    public void create_NoSuchFieldError()
    throws Exception {
        // create new instance
        final NoSuchFieldError sut = new NoSuchFieldError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NoSuchFieldError#NoSuchFieldError(String)
     * public java.lang.NoSuchFieldError(java.lang.String)}.
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
    public void create_NoSuchFieldError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoSuchFieldError sut = null; // = new NoSuchFieldError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.NoSuchFieldError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.NoSuchFieldError]

}
