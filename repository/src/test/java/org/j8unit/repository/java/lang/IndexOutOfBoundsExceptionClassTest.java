package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IndexOutOfBoundsException} (by simply
 * reusing the J8Unit test interface {@link IndexOutOfBoundsExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IndexOutOfBoundsExceptionClassTest
implements IndexOutOfBoundsExceptionClassTests<IndexOutOfBoundsException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.IndexOutOfBoundsException]

    @Override
    public Class<IndexOutOfBoundsException> createNewSUT() {
        return IndexOutOfBoundsException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IndexOutOfBoundsException#IndexOutOfBoundsException() public java.lang.IndexOutOfBoundsException()}.
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
    public void create_IndexOutOfBoundsException()
    throws Exception {
        // create new instance
        final IndexOutOfBoundsException sut = new IndexOutOfBoundsException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IndexOutOfBoundsException#IndexOutOfBoundsException(String) public
     * java.lang.IndexOutOfBoundsException(java.lang.String)}.
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
    public void create_IndexOutOfBoundsException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IndexOutOfBoundsException sut = null; // = new IndexOutOfBoundsException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.IndexOutOfBoundsException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.IndexOutOfBoundsException]

}
