package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.bind.annotation.W3CDomHandler class javax.xml.bind.annotation.W3CDomHandler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.annotation.W3CDomHandlerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface W3CDomHandlerTests<SUT extends javax.xml.bind.annotation.W3CDomHandler>
extends org.j8unit.repository.javax.xml.bind.annotation.DomHandlerTests<SUT, org.w3c.dom.Element, javax.xml.transform.dom.DOMResult>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.bind.annotation.W3CDomHandler#createUnmarshaller(javax.xml.bind.ValidationEventHandler) public
     * javax.xml.transform.dom.DOMResult
     * javax.xml.bind.annotation.W3CDomHandler.createUnmarshaller(javax.xml.bind.ValidationEventHandler)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createUnmarshaller_ValidationEventHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.W3CDomHandler#getBuilder() public
     * javax.xml.parsers.DocumentBuilder javax.xml.bind.annotation.W3CDomHandler.getBuilder()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBuilder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.W3CDomHandler#getElement(javax.xml.transform.dom.DOMResult)
     * public org.w3c.dom.Element javax.xml.bind.annotation.W3CDomHandler.getElement(javax.xml.transform.dom.DOMResult)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElement_DOMResult()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.bind.annotation.W3CDomHandler#marshal(org.w3c.dom.Element,javax.xml.bind.ValidationEventHandler)
     * public javax.xml.transform.Source
     * javax.xml.bind.annotation.W3CDomHandler.marshal(org.w3c.dom.Element,javax.xml.bind.ValidationEventHandler)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Element_ValidationEventHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.W3CDomHandler#setBuilder(javax.xml.parsers.DocumentBuilder)
     * public void javax.xml.bind.annotation.W3CDomHandler.setBuilder(javax.xml.parsers.DocumentBuilder)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBuilder_DocumentBuilder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
