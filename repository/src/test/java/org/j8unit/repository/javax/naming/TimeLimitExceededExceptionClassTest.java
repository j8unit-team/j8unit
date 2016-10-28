package org.j8unit.repository.javax.naming;

import javax.naming.TimeLimitExceededException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeLimitExceededExceptionClassTest
implements org.j8unit.repository.javax.naming.TimeLimitExceededExceptionClassTests<TimeLimitExceededException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.TimeLimitExceededException]

    @Override
    public Class<TimeLimitExceededException> createNewSUT() {
        return TimeLimitExceededException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.TimeLimitExceededException#TimeLimitExceededException() public
     * javax.naming.TimeLimitExceededException()}.
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
    public void create_TimeLimitExceededException()
    throws Exception {
        // create new instance
        final TimeLimitExceededException sut = new TimeLimitExceededException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.TimeLimitExceededException#TimeLimitExceededException(String) public
     * javax.naming.TimeLimitExceededException(java.lang.String)}.
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
    public void create_TimeLimitExceededException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TimeLimitExceededException sut = null; // = new TimeLimitExceededException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.TimeLimitExceededException]

}
