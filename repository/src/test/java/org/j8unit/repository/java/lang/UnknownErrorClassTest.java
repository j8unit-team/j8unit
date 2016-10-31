package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownErrorClassTest
implements org.j8unit.repository.java.lang.UnknownErrorClassTests<UnknownError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.UnknownError]

    @Override
    public Class<UnknownError> createNewSUT() {
        return UnknownError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link UnknownError#UnknownError() public
     * java.lang.UnknownError()}.
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
    public void create_UnknownError()
    throws Exception {
        // create new instance
        final UnknownError sut = new UnknownError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link UnknownError#UnknownError(String) public
     * java.lang.UnknownError(java.lang.String)}.
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
    public void create_UnknownError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnknownError sut = null; // = new UnknownError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.UnknownError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.UnknownError]

}
