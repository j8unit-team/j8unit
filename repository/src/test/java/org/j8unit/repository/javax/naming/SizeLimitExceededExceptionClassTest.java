package org.j8unit.repository.javax.naming;

import javax.naming.SizeLimitExceededException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SizeLimitExceededExceptionClassTest
implements org.j8unit.repository.javax.naming.SizeLimitExceededExceptionClassTests<SizeLimitExceededException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.SizeLimitExceededException]

    @Override
    public Class<SizeLimitExceededException> createNewSUT() {
        return SizeLimitExceededException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.SizeLimitExceededException#SizeLimitExceededException() public
     * javax.naming.SizeLimitExceededException()}.
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
    public void create_SizeLimitExceededException()
    throws Exception {
        // create new instance
        final SizeLimitExceededException sut = new SizeLimitExceededException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.SizeLimitExceededException#SizeLimitExceededException(String) public
     * javax.naming.SizeLimitExceededException(java.lang.String)}.
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
    public void create_SizeLimitExceededException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SizeLimitExceededException sut = null; // = new SizeLimitExceededException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.SizeLimitExceededException]

}
