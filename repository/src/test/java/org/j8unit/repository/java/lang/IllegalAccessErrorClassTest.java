package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IllegalAccessError} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.IllegalAccessErrorClassTests}).
 */
@RunWith(J8Unit4.class)
public class IllegalAccessErrorClassTest
implements IllegalAccessErrorClassTests<IllegalAccessError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.IllegalAccessError]

    @Override
    public Class<IllegalAccessError> createNewSUT() {
        return IllegalAccessError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link IllegalAccessError#IllegalAccessError() public
     * java.lang.IllegalAccessError()}.
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
    public void create_IllegalAccessError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalAccessError sut = new IllegalAccessError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link IllegalAccessError#IllegalAccessError(String)
     * public java.lang.IllegalAccessError(java.lang.String)}.
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
    public void create_IllegalAccessError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalAccessError sut = null; // = new IllegalAccessError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.IllegalAccessError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.IllegalAccessError]

}
