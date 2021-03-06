package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StringIndexOutOfBoundsException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.lang.StringIndexOutOfBoundsExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class StringIndexOutOfBoundsExceptionClassTest
implements StringIndexOutOfBoundsExceptionClassTests<StringIndexOutOfBoundsException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.StringIndexOutOfBoundsException]

    @Override
    public Class<StringIndexOutOfBoundsException> createNewSUT() {
        return StringIndexOutOfBoundsException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link StringIndexOutOfBoundsException#StringIndexOutOfBoundsException() public
     * java.lang.StringIndexOutOfBoundsException()}.
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
    public void create_StringIndexOutOfBoundsException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringIndexOutOfBoundsException sut = new StringIndexOutOfBoundsException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link StringIndexOutOfBoundsException#StringIndexOutOfBoundsException(String) public
     * java.lang.StringIndexOutOfBoundsException(java.lang.String)}.
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
    public void create_StringIndexOutOfBoundsException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringIndexOutOfBoundsException sut = null; // = new StringIndexOutOfBoundsException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link StringIndexOutOfBoundsException#StringIndexOutOfBoundsException(int) public
     * java.lang.StringIndexOutOfBoundsException(int)}.
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
    public void create_StringIndexOutOfBoundsException_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringIndexOutOfBoundsException sut = null; // = new StringIndexOutOfBoundsException(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.StringIndexOutOfBoundsException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.StringIndexOutOfBoundsException]

}
