package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.EndpointReference class javax.xml.ws.EndpointReference}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link EndpointReferenceClassTests}.
 * </p>
 *
 * @see javax.xml.ws.EndpointReference class javax.xml.ws.EndpointReference (the hereby targeted class-under-test class)
 * @see EndpointReferenceClassTests EndpointReferenceClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EndpointReferenceTests<SUT extends javax.xml.ws.EndpointReference>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.EndpointReference#writeTo(javax.xml.transform.Result) public abstract void
     * javax.xml.ws.EndpointReference.writeTo(javax.xml.transform.Result)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.EndpointReference#writeTo(javax.xml.transform.Result) public abstract void
     * javax.xml.ws.EndpointReference.writeTo(javax.xml.transform.Result)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.EndpointReference#writeTo(javax.xml.transform.Result) public abstract void
     *      javax.xml.ws.EndpointReference.writeTo(javax.xml.transform.Result) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeTo_Result()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.EndpointReference#getPort(Class, javax.xml.ws.WebServiceFeature...) public
     * <T> T javax.xml.ws.EndpointReference.getPort(java.lang.Class<T>,javax.xml.ws.WebServiceFeature...)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.EndpointReference#getPort(Class, javax.xml.ws.WebServiceFeature...) public
     * java.lang.Object javax.xml.ws.EndpointReference.getPort(java.lang.Class,javax.xml.ws.WebServiceFeature...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.EndpointReference#getPort(Class, javax.xml.ws.WebServiceFeature...) public java.lang.Object
     *      javax.xml.ws.EndpointReference.getPort(java.lang.Class,javax.xml.ws.WebServiceFeature[]) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.xml.ws.EndpointReference#toString() public java.lang.String
     * javax.xml.ws.EndpointReference.toString()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.EndpointReference#toString() public java.lang.String
     * javax.xml.ws.EndpointReference.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.EndpointReference#toString() public java.lang.String javax.xml.ws.EndpointReference.toString()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
