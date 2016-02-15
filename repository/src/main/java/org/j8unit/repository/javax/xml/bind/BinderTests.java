package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.Binder class javax.xml.bind.Binder}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link BinderClassTests}.
 * </p>
 *
 * @see javax.xml.bind.Binder class javax.xml.bind.Binder (the hereby targeted class-under-test class)
 * @see BinderClassTests BinderClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BinderTests<SUT extends javax.xml.bind.Binder<XmlNode>, XmlNode>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getEventHandler() public abstract
     * javax.xml.bind.ValidationEventHandler javax.xml.bind.Binder.getEventHandler() throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getEventHandler() public abstract
     * javax.xml.bind.ValidationEventHandler javax.xml.bind.Binder.getEventHandler() throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#getEventHandler() public abstract javax.xml.bind.ValidationEventHandler
     *      javax.xml.bind.Binder.getEventHandler() throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEventHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getJAXBNode(Object) public abstract java.lang.Object
     * javax.xml.bind.Binder.getJAXBNode(XmlNode)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getJAXBNode(Object) public abstract java.lang.Object
     * javax.xml.bind.Binder.getJAXBNode(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#getJAXBNode(Object) public abstract java.lang.Object
     *      javax.xml.bind.Binder.getJAXBNode(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getJAXBNode_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getProperty(String) public abstract java.lang.Object
     * javax.xml.bind.Binder.getProperty(java.lang.String) throws javax.xml.bind.PropertyException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getProperty(String) public abstract java.lang.Object
     * javax.xml.bind.Binder.getProperty(java.lang.String) throws javax.xml.bind.PropertyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#getProperty(String) public abstract java.lang.Object
     *      javax.xml.bind.Binder.getProperty(java.lang.String) throws javax.xml.bind.PropertyException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProperty_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getSchema() public abstract javax.xml.validation.Schema
     * javax.xml.bind.Binder.getSchema()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getSchema() public abstract javax.xml.validation.Schema
     * javax.xml.bind.Binder.getSchema()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#getSchema() public abstract javax.xml.validation.Schema
     *      javax.xml.bind.Binder.getSchema() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSchema()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#setSchema(javax.xml.validation.Schema) public abstract void
     * javax.xml.bind.Binder.setSchema(javax.xml.validation.Schema)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#setSchema(javax.xml.validation.Schema) public abstract void
     * javax.xml.bind.Binder.setSchema(javax.xml.validation.Schema)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#setSchema(javax.xml.validation.Schema) public abstract void
     *      javax.xml.bind.Binder.setSchema(javax.xml.validation.Schema) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSchema_Schema()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#setProperty(String, Object) public abstract void
     * javax.xml.bind.Binder.setProperty(java.lang.String,java.lang.Object) throws javax.xml.bind.PropertyException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#setProperty(String, Object) public abstract void
     * javax.xml.bind.Binder.setProperty(java.lang.String,java.lang.Object) throws javax.xml.bind.PropertyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#setProperty(String, Object) public abstract void
     *      javax.xml.bind.Binder.setProperty(java.lang.String,java.lang.Object) throws javax.xml.bind.PropertyException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setProperty_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#marshal(Object, Object) public abstract void
     * javax.xml.bind.Binder.marshal(java.lang.Object,XmlNode) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#marshal(Object, Object) public abstract void
     * javax.xml.bind.Binder.marshal(java.lang.Object,java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#marshal(Object, Object) public abstract void
     *      javax.xml.bind.Binder.marshal(java.lang.Object,java.lang.Object) throws javax.xml.bind.JAXBException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#unmarshal(Object, Class) public abstract
     * <T> javax.xml.bind.JAXBElement<T> javax.xml.bind.Binder.unmarshal(XmlNode,java.lang.Class<T>) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#unmarshal(Object, Class) public abstract javax.xml.bind.JAXBElement
     * javax.xml.bind.Binder.unmarshal(java.lang.Object,java.lang.Class) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#unmarshal(Object, Class) public abstract javax.xml.bind.JAXBElement
     *      javax.xml.bind.Binder.unmarshal(java.lang.Object,java.lang.Class) throws javax.xml.bind.JAXBException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_Object_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#unmarshal(Object) public abstract java.lang.Object
     * javax.xml.bind.Binder.unmarshal(XmlNode) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#unmarshal(Object) public abstract java.lang.Object
     * javax.xml.bind.Binder.unmarshal(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#unmarshal(Object) public abstract java.lang.Object
     *      javax.xml.bind.Binder.unmarshal(java.lang.Object) throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getXMLNode(Object) public abstract XmlNode
     * javax.xml.bind.Binder.getXMLNode(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#getXMLNode(Object) public abstract java.lang.Object
     * javax.xml.bind.Binder.getXMLNode(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#getXMLNode(Object) public abstract java.lang.Object
     *      javax.xml.bind.Binder.getXMLNode(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXMLNode_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#updateXML(Object) public abstract XmlNode
     * javax.xml.bind.Binder.updateXML(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#updateXML(Object) public abstract java.lang.Object
     * javax.xml.bind.Binder.updateXML(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#updateXML(Object) public abstract java.lang.Object
     *      javax.xml.bind.Binder.updateXML(java.lang.Object) throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateXML_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#updateXML(Object, Object) public abstract XmlNode
     * javax.xml.bind.Binder.updateXML(java.lang.Object,XmlNode) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#updateXML(Object, Object) public abstract java.lang.Object
     * javax.xml.bind.Binder.updateXML(java.lang.Object,java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#updateXML(Object, Object) public abstract java.lang.Object
     *      javax.xml.bind.Binder.updateXML(java.lang.Object,java.lang.Object) throws javax.xml.bind.JAXBException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateXML_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#updateJAXB(Object) public abstract java.lang.Object
     * javax.xml.bind.Binder.updateJAXB(XmlNode) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#updateJAXB(Object) public abstract java.lang.Object
     * javax.xml.bind.Binder.updateJAXB(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#updateJAXB(Object) public abstract java.lang.Object
     *      javax.xml.bind.Binder.updateJAXB(java.lang.Object) throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateJAXB_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Binder#setEventHandler(javax.xml.bind.ValidationEventHandler) public
     * abstract void javax.xml.bind.Binder.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Binder#setEventHandler(javax.xml.bind.ValidationEventHandler) public
     * abstract void javax.xml.bind.Binder.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Binder#setEventHandler(javax.xml.bind.ValidationEventHandler) public abstract void
     *      javax.xml.bind.Binder.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     *      javax.xml.bind.JAXBException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEventHandler_ValidationEventHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
