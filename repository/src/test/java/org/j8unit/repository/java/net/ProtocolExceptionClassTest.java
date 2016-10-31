package org.j8unit.repository.java.net;

import java.net.ProtocolException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtocolExceptionClassTest
implements org.j8unit.repository.java.net.ProtocolExceptionClassTests<ProtocolException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ProtocolException]

    @Override
    public Class<ProtocolException> createNewSUT() {
        return ProtocolException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.ProtocolException#ProtocolException(String) public java.net.ProtocolException(java.lang.String)}.
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
     * Test method for the hereby targeted constructor-under-test {@link java.net.ProtocolException#ProtocolException()
     * public java.net.ProtocolException()}.
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

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.ProtocolException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ProtocolException]

}
