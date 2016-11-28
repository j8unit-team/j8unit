package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InstantiationError} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.InstantiationErrorClassTests}).
 */
@RunWith(J8Unit4.class)
public class InstantiationErrorClassTest
implements InstantiationErrorClassTests<InstantiationError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.InstantiationError]

    @Override
    public Class<InstantiationError> createNewSUT() {
        return InstantiationError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link InstantiationError#InstantiationError() public
     * java.lang.InstantiationError()}.
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
    public void create_InstantiationError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InstantiationError sut = new InstantiationError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link InstantiationError#InstantiationError(String)
     * public java.lang.InstantiationError(java.lang.String)}.
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
    public void create_InstantiationError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InstantiationError sut = null; // = new InstantiationError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.InstantiationError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.InstantiationError]

}
