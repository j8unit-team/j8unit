package org.j8unit.repository.javax.crypto;

import javax.crypto.NoSuchPaddingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoSuchPaddingException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.crypto.NoSuchPaddingExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class NoSuchPaddingExceptionClassTest
implements NoSuchPaddingExceptionClassTests<NoSuchPaddingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.NoSuchPaddingException]

    @Override
    public Class<NoSuchPaddingException> createNewSUT() {
        return NoSuchPaddingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.NoSuchPaddingException#NoSuchPaddingException() public
     * javax.crypto.NoSuchPaddingException()}.
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
    public void create_NoSuchPaddingException()
    throws Exception {
        // create new instance
        final NoSuchPaddingException sut = new NoSuchPaddingException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.NoSuchPaddingException#NoSuchPaddingException(String) public
     * javax.crypto.NoSuchPaddingException(java.lang.String)}.
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
    public void create_NoSuchPaddingException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoSuchPaddingException sut = null; // = new NoSuchPaddingException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.NoSuchPaddingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.NoSuchPaddingException]

}
