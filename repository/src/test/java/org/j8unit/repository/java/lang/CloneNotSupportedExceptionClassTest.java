package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CloneNotSupportedExceptionClassTest
implements org.j8unit.repository.java.lang.CloneNotSupportedExceptionClassTests<CloneNotSupportedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.CloneNotSupportedException]

    @Override
    public Class<CloneNotSupportedException> createNewSUT() {
        return CloneNotSupportedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link CloneNotSupportedException#CloneNotSupportedException() public java.lang.CloneNotSupportedException()}.
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
    public void create_CloneNotSupportedException()
    throws Exception {
        // create new instance
        final CloneNotSupportedException sut = new CloneNotSupportedException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link CloneNotSupportedException#CloneNotSupportedException(String) public
     * java.lang.CloneNotSupportedException(java.lang.String)}.
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
    public void create_CloneNotSupportedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CloneNotSupportedException sut = null; // = new CloneNotSupportedException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.CloneNotSupportedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.CloneNotSupportedException]

}
