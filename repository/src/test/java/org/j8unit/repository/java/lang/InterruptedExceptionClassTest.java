package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptedExceptionClassTest
implements org.j8unit.repository.java.lang.InterruptedExceptionClassTests<InterruptedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.InterruptedException]

    @Override
    public Class<InterruptedException> createNewSUT() {
        return InterruptedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link InterruptedException#InterruptedException()
     * public java.lang.InterruptedException()}.
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
    public void create_InterruptedException()
    throws Exception {
        // create new instance
        final InterruptedException sut = new InterruptedException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link InterruptedException#InterruptedException(String) public
     * java.lang.InterruptedException(java.lang.String)}.
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
    public void create_InterruptedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InterruptedException sut = null; // = new InterruptedException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.InterruptedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.InterruptedException]

}
