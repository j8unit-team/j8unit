package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations interface
 * org.omg.PortableInterceptor.ClientRequestInterceptorOperations}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInterceptorOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ClientRequestInterceptorOperationsTests<SUT extends org.omg.PortableInterceptor.ClientRequestInterceptorOperations>
extends org.j8unit.repository.org.omg.PortableInterceptor.InterceptorOperationsTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#send_request(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.send_request(org.omg.PortableInterceptor.ClientRequestInfo)
     * throws org.omg.PortableInterceptor.ForwardRequest}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_send_request_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#receive_other(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.receive_other(org.omg.PortableInterceptor.ClientRequestInfo)
     * throws org.omg.PortableInterceptor.ForwardRequest}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_receive_other_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#receive_reply(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.receive_reply(org.omg.PortableInterceptor.ClientRequestInfo)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_receive_reply_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#send_poll(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.send_poll(org.omg.PortableInterceptor.ClientRequestInfo)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_send_poll_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#receive_exception(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.receive_exception(org.omg.PortableInterceptor.ClientRequestInfo)
     * throws org.omg.PortableInterceptor.ForwardRequest}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_receive_exception_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
