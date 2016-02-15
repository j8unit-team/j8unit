package org.j8unit.repository.javax.xml.stream;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.XMLEventWriter interface javax.xml.stream.XMLEventWriter}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link XMLEventWriterClassTests}.
 * </p>
 *
 * @see javax.xml.stream.XMLEventWriter interface javax.xml.stream.XMLEventWriter (the hereby targeted class-under-test
 *      class)
 * @see XMLEventWriterClassTests XMLEventWriterClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLEventWriterTests<SUT extends javax.xml.stream.XMLEventWriter>
extends org.j8unit.repository.javax.xml.stream.util.XMLEventConsumerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#getPrefix(String) public abstract java.lang.String
     * javax.xml.stream.XMLEventWriter.getPrefix(java.lang.String) throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#getPrefix(String) public abstract java.lang.String
     * javax.xml.stream.XMLEventWriter.getPrefix(java.lang.String) throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventWriter#getPrefix(String) public abstract java.lang.String
     *      javax.xml.stream.XMLEventWriter.getPrefix(java.lang.String) throws javax.xml.stream.XMLStreamException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrefix_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#add(javax.xml.stream.events.XMLEvent) public abstract void
     * javax.xml.stream.XMLEventWriter.add(javax.xml.stream.events.XMLEvent) throws javax.xml.stream.XMLStreamException}
     * .
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#add(javax.xml.stream.events.XMLEvent) public abstract void
     * javax.xml.stream.XMLEventWriter.add(javax.xml.stream.events.XMLEvent) throws javax.xml.stream.XMLStreamException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventWriter#add(javax.xml.stream.events.XMLEvent) public abstract void
     *      javax.xml.stream.XMLEventWriter.add(javax.xml.stream.events.XMLEvent) throws
     *      javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_add_XMLEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#add(javax.xml.stream.XMLEventReader) public abstract void
     * javax.xml.stream.XMLEventWriter.add(javax.xml.stream.XMLEventReader) throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#add(javax.xml.stream.XMLEventReader) public abstract void
     * javax.xml.stream.XMLEventWriter.add(javax.xml.stream.XMLEventReader) throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventWriter#add(javax.xml.stream.XMLEventReader) public abstract void
     *      javax.xml.stream.XMLEventWriter.add(javax.xml.stream.XMLEventReader) throws
     *      javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_XMLEventReader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#setDefaultNamespace(String) public abstract void
     * javax.xml.stream.XMLEventWriter.setDefaultNamespace(java.lang.String) throws javax.xml.stream.XMLStreamException}
     * .
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#setDefaultNamespace(String) public abstract void
     * javax.xml.stream.XMLEventWriter.setDefaultNamespace(java.lang.String) throws javax.xml.stream.XMLStreamException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventWriter#setDefaultNamespace(String) public abstract void
     *      javax.xml.stream.XMLEventWriter.setDefaultNamespace(java.lang.String) throws
     *      javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultNamespace_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#flush() public abstract void
     * javax.xml.stream.XMLEventWriter.flush() throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#flush() public abstract void
     * javax.xml.stream.XMLEventWriter.flush() throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventWriter#flush() public abstract void javax.xml.stream.XMLEventWriter.flush() throws
     *      javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_flush()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#setNamespaceContext(javax.xml.namespace.NamespaceContext)
     * public abstract void javax.xml.stream.XMLEventWriter.setNamespaceContext(javax.xml.namespace.NamespaceContext)
     * throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#setNamespaceContext(javax.xml.namespace.NamespaceContext)
     * public abstract void javax.xml.stream.XMLEventWriter.setNamespaceContext(javax.xml.namespace.NamespaceContext)
     * throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventWriter#setNamespaceContext(javax.xml.namespace.NamespaceContext) public abstract
     *      void javax.xml.stream.XMLEventWriter.setNamespaceContext(javax.xml.namespace.NamespaceContext) throws
     *      javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNamespaceContext_NamespaceContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#setPrefix(String, String) public abstract void
     * javax.xml.stream.XMLEventWriter.setPrefix(java.lang.String,java.lang.String) throws
     * javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#setPrefix(String, String) public abstract void
     * javax.xml.stream.XMLEventWriter.setPrefix(java.lang.String,java.lang.String) throws
     * javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventWriter#setPrefix(String, String) public abstract void
     *      javax.xml.stream.XMLEventWriter.setPrefix(java.lang.String,java.lang.String) throws
     *      javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPrefix_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#getNamespaceContext() public abstract
     * javax.xml.namespace.NamespaceContext javax.xml.stream.XMLEventWriter.getNamespaceContext()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#getNamespaceContext() public abstract
     * javax.xml.namespace.NamespaceContext javax.xml.stream.XMLEventWriter.getNamespaceContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventWriter#getNamespaceContext() public abstract javax.xml.namespace.NamespaceContext
     *      javax.xml.stream.XMLEventWriter.getNamespaceContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNamespaceContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#close() public abstract void
     * javax.xml.stream.XMLEventWriter.close() throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventWriter#close() public abstract void
     * javax.xml.stream.XMLEventWriter.close() throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventWriter#close() public abstract void javax.xml.stream.XMLEventWriter.close() throws
     *      javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
