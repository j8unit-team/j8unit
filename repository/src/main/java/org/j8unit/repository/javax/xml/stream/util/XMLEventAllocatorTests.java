package org.j8unit.repository.javax.xml.stream.util;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.stream.util.XMLEventAllocator interface javax.xml.stream.util.XMLEventAllocator},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.stream.util.XMLEventAllocatorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XMLEventAllocatorTests<SUT extends javax.xml.stream.util.XMLEventAllocator>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.util.XMLEventAllocator#allocate(javax.xml.stream.XMLStreamReader) public
     * abstract javax.xml.stream.events.XMLEvent
     * javax.xml.stream.util.XMLEventAllocator.allocate(javax.xml.stream.XMLStreamReader) throws
     * javax.xml.stream.XMLStreamException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_allocate_XMLStreamReader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.stream.util.XMLEventAllocator#allocate(javax.xml.stream.XMLStreamReader,javax.xml.stream.util.XMLEventConsumer)
     * public abstract void
     * javax.xml.stream.util.XMLEventAllocator.allocate(javax.xml.stream.XMLStreamReader,javax.xml.stream.util.XMLEventConsumer)
     * throws javax.xml.stream.XMLStreamException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_allocate_XMLStreamReader_XMLEventConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.util.XMLEventAllocator#newInstance() public abstract
     * javax.xml.stream.util.XMLEventAllocator javax.xml.stream.util.XMLEventAllocator.newInstance()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
