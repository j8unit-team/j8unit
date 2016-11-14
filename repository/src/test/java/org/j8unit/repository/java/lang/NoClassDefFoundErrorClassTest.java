package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoClassDefFoundError} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.NoClassDefFoundErrorClassTests}).
 */

@RunWith(J8Unit4.class)
public class NoClassDefFoundErrorClassTest
implements NoClassDefFoundErrorClassTests<NoClassDefFoundError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.NoClassDefFoundError]

    @Override
    public Class<NoClassDefFoundError> createNewSUT() {
        return NoClassDefFoundError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NoClassDefFoundError#NoClassDefFoundError()
     * public java.lang.NoClassDefFoundError()}.
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
    public void create_NoClassDefFoundError()
    throws Exception {
        // create new instance
        final NoClassDefFoundError sut = new NoClassDefFoundError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NoClassDefFoundError#NoClassDefFoundError(String) public
     * java.lang.NoClassDefFoundError(java.lang.String)}.
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
    public void create_NoClassDefFoundError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoClassDefFoundError sut = null; // = new NoClassDefFoundError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.NoClassDefFoundError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.NoClassDefFoundError]

}
