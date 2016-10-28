package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.Object;
import org.omg.PortableServer.ForwardRequest;

@RunWith(J8Unit4.class)
public class ForwardRequestClassTest
implements org.j8unit.repository.org.omg.PortableServer.ForwardRequestClassTests<ForwardRequest> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ForwardRequest]

    @Override
    public Class<ForwardRequest> createNewSUT() {
        return ForwardRequest.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ForwardRequest#ForwardRequest() public
     * org.omg.PortableServer.ForwardRequest()}.
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
     * Test method for the hereby targeted constructor-under-test {@link ForwardRequest#ForwardRequest(Object) public
     * org.omg.PortableServer.ForwardRequest(org.omg.CORBA.Object)}.
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
        final ForwardRequest sut = null; // = new ForwardRequest(Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ForwardRequest#ForwardRequest(String, Object)
     * public org.omg.PortableServer.ForwardRequest(java.lang.String,org.omg.CORBA.Object)}.
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
        final ForwardRequest sut = null; // = new ForwardRequest(String, Object);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ForwardRequest]

}
