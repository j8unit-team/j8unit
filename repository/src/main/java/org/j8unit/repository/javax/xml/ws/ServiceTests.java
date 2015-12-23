package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.Service class javax.xml.ws.Service}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.javax.xml.ws.ServiceTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.ServiceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.Service
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServiceTests<SUT extends javax.xml.ws.Service>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.xml.ws.Service.Mode class javax.xml.ws.Service$Mode},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
     * counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.xml.ws.ServiceTests.ModeTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.xml.ws.ServiceClassTests.ModeClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.xml.ws.Service.Mode
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ModeTests<SUT extends javax.xml.ws.Service.Mode>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.xml.ws.Service.Mode> {

    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Service#addPort(javax.xml.namespace.QName, java.lang.String, java.lang.String) public void
     * javax.xml.ws.Service.addPort(javax.xml.namespace.QName,java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#addPort(javax.xml.namespace.QName, java.lang.String, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPort_QName_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Service#createDispatch(javax.xml.ws.EndpointReference, java.lang.Class, javax.xml.ws.Service.Mode, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Dispatch
     * javax.xml.ws.Service.createDispatch(javax.xml.ws.EndpointReference,java.lang.Class,javax.xml.ws.Service$Mode,javax.xml.ws.WebServiceFeature...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#createDispatch(javax.xml.ws.EndpointReference, java.lang.Class,
     *             javax.xml.ws.Service.Mode, javax.xml.ws.WebServiceFeature...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDispatch_EndpointReference_Class_Mode_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Service#createDispatch(javax.xml.ws.EndpointReference, javax.xml.bind.JAXBContext, javax.xml.ws.Service.Mode, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Dispatch
     * javax.xml.ws.Service.createDispatch(javax.xml.ws.EndpointReference,javax.xml.bind.JAXBContext,javax.xml.ws.Service$Mode,javax.xml.ws.WebServiceFeature...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#createDispatch(javax.xml.ws.EndpointReference, javax.xml.bind.JAXBContext,
     *             javax.xml.ws.Service.Mode, javax.xml.ws.WebServiceFeature...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDispatch_EndpointReference_JAXBContext_Mode_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Service#createDispatch(javax.xml.namespace.QName, java.lang.Class, javax.xml.ws.Service.Mode)
     * public javax.xml.ws.Dispatch
     * javax.xml.ws.Service.createDispatch(javax.xml.namespace.QName,java.lang.Class,javax.xml.ws.Service$Mode)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#createDispatch(javax.xml.namespace.QName, java.lang.Class,
     *             javax.xml.ws.Service.Mode)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDispatch_QName_Class_Mode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Service#createDispatch(javax.xml.namespace.QName, java.lang.Class, javax.xml.ws.Service.Mode, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Dispatch
     * javax.xml.ws.Service.createDispatch(javax.xml.namespace.QName,java.lang.Class,javax.xml.ws.Service$Mode,javax.xml.ws.WebServiceFeature...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#createDispatch(javax.xml.namespace.QName, java.lang.Class,
     *             javax.xml.ws.Service.Mode, javax.xml.ws.WebServiceFeature...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDispatch_QName_Class_Mode_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Service#createDispatch(javax.xml.namespace.QName, javax.xml.bind.JAXBContext, javax.xml.ws.Service.Mode)
     * public javax.xml.ws.Dispatch
     * javax.xml.ws.Service.createDispatch(javax.xml.namespace.QName,javax.xml.bind.JAXBContext,javax.xml.ws.Service$Mode)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#createDispatch(javax.xml.namespace.QName, javax.xml.bind.JAXBContext,
     *             javax.xml.ws.Service.Mode)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDispatch_QName_JAXBContext_Mode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Service#createDispatch(javax.xml.namespace.QName, javax.xml.bind.JAXBContext, javax.xml.ws.Service.Mode, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Dispatch
     * javax.xml.ws.Service.createDispatch(javax.xml.namespace.QName,javax.xml.bind.JAXBContext,javax.xml.ws.Service$Mode,javax.xml.ws.WebServiceFeature...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#createDispatch(javax.xml.namespace.QName, javax.xml.bind.JAXBContext,
     *             javax.xml.ws.Service.Mode, javax.xml.ws.WebServiceFeature...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDispatch_QName_JAXBContext_Mode_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#getExecutor() public java.util.concurrent.Executor
     * javax.xml.ws.Service.getExecutor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getExecutor()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExecutor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#getHandlerResolver() public javax.xml.ws.handler.HandlerResolver
     * javax.xml.ws.Service.getHandlerResolver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getHandlerResolver()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHandlerResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#getPort(java.lang.Class) public java.lang.Object
     * javax.xml.ws.Service.getPort(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getPort(java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPort_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#getPort(java.lang.Class, javax.xml.ws.WebServiceFeature...) public
     * java.lang.Object javax.xml.ws.Service.getPort(java.lang.Class,javax.xml.ws.WebServiceFeature...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getPort(java.lang.Class, javax.xml.ws.WebServiceFeature...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPort_Class_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Service#getPort(javax.xml.ws.EndpointReference, java.lang.Class, javax.xml.ws.WebServiceFeature...)
     * public java.lang.Object
     * javax.xml.ws.Service.getPort(javax.xml.ws.EndpointReference,java.lang.Class,javax.xml.ws.WebServiceFeature...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getPort(javax.xml.ws.EndpointReference, java.lang.Class,
     *             javax.xml.ws.WebServiceFeature...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPort_EndpointReference_Class_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#getPort(javax.xml.namespace.QName, java.lang.Class) public
     * java.lang.Object javax.xml.ws.Service.getPort(javax.xml.namespace.QName,java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getPort(javax.xml.namespace.QName, java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPort_QName_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Service#getPort(javax.xml.namespace.QName, java.lang.Class, javax.xml.ws.WebServiceFeature...)
     * public java.lang.Object
     * javax.xml.ws.Service.getPort(javax.xml.namespace.QName,java.lang.Class,javax.xml.ws.WebServiceFeature...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getPort(javax.xml.namespace.QName, java.lang.Class,
     *             javax.xml.ws.WebServiceFeature...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPort_QName_Class_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#getPorts() public java.util.Iterator javax.xml.ws.Service.getPorts()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getPorts()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPorts()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#getServiceName() public javax.xml.namespace.QName
     * javax.xml.ws.Service.getServiceName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getServiceName()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServiceName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#getWSDLDocumentLocation() public java.net.URL
     * javax.xml.ws.Service.getWSDLDocumentLocation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#getWSDLDocumentLocation()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWSDLDocumentLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#setExecutor(java.util.concurrent.Executor) public void
     * javax.xml.ws.Service.setExecutor(java.util.concurrent.Executor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#setExecutor(java.util.concurrent.Executor)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setExecutor_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Service#setHandlerResolver(javax.xml.ws.handler.HandlerResolver) public void
     * javax.xml.ws.Service.setHandlerResolver(javax.xml.ws.handler.HandlerResolver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Service#setHandlerResolver(javax.xml.ws.handler.HandlerResolver)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setHandlerResolver_HandlerResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
