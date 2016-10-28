package org.j8unit.repository.javax.crypto;

import javax.crypto.ShortBufferException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortBufferExceptionClassTest
implements org.j8unit.repository.javax.crypto.ShortBufferExceptionClassTests<ShortBufferException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.ShortBufferException]

    @Override
    public Class<ShortBufferException> createNewSUT() {
        return ShortBufferException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.ShortBufferException#ShortBufferException() public javax.crypto.ShortBufferException()}.
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
    public void create_ShortBufferException()
    throws Exception {
        // create new instance
        final ShortBufferException sut = new ShortBufferException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.ShortBufferException#ShortBufferException(String) public
     * javax.crypto.ShortBufferException(java.lang.String)}.
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
    public void create_ShortBufferException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ShortBufferException sut = null; // = new ShortBufferException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.ShortBufferException]

}
