package org.j8unit.repository.javax.xml.ws.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.spi.Provider class javax.xml.ws.spi.Provider}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ProviderClassTests}.
 * </p>
 *
 * @see javax.xml.ws.spi.Provider class javax.xml.ws.spi.Provider (the hereby targeted class-under-test class)
 * @see ProviderClassTests ProviderClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProviderTests<SUT extends javax.xml.ws.spi.Provider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createEndpoint(String, Object, javax.xml.ws.WebServiceFeature...) public
     * javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createEndpoint(String, Object, javax.xml.ws.WebServiceFeature...) public
     * javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#createEndpoint(String, Object, javax.xml.ws.WebServiceFeature...) public
     *      javax.xml.ws.Endpoint
     *      javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature[])
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createEndpoint_String_Object_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createEndpoint(String, Class, javax.xml.ws.spi.Invoker, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Endpoint javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Class
     * <?>,javax.xml.ws.spi.Invoker,javax.xml.ws.WebServiceFeature...)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createEndpoint(String, Class, javax.xml.ws.spi.Invoker, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Class,javax.xml.ws.spi.Invoker,javax.xml.ws.WebServiceFeature...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#createEndpoint(String, Class, javax.xml.ws.spi.Invoker,
     *      javax.xml.ws.WebServiceFeature...) public javax.xml.ws.Endpoint
     *      javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Class,javax.xml.ws.spi.Invoker,javax.xml
     *      .ws.WebServiceFeature[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createEndpoint_String_Class_Invoker_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.Provider#createEndpoint(String, Object) public abstract
     * javax.xml.ws.Endpoint javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.spi.Provider#createEndpoint(String, Object) public abstract
     * javax.xml.ws.Endpoint javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#createEndpoint(String, Object) public abstract javax.xml.ws.Endpoint
     *      javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createEndpoint_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#getPort(javax.xml.ws.EndpointReference, Class, javax.xml.ws.WebServiceFeature...)
     * public abstract <T> T javax.xml.ws.spi.Provider.getPort(javax.xml.ws.EndpointReference,java.lang.Class
     * <T>,javax.xml.ws.WebServiceFeature...)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#getPort(javax.xml.ws.EndpointReference, Class, javax.xml.ws.WebServiceFeature...)
     * public abstract java.lang.Object
     * javax.xml.ws.spi.Provider.getPort(javax.xml.ws.EndpointReference,java.lang.Class,javax.xml.ws.WebServiceFeature...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#getPort(javax.xml.ws.EndpointReference, Class, javax.xml.ws.WebServiceFeature...)
     *      public abstract java.lang.Object
     *      javax.xml.ws.spi.Provider.getPort(javax.xml.ws.EndpointReference,java.lang.Class,javax.xml.ws.
     *      WebServiceFeature[]) (the hereby targeted method-under-test)
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
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createAndPublishEndpoint(String, Object, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createAndPublishEndpoint(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createAndPublishEndpoint(String, Object, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createAndPublishEndpoint(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#createAndPublishEndpoint(String, Object, javax.xml.ws.WebServiceFeature...) public
     *      javax.xml.ws.Endpoint
     *      javax.xml.ws.spi.Provider.createAndPublishEndpoint(java.lang.String,java.lang.Object,javax.xml.ws.
     *      WebServiceFeature[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createAndPublishEndpoint_String_Object_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.Provider#createAndPublishEndpoint(String, Object) public abstract
     * javax.xml.ws.Endpoint javax.xml.ws.spi.Provider.createAndPublishEndpoint(java.lang.String,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.spi.Provider#createAndPublishEndpoint(String, Object) public abstract
     * javax.xml.ws.Endpoint javax.xml.ws.spi.Provider.createAndPublishEndpoint(java.lang.String,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#createAndPublishEndpoint(String, Object) public abstract javax.xml.ws.Endpoint
     *      javax.xml.ws.spi.Provider.createAndPublishEndpoint(java.lang.String,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createAndPublishEndpoint_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createServiceDelegate(java.net.URL, javax.xml.namespace.QName, Class, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.spi.ServiceDelegate
     * javax.xml.ws.spi.Provider.createServiceDelegate(java.net.URL,javax.xml.namespace.QName,java.lang.Class<? extends
     * javax.xml.ws.Service>,javax.xml.ws.WebServiceFeature...)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createServiceDelegate(java.net.URL, javax.xml.namespace.QName, Class, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.spi.ServiceDelegate
     * javax.xml.ws.spi.Provider.createServiceDelegate(java.net.URL,javax.xml.namespace.QName,java.lang.Class,javax.xml.ws.WebServiceFeature...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#createServiceDelegate(java.net.URL, javax.xml.namespace.QName, Class,
     *      javax.xml.ws.WebServiceFeature...) public javax.xml.ws.spi.ServiceDelegate
     *      javax.xml.ws.spi.Provider.createServiceDelegate(java.net.URL,javax.xml.namespace.QName,java.lang.Class,javax
     *      .xml.ws.WebServiceFeature[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createServiceDelegate_URL_QName_Class_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createServiceDelegate(java.net.URL, javax.xml.namespace.QName, Class) public
     * abstract javax.xml.ws.spi.ServiceDelegate
     * javax.xml.ws.spi.Provider.createServiceDelegate(java.net.URL,javax.xml.namespace.QName,java.lang.Class<? extends
     * javax.xml.ws.Service>)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createServiceDelegate(java.net.URL, javax.xml.namespace.QName, Class) public
     * abstract javax.xml.ws.spi.ServiceDelegate
     * javax.xml.ws.spi.Provider.createServiceDelegate(java.net.URL,javax.xml.namespace.QName,java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#createServiceDelegate(java.net.URL, javax.xml.namespace.QName, Class) public
     *      abstract javax.xml.ws.spi.ServiceDelegate
     *      javax.xml.ws.spi.Provider.createServiceDelegate(java.net.URL,javax.xml.namespace.QName,java.lang.Class) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createServiceDelegate_URL_QName_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.Provider#readEndpointReference(javax.xml.transform.Source) public
     * abstract javax.xml.ws.EndpointReference
     * javax.xml.ws.spi.Provider.readEndpointReference(javax.xml.transform.Source)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.spi.Provider#readEndpointReference(javax.xml.transform.Source) public
     * abstract javax.xml.ws.EndpointReference
     * javax.xml.ws.spi.Provider.readEndpointReference(javax.xml.transform.Source)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#readEndpointReference(javax.xml.transform.Source) public abstract
     *      javax.xml.ws.EndpointReference javax.xml.ws.spi.Provider.readEndpointReference(javax.xml.transform.Source)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readEndpointReference_Source()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createW3CEndpointReference(String, javax.xml.namespace.QName, javax.xml.namespace.QName, java.util.List, String, java.util.List)
     * public abstract javax.xml.ws.wsaddressing.W3CEndpointReference
     * javax.xml.ws.spi.Provider.createW3CEndpointReference(java.lang.String,javax.xml.namespace.QName,javax.xml.namespace.QName,java.util.List
     * <org.w3c.dom.Element>,java.lang.String,java.util.List<org.w3c.dom.Element>)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createW3CEndpointReference(String, javax.xml.namespace.QName, javax.xml.namespace.QName, java.util.List, String, java.util.List)
     * public abstract javax.xml.ws.wsaddressing.W3CEndpointReference
     * javax.xml.ws.spi.Provider.createW3CEndpointReference(java.lang.String,javax.xml.namespace.QName,javax.xml.namespace.QName,java.util.List,java.lang.String,java.util.List)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#createW3CEndpointReference(String, javax.xml.namespace.QName,
     *      javax.xml.namespace.QName, java.util.List, String, java.util.List) public abstract
     *      javax.xml.ws.wsaddressing.W3CEndpointReference
     *      javax.xml.ws.spi.Provider.createW3CEndpointReference(java.lang.String,javax.xml.namespace.QName,javax.xml.
     *      namespace.QName,java.util.List,java.lang.String,java.util.List) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createW3CEndpointReference_String_QName_QName_List_String_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createW3CEndpointReference(String, javax.xml.namespace.QName, javax.xml.namespace.QName, javax.xml.namespace.QName, java.util.List, String, java.util.List, java.util.List, java.util.Map)
     * public javax.xml.ws.wsaddressing.W3CEndpointReference
     * javax.xml.ws.spi.Provider.createW3CEndpointReference(java.lang.String,javax.xml.namespace.QName,javax.xml.namespace.QName,javax.xml.namespace.QName,java.util.List
     * <org.w3c.dom.Element>,java.lang.String,java.util.List<org.w3c.dom.Element>,java.util.List
     * <org.w3c.dom.Element>,java.util.Map<javax.xml.namespace.QName, java.lang.String>)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.ws.spi.Provider#createW3CEndpointReference(String, javax.xml.namespace.QName, javax.xml.namespace.QName, javax.xml.namespace.QName, java.util.List, String, java.util.List, java.util.List, java.util.Map)
     * public javax.xml.ws.wsaddressing.W3CEndpointReference
     * javax.xml.ws.spi.Provider.createW3CEndpointReference(java.lang.String,javax.xml.namespace.QName,javax.xml.namespace.QName,javax.xml.namespace.QName,java.util.List,java.lang.String,java.util.List,java.util.List,java.util.Map)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Provider#createW3CEndpointReference(String, javax.xml.namespace.QName,
     *      javax.xml.namespace.QName, javax.xml.namespace.QName, java.util.List, String, java.util.List,
     *      java.util.List, java.util.Map) public javax.xml.ws.wsaddressing.W3CEndpointReference
     *      javax.xml.ws.spi.Provider.createW3CEndpointReference(java.lang.String,javax.xml.namespace.QName,javax.xml.
     *      namespace.QName,javax.xml.namespace.QName,java.util.List,java.lang.String,java.util.List,java.util.List,java
     *      .util.Map) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createW3CEndpointReference_String_QName_QName_QName_List_String_List_List_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
