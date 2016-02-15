package org.j8unit.repository.javax.xml.stream;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.XMLEventReader interface javax.xml.stream.XMLEventReader}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link XMLEventReaderClassTests}.
 * </p>
 *
 * @see javax.xml.stream.XMLEventReader interface javax.xml.stream.XMLEventReader (the hereby targeted class-under-test
 *      class)
 * @see XMLEventReaderClassTests XMLEventReaderClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLEventReaderTests<SUT extends javax.xml.stream.XMLEventReader>
extends org.j8unit.repository.java.util.IteratorTests {

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of this J8Unit test interface
    // (caused by the "rawtypes" nature of the class-under-test).
    @Override
    public abstract SUT createNewSUT();

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#nextTag() public abstract javax.xml.stream.events.XMLEvent
     * javax.xml.stream.XMLEventReader.nextTag() throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#nextTag() public abstract javax.xml.stream.events.XMLEvent
     * javax.xml.stream.XMLEventReader.nextTag() throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventReader#nextTag() public abstract javax.xml.stream.events.XMLEvent
     *      javax.xml.stream.XMLEventReader.nextTag() throws javax.xml.stream.XMLStreamException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextTag()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#getProperty(String) public abstract java.lang.Object
     * javax.xml.stream.XMLEventReader.getProperty(java.lang.String) throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#getProperty(String) public abstract java.lang.Object
     * javax.xml.stream.XMLEventReader.getProperty(java.lang.String) throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventReader#getProperty(String) public abstract java.lang.Object
     *      javax.xml.stream.XMLEventReader.getProperty(java.lang.String) throws java.lang.IllegalArgumentException (the
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
     * Test method for {@link javax.xml.stream.XMLEventReader#getElementText() public abstract java.lang.String
     * javax.xml.stream.XMLEventReader.getElementText() throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#getElementText() public abstract java.lang.String
     * javax.xml.stream.XMLEventReader.getElementText() throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventReader#getElementText() public abstract java.lang.String
     *      javax.xml.stream.XMLEventReader.getElementText() throws javax.xml.stream.XMLStreamException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementText()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#nextEvent() public abstract
     * javax.xml.stream.events.XMLEvent javax.xml.stream.XMLEventReader.nextEvent() throws
     * javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#nextEvent() public abstract
     * javax.xml.stream.events.XMLEvent javax.xml.stream.XMLEventReader.nextEvent() throws
     * javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventReader#nextEvent() public abstract javax.xml.stream.events.XMLEvent
     *      javax.xml.stream.XMLEventReader.nextEvent() throws javax.xml.stream.XMLStreamException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#hasNext() public abstract boolean
     * javax.xml.stream.XMLEventReader.hasNext()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#hasNext() public abstract boolean
     * javax.xml.stream.XMLEventReader.hasNext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventReader#hasNext() public abstract boolean javax.xml.stream.XMLEventReader.hasNext()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hasNext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#close() public abstract void
     * javax.xml.stream.XMLEventReader.close() throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#close() public abstract void
     * javax.xml.stream.XMLEventReader.close() throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventReader#close() public abstract void javax.xml.stream.XMLEventReader.close() throws
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

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#peek() public abstract javax.xml.stream.events.XMLEvent
     * javax.xml.stream.XMLEventReader.peek() throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#peek() public abstract javax.xml.stream.events.XMLEvent
     * javax.xml.stream.XMLEventReader.peek() throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLEventReader#peek() public abstract javax.xml.stream.events.XMLEvent
     *      javax.xml.stream.XMLEventReader.peek() throws javax.xml.stream.XMLStreamException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_peek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
