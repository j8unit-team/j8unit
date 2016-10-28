package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StackOverflowErrorClassTest
implements org.j8unit.repository.java.lang.StackOverflowErrorClassTests<StackOverflowError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.StackOverflowError]

    @Override
    public Class<StackOverflowError> createNewSUT() {
        return StackOverflowError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link StackOverflowError#StackOverflowError() public
     * java.lang.StackOverflowError()}.
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
    public void create_StackOverflowError()
    throws Exception {
        // create new instance
        final StackOverflowError sut = new StackOverflowError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link StackOverflowError#StackOverflowError(String)
     * public java.lang.StackOverflowError(java.lang.String)}.
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
    public void create_StackOverflowError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StackOverflowError sut = null; // = new StackOverflowError(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.StackOverflowError]

}
