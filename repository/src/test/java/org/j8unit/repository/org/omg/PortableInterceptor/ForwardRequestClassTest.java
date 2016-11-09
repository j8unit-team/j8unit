package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ForwardRequest;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ForwardRequest} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.ForwardRequestClassTests}).
 */

@RunWith(J8Unit4.class)
public class ForwardRequestClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ForwardRequestClassTests<ForwardRequest> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ForwardRequest]

    @Override
    public Class<ForwardRequest> createNewSUT() {
        return ForwardRequest.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.ForwardRequest#ForwardRequest() public
     * org.omg.PortableInterceptor.ForwardRequest()}.
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
    public void create_ForwardRequest()
    throws Exception {
        // create new instance
        final ForwardRequest sut = new ForwardRequest();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.ForwardRequest#ForwardRequest(org.omg.CORBA.Object) public
     * org.omg.PortableInterceptor.ForwardRequest(org.omg.CORBA.Object)}.
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
    public void create_ForwardRequest_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ForwardRequest sut = null; // = new ForwardRequest(org.omg.CORBA.Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.ForwardRequest#ForwardRequest(String, org.omg.CORBA.Object) public
     * org.omg.PortableInterceptor.ForwardRequest(java.lang.String,org.omg.CORBA.Object)}.
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
    public void create_ForwardRequest_String_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ForwardRequest sut = null; // = new ForwardRequest(String, org.omg.CORBA.Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ForwardRequest]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ForwardRequest]

}
