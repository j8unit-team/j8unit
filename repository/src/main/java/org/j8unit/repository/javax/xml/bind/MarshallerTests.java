package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.Marshaller interface javax.xml.bind.Marshaller}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MarshallerClassTests}.
 * </p>
 *
 * @see javax.xml.bind.Marshaller interface javax.xml.bind.Marshaller (the hereby targeted class-under-test class)
 * @see MarshallerClassTests MarshallerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MarshallerTests<SUT extends javax.xml.bind.Marshaller>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setSchema(javax.xml.validation.Schema) public abstract void
     * javax.xml.bind.Marshaller.setSchema(javax.xml.validation.Schema)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setSchema(javax.xml.validation.Schema) public abstract void
     * javax.xml.bind.Marshaller.setSchema(javax.xml.validation.Schema)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#setSchema(javax.xml.validation.Schema) public abstract void
     *      javax.xml.bind.Marshaller.setSchema(javax.xml.validation.Schema) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, org.w3c.dom.Node) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,org.w3c.dom.Node) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, org.w3c.dom.Node) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,org.w3c.dom.Node) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#marshal(Object, org.w3c.dom.Node) public abstract void
     *      javax.xml.bind.Marshaller.marshal(java.lang.Object,org.w3c.dom.Node) throws javax.xml.bind.JAXBException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_Node()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, javax.xml.stream.XMLStreamWriter) public
     * abstract void javax.xml.bind.Marshaller.marshal(java.lang.Object,javax.xml.stream.XMLStreamWriter) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, javax.xml.stream.XMLStreamWriter) public
     * abstract void javax.xml.bind.Marshaller.marshal(java.lang.Object,javax.xml.stream.XMLStreamWriter) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#marshal(Object, javax.xml.stream.XMLStreamWriter) public abstract void
     *      javax.xml.bind.Marshaller.marshal(java.lang.Object,javax.xml.stream.XMLStreamWriter) throws
     *      javax.xml.bind.JAXBException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_XMLStreamWriter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, javax.xml.stream.XMLEventWriter) public abstract
     * void javax.xml.bind.Marshaller.marshal(java.lang.Object,javax.xml.stream.XMLEventWriter) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, javax.xml.stream.XMLEventWriter) public abstract
     * void javax.xml.bind.Marshaller.marshal(java.lang.Object,javax.xml.stream.XMLEventWriter) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#marshal(Object, javax.xml.stream.XMLEventWriter) public abstract void
     *      javax.xml.bind.Marshaller.marshal(java.lang.Object,javax.xml.stream.XMLEventWriter) throws
     *      javax.xml.bind.JAXBException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_XMLEventWriter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, javax.xml.transform.Result) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,javax.xml.transform.Result) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, javax.xml.transform.Result) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,javax.xml.transform.Result) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#marshal(Object, javax.xml.transform.Result) public abstract void
     *      javax.xml.bind.Marshaller.marshal(java.lang.Object,javax.xml.transform.Result) throws
     *      javax.xml.bind.JAXBException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_Result()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, java.io.OutputStream) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,java.io.OutputStream) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, java.io.OutputStream) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,java.io.OutputStream) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#marshal(Object, java.io.OutputStream) public abstract void
     *      javax.xml.bind.Marshaller.marshal(java.lang.Object,java.io.OutputStream) throws javax.xml.bind.JAXBException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, java.io.File) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,java.io.File) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, java.io.File) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,java.io.File) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#marshal(Object, java.io.File) public abstract void
     *      javax.xml.bind.Marshaller.marshal(java.lang.Object,java.io.File) throws javax.xml.bind.JAXBException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, java.io.Writer) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,java.io.Writer) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, java.io.Writer) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,java.io.Writer) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#marshal(Object, java.io.Writer) public abstract void
     *      javax.xml.bind.Marshaller.marshal(java.lang.Object,java.io.Writer) throws javax.xml.bind.JAXBException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_Writer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, org.xml.sax.ContentHandler) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,org.xml.sax.ContentHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#marshal(Object, org.xml.sax.ContentHandler) public abstract void
     * javax.xml.bind.Marshaller.marshal(java.lang.Object,org.xml.sax.ContentHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#marshal(Object, org.xml.sax.ContentHandler) public abstract void
     *      javax.xml.bind.Marshaller.marshal(java.lang.Object,org.xml.sax.ContentHandler) throws
     *      javax.xml.bind.JAXBException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_ContentHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getAttachmentMarshaller() public abstract
     * javax.xml.bind.attachment.AttachmentMarshaller javax.xml.bind.Marshaller.getAttachmentMarshaller()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getAttachmentMarshaller() public abstract
     * javax.xml.bind.attachment.AttachmentMarshaller javax.xml.bind.Marshaller.getAttachmentMarshaller()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#getAttachmentMarshaller() public abstract
     *      javax.xml.bind.attachment.AttachmentMarshaller javax.xml.bind.Marshaller.getAttachmentMarshaller() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttachmentMarshaller()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getEventHandler() public abstract
     * javax.xml.bind.ValidationEventHandler javax.xml.bind.Marshaller.getEventHandler() throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getEventHandler() public abstract
     * javax.xml.bind.ValidationEventHandler javax.xml.bind.Marshaller.getEventHandler() throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#getEventHandler() public abstract javax.xml.bind.ValidationEventHandler
     *      javax.xml.bind.Marshaller.getEventHandler() throws javax.xml.bind.JAXBException (the hereby targeted
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
     * Test method for {@link javax.xml.bind.Marshaller#setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter) public
     * abstract void javax.xml.bind.Marshaller.setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter) public
     * abstract void javax.xml.bind.Marshaller.setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter) public abstract void
     *      javax.xml.bind.Marshaller.setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAdapter_XmlAdapter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setAdapter(Class, javax.xml.bind.annotation.adapters.XmlAdapter)
     * public abstract <A> void javax.xml.bind.Marshaller.setAdapter(java.lang.Class<A>,A)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setAdapter(Class, javax.xml.bind.annotation.adapters.XmlAdapter)
     * public abstract void
     * javax.xml.bind.Marshaller.setAdapter(java.lang.Class,javax.xml.bind.annotation.adapters.XmlAdapter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#setAdapter(Class, javax.xml.bind.annotation.adapters.XmlAdapter) public abstract
     *      void javax.xml.bind.Marshaller.setAdapter(java.lang.Class,javax.xml.bind.annotation.adapters.XmlAdapter)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAdapter_Class_XmlAdapter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getProperty(String) public abstract java.lang.Object
     * javax.xml.bind.Marshaller.getProperty(java.lang.String) throws javax.xml.bind.PropertyException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getProperty(String) public abstract java.lang.Object
     * javax.xml.bind.Marshaller.getProperty(java.lang.String) throws javax.xml.bind.PropertyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#getProperty(String) public abstract java.lang.Object
     *      javax.xml.bind.Marshaller.getProperty(java.lang.String) throws javax.xml.bind.PropertyException (the hereby
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
     * Test method for {@link javax.xml.bind.Marshaller#getAdapter(Class) public abstract <A> A
     * javax.xml.bind.Marshaller.getAdapter(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getAdapter(Class) public abstract
     * javax.xml.bind.annotation.adapters.XmlAdapter javax.xml.bind.Marshaller.getAdapter(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#getAdapter(Class) public abstract javax.xml.bind.annotation.adapters.XmlAdapter
     *      javax.xml.bind.Marshaller.getAdapter(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAdapter_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getSchema() public abstract javax.xml.validation.Schema
     * javax.xml.bind.Marshaller.getSchema()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getSchema() public abstract javax.xml.validation.Schema
     * javax.xml.bind.Marshaller.getSchema()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#getSchema() public abstract javax.xml.validation.Schema
     *      javax.xml.bind.Marshaller.getSchema() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.bind.Marshaller#setProperty(String, Object) public abstract void
     * javax.xml.bind.Marshaller.setProperty(java.lang.String,java.lang.Object) throws javax.xml.bind.PropertyException}
     * .
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setProperty(String, Object) public abstract void
     * javax.xml.bind.Marshaller.setProperty(java.lang.String,java.lang.Object) throws javax.xml.bind.PropertyException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#setProperty(String, Object) public abstract void
     *      javax.xml.bind.Marshaller.setProperty(java.lang.String,java.lang.Object) throws
     *      javax.xml.bind.PropertyException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.bind.Marshaller#getListener() public abstract javax.xml.bind.Marshaller$Listener
     * javax.xml.bind.Marshaller.getListener()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getListener() public abstract javax.xml.bind.Marshaller$Listener
     * javax.xml.bind.Marshaller.getListener()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#getListener() public abstract javax.xml.bind.Marshaller$Listener
     *      javax.xml.bind.Marshaller.getListener() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getNode(Object) public abstract org.w3c.dom.Node
     * javax.xml.bind.Marshaller.getNode(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#getNode(Object) public abstract org.w3c.dom.Node
     * javax.xml.bind.Marshaller.getNode(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#getNode(Object) public abstract org.w3c.dom.Node
     *      javax.xml.bind.Marshaller.getNode(java.lang.Object) throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNode_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setEventHandler(javax.xml.bind.ValidationEventHandler) public
     * abstract void javax.xml.bind.Marshaller.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setEventHandler(javax.xml.bind.ValidationEventHandler) public
     * abstract void javax.xml.bind.Marshaller.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#setEventHandler(javax.xml.bind.ValidationEventHandler) public abstract void
     *      javax.xml.bind.Marshaller.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
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

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setListener(javax.xml.bind.Marshaller.Listener) public abstract
     * void javax.xml.bind.Marshaller.setListener(javax.xml.bind.Marshaller$Listener)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Marshaller#setListener(javax.xml.bind.Marshaller.Listener) public abstract
     * void javax.xml.bind.Marshaller.setListener(javax.xml.bind.Marshaller$Listener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#setListener(javax.xml.bind.Marshaller.Listener) public abstract void
     *      javax.xml.bind.Marshaller.setListener(javax.xml.bind.Marshaller$Listener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setListener_Listener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.bind.Marshaller#setAttachmentMarshaller(javax.xml.bind.attachment.AttachmentMarshaller) public
     * abstract void javax.xml.bind.Marshaller.setAttachmentMarshaller(javax.xml.bind.attachment.AttachmentMarshaller)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.bind.Marshaller#setAttachmentMarshaller(javax.xml.bind.attachment.AttachmentMarshaller) public
     * abstract void javax.xml.bind.Marshaller.setAttachmentMarshaller(javax.xml.bind.attachment.AttachmentMarshaller)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Marshaller#setAttachmentMarshaller(javax.xml.bind.attachment.AttachmentMarshaller) public
     *      abstract void
     *      javax.xml.bind.Marshaller.setAttachmentMarshaller(javax.xml.bind.attachment.AttachmentMarshaller) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttachmentMarshaller_AttachmentMarshaller()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.xml.bind.Marshaller.Listener class
     * javax.xml.bind.Marshaller$Listener}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link MarshallerClassTests.ListenerClassTests}.
     * </p>
     *
     * @see javax.xml.bind.Marshaller.Listener class javax.xml.bind.Marshaller$Listener (the hereby targeted
     *      class-under-test class)
     * @see MarshallerClassTests.ListenerClassTests MarshallerClassTests.ListenerClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ListenerTests<SUT extends javax.xml.bind.Marshaller.Listener>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.bind.Marshaller.Listener#afterMarshal(Object) public void
         * javax.xml.bind.Marshaller$Listener.afterMarshal(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.xml.bind.Marshaller.Listener#afterMarshal(Object) public void
         * javax.xml.bind.Marshaller$Listener.afterMarshal(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.bind.Marshaller.Listener#afterMarshal(Object) public void
         *      javax.xml.bind.Marshaller$Listener.afterMarshal(java.lang.Object) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_afterMarshal_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.bind.Marshaller.Listener#beforeMarshal(Object) public void
         * javax.xml.bind.Marshaller$Listener.beforeMarshal(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.xml.bind.Marshaller.Listener#beforeMarshal(Object) public void
         * javax.xml.bind.Marshaller$Listener.beforeMarshal(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.bind.Marshaller.Listener#beforeMarshal(Object) public void
         *      javax.xml.bind.Marshaller$Listener.beforeMarshal(java.lang.Object) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_beforeMarshal_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
