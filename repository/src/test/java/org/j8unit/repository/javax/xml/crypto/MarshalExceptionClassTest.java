package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.MarshalException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MarshalException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.MarshalExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class MarshalExceptionClassTest
implements MarshalExceptionClassTests<MarshalException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.MarshalException]

    @Override
    public Class<MarshalException> createNewSUT() {
        return MarshalException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.MarshalException#MarshalException(Throwable) public
     * javax.xml.crypto.MarshalException(java.lang.Throwable)}.
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
    public void create_MarshalException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MarshalException sut = null; // = new MarshalException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.MarshalException#MarshalException(String, Throwable) public
     * javax.xml.crypto.MarshalException(java.lang.String,java.lang.Throwable)}.
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
    public void create_MarshalException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MarshalException sut = null; // = new MarshalException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.MarshalException#MarshalException(String) public
     * javax.xml.crypto.MarshalException(java.lang.String)}.
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
    public void create_MarshalException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MarshalException sut = null; // = new MarshalException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.MarshalException#MarshalException() public javax.xml.crypto.MarshalException()}.
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
    public void create_MarshalException()
    throws Exception {
        // create new instance
        final MarshalException sut = new MarshalException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.MarshalException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.MarshalException]

}
