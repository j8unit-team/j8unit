package org.j8unit.repository.java.net;

import java.net.UnknownHostException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownHostExceptionClassTest
implements org.j8unit.repository.java.net.UnknownHostExceptionClassTests<UnknownHostException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.UnknownHostException]

    @Override
    public Class<UnknownHostException> createNewSUT() {
        return UnknownHostException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnknownHostException#UnknownHostException(String) public java.net.UnknownHostException(java.lang.String)}.
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
    public void create_UnknownHostException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnknownHostException sut = null; // = new UnknownHostException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link UnknownHostException#UnknownHostException()
     * public java.net.UnknownHostException()}.
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
    public void create_UnknownHostException()
    throws Exception {
        // create new instance
        final UnknownHostException sut = new UnknownHostException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.UnknownHostException]

}
