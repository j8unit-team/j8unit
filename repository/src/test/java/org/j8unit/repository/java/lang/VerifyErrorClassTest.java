package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VerifyErrorClassTest
implements org.j8unit.repository.java.lang.VerifyErrorClassTests<VerifyError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.VerifyError]

    @Override
    public Class<VerifyError> createNewSUT() {
        return VerifyError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link VerifyError#VerifyError() public
     * java.lang.VerifyError()}.
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
    public void create_VerifyError()
    throws Exception {
        // create new instance
        final VerifyError sut = new VerifyError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link VerifyError#VerifyError(String) public
     * java.lang.VerifyError(java.lang.String)}.
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
    public void create_VerifyError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final VerifyError sut = null; // = new VerifyError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.VerifyError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.VerifyError]

}
