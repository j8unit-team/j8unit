package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.WebServiceClient interface javax.xml.ws.WebServiceClient}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link WebServiceClientClassTests}.
 * </p>
 *
 * @see javax.xml.ws.WebServiceClient interface javax.xml.ws.WebServiceClient (the hereby targeted class-under-test
 *      class)
 * @see WebServiceClientClassTests WebServiceClientClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WebServiceClientTests<SUT extends javax.xml.ws.WebServiceClient>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceClient#targetNamespace() public abstract java.lang.String
     * javax.xml.ws.WebServiceClient.targetNamespace()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceClient#targetNamespace() public abstract java.lang.String
     * javax.xml.ws.WebServiceClient.targetNamespace()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceClient#targetNamespace() public abstract java.lang.String
     *      javax.xml.ws.WebServiceClient.targetNamespace() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_targetNamespace()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceClient#wsdlLocation() public abstract java.lang.String
     * javax.xml.ws.WebServiceClient.wsdlLocation()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceClient#wsdlLocation() public abstract java.lang.String
     * javax.xml.ws.WebServiceClient.wsdlLocation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceClient#wsdlLocation() public abstract java.lang.String
     *      javax.xml.ws.WebServiceClient.wsdlLocation() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wsdlLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceClient#name() public abstract java.lang.String
     * javax.xml.ws.WebServiceClient.name()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceClient#name() public abstract java.lang.String
     * javax.xml.ws.WebServiceClient.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceClient#name() public abstract java.lang.String javax.xml.ws.WebServiceClient.name()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
