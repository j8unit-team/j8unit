package org.j8unit.repository.javax.xml.ws.spi;

import javax.xml.ws.spi.Provider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Provider public
 * abstract class javax.xml.ws.spi.Provider}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.ws.spi.ProviderClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProviderTests<SUT extends Provider>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.spi.Provider]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#createEndpoint(String, Object) public abstract javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Object)}.
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
    public default void test_createEndpoint_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#createEndpoint(String, Class, javax.xml.ws.spi.Invoker, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Class<?>,javax.xml.ws.spi.Invoker,javax.xml.ws.WebServiceFeature...)}.
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
    public default void test_createEndpoint_String_Class_Invoker_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#createEndpoint(String, Object, javax.xml.ws.WebServiceFeature...) public
     * javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createEndpoint(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...)}.
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
    public default void test_createEndpoint_String_Object_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#getPort(javax.xml.ws.EndpointReference, Class, javax.xml.ws.WebServiceFeature...)
     * public abstract <T> T
     * javax.xml.ws.spi.Provider.getPort(javax.xml.ws.EndpointReference,java.lang.Class<T>,javax.xml.ws.WebServiceFeature...)}.
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
    public default void test_getPort_EndpointReference_Class_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#createAndPublishEndpoint(String, Object, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createAndPublishEndpoint(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...)}.
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
    public default void test_createAndPublishEndpoint_String_Object_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#createAndPublishEndpoint(String, Object) public abstract javax.xml.ws.Endpoint
     * javax.xml.ws.spi.Provider.createAndPublishEndpoint(java.lang.String,java.lang.Object)}.
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
    public default void test_createAndPublishEndpoint_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#createServiceDelegate(java.net.URL, javax.xml.namespace.QName, Class) public
     * abstract javax.xml.ws.spi.ServiceDelegate
     * javax.xml.ws.spi.Provider.createServiceDelegate(java.net.URL,javax.xml.namespace.QName,java.lang.Class<? extends
     * javax.xml.ws.Service>)}.
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
    public default void test_createServiceDelegate_URL_QName_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#createServiceDelegate(java.net.URL, javax.xml.namespace.QName, Class, javax.xml.ws.WebServiceFeature...)
     * public javax.xml.ws.spi.ServiceDelegate
     * javax.xml.ws.spi.Provider.createServiceDelegate(java.net.URL,javax.xml.namespace.QName,java.lang.Class<? extends
     * javax.xml.ws.Service>,javax.xml.ws.WebServiceFeature...)}.
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
    public default void test_createServiceDelegate_URL_QName_Class_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#readEndpointReference(javax.xml.transform.Source) public abstract
     * javax.xml.ws.EndpointReference javax.xml.ws.spi.Provider.readEndpointReference(javax.xml.transform.Source)}.
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
    public default void test_readEndpointReference_Source()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#createW3CEndpointReference(String, javax.xml.namespace.QName, javax.xml.namespace.QName, javax.xml.namespace.QName, java.util.List, String, java.util.List, java.util.List, java.util.Map)
     * public javax.xml.ws.wsaddressing.W3CEndpointReference
     * javax.xml.ws.spi.Provider.createW3CEndpointReference(java.lang.String,javax.xml.namespace.QName,javax.xml.namespace.QName,javax.xml.namespace.QName,java.util.List<org.w3c.dom.Element>,java.lang.String,java.util.List<org.w3c.dom.Element>,java.util.List<org.w3c.dom.Element>,java.util.Map<javax.xml.namespace.QName,
     * java.lang.String>)}.
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
    public default void test_createW3CEndpointReference_String_QName_QName_QName_List_String_List_List_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.spi.Provider#createW3CEndpointReference(String, javax.xml.namespace.QName, javax.xml.namespace.QName, java.util.List, String, java.util.List)
     * public abstract javax.xml.ws.wsaddressing.W3CEndpointReference
     * javax.xml.ws.spi.Provider.createW3CEndpointReference(java.lang.String,javax.xml.namespace.QName,javax.xml.namespace.QName,java.util.List<org.w3c.dom.Element>,java.lang.String,java.util.List<org.w3c.dom.Element>)}.
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
    public default void test_createW3CEndpointReference_String_QName_QName_List_String_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.spi.Provider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.spi.Provider]
}
