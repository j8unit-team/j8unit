package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.ProtocolException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProtocolException} (by simply reusing the
 * J8Unit test interface {@link ProtocolExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProtocolExceptionClassTest
implements ProtocolExceptionClassTests<ProtocolException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.ProtocolException]

    @Override
    public Class<ProtocolException> createNewSUT() {
        return ProtocolException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.ProtocolException#ProtocolException(Throwable) public
     * javax.xml.ws.ProtocolException(java.lang.Throwable)}.
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
    public void create_ProtocolException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProtocolException sut = null; // = new ProtocolException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.ProtocolException#ProtocolException(String, Throwable) public
     * javax.xml.ws.ProtocolException(java.lang.String,java.lang.Throwable)}.
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
    public void create_ProtocolException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProtocolException sut = null; // = new ProtocolException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.ProtocolException#ProtocolException(String) public
     * javax.xml.ws.ProtocolException(java.lang.String)}.
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
    public void create_ProtocolException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProtocolException sut = null; // = new ProtocolException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.ProtocolException#ProtocolException() public javax.xml.ws.ProtocolException()}.
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
    public void create_ProtocolException()
    throws Exception {
        // create new instance
        final ProtocolException sut = new ProtocolException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.ProtocolException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.ProtocolException]

}
