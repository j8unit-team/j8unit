package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.soap.AddressingFeature class javax.xml.ws.soap.AddressingFeature}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AddressingFeatureTests<SUT extends javax.xml.ws.soap.AddressingFeature>
extends org.j8unit.repository.javax.xml.ws.WebServiceFeatureTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.xml.ws.soap.AddressingFeature$Responses class
     * javax.xml.ws.soap.AddressingFeature$Responses}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureClassTests.ResponsesClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ResponsesTests<SUT extends javax.xml.ws.soap.AddressingFeature.Responses>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.xml.ws.soap.AddressingFeature.Responses> {

    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.AddressingFeature#getID() public java.lang.String
     * javax.xml.ws.soap.AddressingFeature.getID()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.AddressingFeature#getResponses() public
     * javax.xml.ws.soap.AddressingFeature$Responses javax.xml.ws.soap.AddressingFeature.getResponses()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResponses()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.AddressingFeature#isRequired() public boolean
     * javax.xml.ws.soap.AddressingFeature.isRequired()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRequired()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
