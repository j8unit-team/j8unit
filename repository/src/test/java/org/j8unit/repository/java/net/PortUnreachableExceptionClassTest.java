package org.j8unit.repository.java.net;

import java.net.PortUnreachableException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PortUnreachableExceptionClassTest
implements org.j8unit.repository.java.net.PortUnreachableExceptionClassTests<PortUnreachableException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.PortUnreachableException]

    @Override
    public Class<PortUnreachableException> createNewSUT() {
        return PortUnreachableException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.PortUnreachableException#PortUnreachableException(String) public
     * java.net.PortUnreachableException(java.lang.String)}.
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
    public void create_PortUnreachableException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PortUnreachableException sut = null; // = new PortUnreachableException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.PortUnreachableException#PortUnreachableException() public java.net.PortUnreachableException()}.
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
    public void create_PortUnreachableException()
    throws Exception {
        // create new instance
        final PortUnreachableException sut = new PortUnreachableException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.PortUnreachableException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.PortUnreachableException]

}
