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
 * non-{@code static} methods) of {@linkplain javax.xml.bind.Unmarshaller interface javax.xml.bind.Unmarshaller}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link UnmarshallerClassTests}.
 * </p>
 *
 * @see javax.xml.bind.Unmarshaller interface javax.xml.bind.Unmarshaller (the hereby targeted class-under-test class)
 * @see UnmarshallerClassTests UnmarshallerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnmarshallerTests<SUT extends javax.xml.bind.Unmarshaller>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#getAdapter(Class) public abstract <A> A
     * javax.xml.bind.Unmarshaller.getAdapter(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#getAdapter(Class) public abstract
     * javax.xml.bind.annotation.adapters.XmlAdapter javax.xml.bind.Unmarshaller.getAdapter(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#getAdapter(Class) public abstract javax.xml.bind.annotation.adapters.XmlAdapter
     *      javax.xml.bind.Unmarshaller.getAdapter(java.lang.Class) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.bind.Unmarshaller#getProperty(String) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.getProperty(java.lang.String) throws javax.xml.bind.PropertyException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#getProperty(String) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.getProperty(java.lang.String) throws javax.xml.bind.PropertyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#getProperty(String) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.getProperty(java.lang.String) throws javax.xml.bind.PropertyException (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.bind.Unmarshaller#getEventHandler() public abstract
     * javax.xml.bind.ValidationEventHandler javax.xml.bind.Unmarshaller.getEventHandler() throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#getEventHandler() public abstract
     * javax.xml.bind.ValidationEventHandler javax.xml.bind.Unmarshaller.getEventHandler() throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#getEventHandler() public abstract javax.xml.bind.ValidationEventHandler
     *      javax.xml.bind.Unmarshaller.getEventHandler() throws javax.xml.bind.JAXBException (the hereby targeted
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
     * Test method for {@link javax.xml.bind.Unmarshaller#setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter)
     * public abstract void javax.xml.bind.Unmarshaller.setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter)
     * public abstract void javax.xml.bind.Unmarshaller.setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter) public abstract void
     *      javax.xml.bind.Unmarshaller.setAdapter(javax.xml.bind.annotation.adapters.XmlAdapter) (the hereby targeted
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
     * Test method for
     * {@link javax.xml.bind.Unmarshaller#setAdapter(Class, javax.xml.bind.annotation.adapters.XmlAdapter) public
     * abstract <A> void javax.xml.bind.Unmarshaller.setAdapter(java.lang.Class<A>,A)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.bind.Unmarshaller#setAdapter(Class, javax.xml.bind.annotation.adapters.XmlAdapter) public
     * abstract void
     * javax.xml.bind.Unmarshaller.setAdapter(java.lang.Class,javax.xml.bind.annotation.adapters.XmlAdapter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#setAdapter(Class, javax.xml.bind.annotation.adapters.XmlAdapter) public abstract
     *      void javax.xml.bind.Unmarshaller.setAdapter(java.lang.Class,javax.xml.bind.annotation.adapters.XmlAdapter)
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
     * Test method for {@link javax.xml.bind.Unmarshaller#getSchema() public abstract javax.xml.validation.Schema
     * javax.xml.bind.Unmarshaller.getSchema()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#getSchema() public abstract javax.xml.validation.Schema
     * javax.xml.bind.Unmarshaller.getSchema()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#getSchema() public abstract javax.xml.validation.Schema
     *      javax.xml.bind.Unmarshaller.getSchema() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(java.net.URL) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.unmarshal(java.net.URL) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(java.net.URL) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.unmarshal(java.net.URL) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(java.net.URL) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.unmarshal(java.net.URL) throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLStreamReader, Class) public
     * abstract <T> javax.xml.bind.JAXBElement
     * <T> javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLStreamReader,java.lang.Class<T>) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLStreamReader, Class) public
     * abstract javax.xml.bind.JAXBElement
     * javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLStreamReader,java.lang.Class) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLStreamReader, Class) public abstract
     *      javax.xml.bind.JAXBElement
     *      javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLStreamReader,java.lang.Class) throws
     *      javax.xml.bind.JAXBException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_XMLStreamReader_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLStreamReader) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLStreamReader) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLStreamReader) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLStreamReader) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLStreamReader) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLStreamReader) throws javax.xml.bind.JAXBException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_XMLStreamReader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLEventReader) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLEventReader) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLEventReader) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLEventReader) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLEventReader) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLEventReader) throws javax.xml.bind.JAXBException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_XMLEventReader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLEventReader, Class) public
     * abstract <T> javax.xml.bind.JAXBElement
     * <T> javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLEventReader,java.lang.Class<T>) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLEventReader, Class) public
     * abstract javax.xml.bind.JAXBElement
     * javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLEventReader,java.lang.Class) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(javax.xml.stream.XMLEventReader, Class) public abstract
     *      javax.xml.bind.JAXBElement
     *      javax.xml.bind.Unmarshaller.unmarshal(javax.xml.stream.XMLEventReader,java.lang.Class) throws
     *      javax.xml.bind.JAXBException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_XMLEventReader_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.transform.Source, Class) public abstract
     * <T> javax.xml.bind.JAXBElement
     * <T> javax.xml.bind.Unmarshaller.unmarshal(javax.xml.transform.Source,java.lang.Class<T>) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.transform.Source, Class) public abstract
     * javax.xml.bind.JAXBElement javax.xml.bind.Unmarshaller.unmarshal(javax.xml.transform.Source,java.lang.Class)
     * throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(javax.xml.transform.Source, Class) public abstract
     *      javax.xml.bind.JAXBElement javax.xml.bind.Unmarshaller.unmarshal(javax.xml.transform.Source,java.lang.Class)
     *      throws javax.xml.bind.JAXBException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_Source_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(java.io.File) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.unmarshal(java.io.File) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(java.io.File) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.unmarshal(java.io.File) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(java.io.File) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.unmarshal(java.io.File) throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(org.xml.sax.InputSource) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(org.xml.sax.InputSource) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(org.xml.sax.InputSource) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(org.xml.sax.InputSource) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(org.xml.sax.InputSource) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.unmarshal(org.xml.sax.InputSource) throws javax.xml.bind.JAXBException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_InputSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(java.io.Reader) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.unmarshal(java.io.Reader) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(java.io.Reader) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.unmarshal(java.io.Reader) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(java.io.Reader) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.unmarshal(java.io.Reader) throws javax.xml.bind.JAXBException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_Reader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.transform.Source) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(javax.xml.transform.Source) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(javax.xml.transform.Source) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(javax.xml.transform.Source) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(javax.xml.transform.Source) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.unmarshal(javax.xml.transform.Source) throws javax.xml.bind.JAXBException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_Source()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(java.io.InputStream) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(java.io.InputStream) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(java.io.InputStream) public abstract
     * java.lang.Object javax.xml.bind.Unmarshaller.unmarshal(java.io.InputStream) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(java.io.InputStream) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.unmarshal(java.io.InputStream) throws javax.xml.bind.JAXBException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(org.w3c.dom.Node) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.unmarshal(org.w3c.dom.Node) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(org.w3c.dom.Node) public abstract java.lang.Object
     * javax.xml.bind.Unmarshaller.unmarshal(org.w3c.dom.Node) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(org.w3c.dom.Node) public abstract java.lang.Object
     *      javax.xml.bind.Unmarshaller.unmarshal(org.w3c.dom.Node) throws javax.xml.bind.JAXBException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_Node()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(org.w3c.dom.Node, Class) public abstract
     * <T> javax.xml.bind.JAXBElement<T> javax.xml.bind.Unmarshaller.unmarshal(org.w3c.dom.Node,java.lang.Class<T>)
     * throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#unmarshal(org.w3c.dom.Node, Class) public abstract
     * javax.xml.bind.JAXBElement javax.xml.bind.Unmarshaller.unmarshal(org.w3c.dom.Node,java.lang.Class) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#unmarshal(org.w3c.dom.Node, Class) public abstract javax.xml.bind.JAXBElement
     *      javax.xml.bind.Unmarshaller.unmarshal(org.w3c.dom.Node,java.lang.Class) throws javax.xml.bind.JAXBException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_Node_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#setProperty(String, Object) public abstract void
     * javax.xml.bind.Unmarshaller.setProperty(java.lang.String,java.lang.Object) throws
     * javax.xml.bind.PropertyException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#setProperty(String, Object) public abstract void
     * javax.xml.bind.Unmarshaller.setProperty(java.lang.String,java.lang.Object) throws
     * javax.xml.bind.PropertyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#setProperty(String, Object) public abstract void
     *      javax.xml.bind.Unmarshaller.setProperty(java.lang.String,java.lang.Object) throws
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
     * Test method for {@link javax.xml.bind.Unmarshaller#setListener(javax.xml.bind.Unmarshaller.Listener) public
     * abstract void javax.xml.bind.Unmarshaller.setListener(javax.xml.bind.Unmarshaller$Listener)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#setListener(javax.xml.bind.Unmarshaller.Listener) public
     * abstract void javax.xml.bind.Unmarshaller.setListener(javax.xml.bind.Unmarshaller$Listener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#setListener(javax.xml.bind.Unmarshaller.Listener) public abstract void
     *      javax.xml.bind.Unmarshaller.setListener(javax.xml.bind.Unmarshaller$Listener) (the hereby targeted
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
     * Test method for {@link javax.xml.bind.Unmarshaller#setEventHandler(javax.xml.bind.ValidationEventHandler) public
     * abstract void javax.xml.bind.Unmarshaller.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#setEventHandler(javax.xml.bind.ValidationEventHandler) public
     * abstract void javax.xml.bind.Unmarshaller.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#setEventHandler(javax.xml.bind.ValidationEventHandler) public abstract void
     *      javax.xml.bind.Unmarshaller.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
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
     * Test method for {@link javax.xml.bind.Unmarshaller#getListener() public abstract
     * javax.xml.bind.Unmarshaller$Listener javax.xml.bind.Unmarshaller.getListener()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#getListener() public abstract
     * javax.xml.bind.Unmarshaller$Listener javax.xml.bind.Unmarshaller.getListener()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#getListener() public abstract javax.xml.bind.Unmarshaller$Listener
     *      javax.xml.bind.Unmarshaller.getListener() (the hereby targeted method-under-test)
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
     * Test method for
     * {@link javax.xml.bind.Unmarshaller#setAttachmentUnmarshaller(javax.xml.bind.attachment.AttachmentUnmarshaller)
     * public abstract void
     * javax.xml.bind.Unmarshaller.setAttachmentUnmarshaller(javax.xml.bind.attachment.AttachmentUnmarshaller)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.bind.Unmarshaller#setAttachmentUnmarshaller(javax.xml.bind.attachment.AttachmentUnmarshaller)
     * public abstract void
     * javax.xml.bind.Unmarshaller.setAttachmentUnmarshaller(javax.xml.bind.attachment.AttachmentUnmarshaller)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#setAttachmentUnmarshaller(javax.xml.bind.attachment.AttachmentUnmarshaller)
     *      public abstract void
     *      javax.xml.bind.Unmarshaller.setAttachmentUnmarshaller(javax.xml.bind.attachment.AttachmentUnmarshaller) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttachmentUnmarshaller_AttachmentUnmarshaller()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#isValidating() public abstract boolean
     * javax.xml.bind.Unmarshaller.isValidating() throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#isValidating() public abstract boolean
     * javax.xml.bind.Unmarshaller.isValidating() throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#isValidating() public abstract boolean
     *      javax.xml.bind.Unmarshaller.isValidating() throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isValidating()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#setSchema(javax.xml.validation.Schema) public abstract void
     * javax.xml.bind.Unmarshaller.setSchema(javax.xml.validation.Schema)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#setSchema(javax.xml.validation.Schema) public abstract void
     * javax.xml.bind.Unmarshaller.setSchema(javax.xml.validation.Schema)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#setSchema(javax.xml.validation.Schema) public abstract void
     *      javax.xml.bind.Unmarshaller.setSchema(javax.xml.validation.Schema) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.bind.Unmarshaller#getAttachmentUnmarshaller() public abstract
     * javax.xml.bind.attachment.AttachmentUnmarshaller javax.xml.bind.Unmarshaller.getAttachmentUnmarshaller()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#getAttachmentUnmarshaller() public abstract
     * javax.xml.bind.attachment.AttachmentUnmarshaller javax.xml.bind.Unmarshaller.getAttachmentUnmarshaller()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#getAttachmentUnmarshaller() public abstract
     *      javax.xml.bind.attachment.AttachmentUnmarshaller javax.xml.bind.Unmarshaller.getAttachmentUnmarshaller()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttachmentUnmarshaller()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#setValidating(boolean) public abstract void
     * javax.xml.bind.Unmarshaller.setValidating(boolean) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#setValidating(boolean) public abstract void
     * javax.xml.bind.Unmarshaller.setValidating(boolean) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#setValidating(boolean) public abstract void
     *      javax.xml.bind.Unmarshaller.setValidating(boolean) throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setValidating_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#getUnmarshallerHandler() public abstract
     * javax.xml.bind.UnmarshallerHandler javax.xml.bind.Unmarshaller.getUnmarshallerHandler()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Unmarshaller#getUnmarshallerHandler() public abstract
     * javax.xml.bind.UnmarshallerHandler javax.xml.bind.Unmarshaller.getUnmarshallerHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller#getUnmarshallerHandler() public abstract javax.xml.bind.UnmarshallerHandler
     *      javax.xml.bind.Unmarshaller.getUnmarshallerHandler() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnmarshallerHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.xml.bind.Unmarshaller.Listener class
     * javax.xml.bind.Unmarshaller$Listener}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link UnmarshallerClassTests.ListenerClassTests}.
     * </p>
     *
     * @see javax.xml.bind.Unmarshaller.Listener class javax.xml.bind.Unmarshaller$Listener (the hereby targeted
     *      class-under-test class)
     * @see UnmarshallerClassTests.ListenerClassTests UnmarshallerClassTests.ListenerClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ListenerTests<SUT extends javax.xml.bind.Unmarshaller.Listener>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.bind.Unmarshaller.Listener#afterUnmarshal(Object, Object) public void
         * javax.xml.bind.Unmarshaller$Listener.afterUnmarshal(java.lang.Object,java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.xml.bind.Unmarshaller.Listener#afterUnmarshal(Object, Object) public void
         * javax.xml.bind.Unmarshaller$Listener.afterUnmarshal(java.lang.Object,java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.bind.Unmarshaller.Listener#afterUnmarshal(Object, Object) public void
         *      javax.xml.bind.Unmarshaller$Listener.afterUnmarshal(java.lang.Object,java.lang.Object) (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_afterUnmarshal_Object_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.bind.Unmarshaller.Listener#beforeUnmarshal(Object, Object) public void
         * javax.xml.bind.Unmarshaller$Listener.beforeUnmarshal(java.lang.Object,java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.xml.bind.Unmarshaller.Listener#beforeUnmarshal(Object, Object) public void
         * javax.xml.bind.Unmarshaller$Listener.beforeUnmarshal(java.lang.Object,java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.bind.Unmarshaller.Listener#beforeUnmarshal(Object, Object) public void
         *      javax.xml.bind.Unmarshaller$Listener.beforeUnmarshal(java.lang.Object,java.lang.Object) (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_beforeUnmarshal_Object_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
