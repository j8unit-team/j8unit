package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsupportedClassVersionError} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.lang.UnsupportedClassVersionErrorClassTests}).
 */
@RunWith(J8Unit4.class)
public class UnsupportedClassVersionErrorClassTest
implements UnsupportedClassVersionErrorClassTests<UnsupportedClassVersionError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.UnsupportedClassVersionError]

    @Override
    public Class<UnsupportedClassVersionError> createNewSUT() {
        return UnsupportedClassVersionError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnsupportedClassVersionError#UnsupportedClassVersionError() public
     * java.lang.UnsupportedClassVersionError()}.
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
    public void create_UnsupportedClassVersionError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedClassVersionError sut = new UnsupportedClassVersionError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnsupportedClassVersionError#UnsupportedClassVersionError(String) public
     * java.lang.UnsupportedClassVersionError(java.lang.String)}.
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
    public void create_UnsupportedClassVersionError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedClassVersionError sut = null; // = new UnsupportedClassVersionError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.UnsupportedClassVersionError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.UnsupportedClassVersionError]

}
