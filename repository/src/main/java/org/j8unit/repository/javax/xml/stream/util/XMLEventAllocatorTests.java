package org.j8unit.repository.javax.xml.stream.util;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.util.XMLEventAllocator interface
 * javax.xml.stream.util.XMLEventAllocator}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link XMLEventAllocatorClassTests}.
 * </p>
 *
 * @see javax.xml.stream.util.XMLEventAllocator interface javax.xml.stream.util.XMLEventAllocator (the hereby targeted
 *      class-under-test class)
 * @see XMLEventAllocatorClassTests XMLEventAllocatorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLEventAllocatorTests<SUT extends javax.xml.stream.util.XMLEventAllocator>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.util.XMLEventAllocator#newInstance() public abstract
     * javax.xml.stream.util.XMLEventAllocator javax.xml.stream.util.XMLEventAllocator.newInstance()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.util.XMLEventAllocator#newInstance() public abstract
     * javax.xml.stream.util.XMLEventAllocator javax.xml.stream.util.XMLEventAllocator.newInstance()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.util.XMLEventAllocator#newInstance() public abstract
     *      javax.xml.stream.util.XMLEventAllocator javax.xml.stream.util.XMLEventAllocator.newInstance() (the hereby
     *      targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.xml.stream.util.XMLEventAllocator#allocate(javax.xml.stream.XMLStreamReader) public
     * abstract javax.xml.stream.events.XMLEvent
     * javax.xml.stream.util.XMLEventAllocator.allocate(javax.xml.stream.XMLStreamReader) throws
     * javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.util.XMLEventAllocator#allocate(javax.xml.stream.XMLStreamReader) public
     * abstract javax.xml.stream.events.XMLEvent
     * javax.xml.stream.util.XMLEventAllocator.allocate(javax.xml.stream.XMLStreamReader) throws
     * javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.util.XMLEventAllocator#allocate(javax.xml.stream.XMLStreamReader) public abstract
     *      javax.xml.stream.events.XMLEvent
     *      javax.xml.stream.util.XMLEventAllocator.allocate(javax.xml.stream.XMLStreamReader) throws
     *      javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
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
     * {@link javax.xml.stream.util.XMLEventAllocator#allocate(javax.xml.stream.XMLStreamReader, javax.xml.stream.util.XMLEventConsumer)
     * public abstract void
     * javax.xml.stream.util.XMLEventAllocator.allocate(javax.xml.stream.XMLStreamReader,javax.xml.stream.util.XMLEventConsumer)
     * throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.stream.util.XMLEventAllocator#allocate(javax.xml.stream.XMLStreamReader, javax.xml.stream.util.XMLEventConsumer)
     * public abstract void
     * javax.xml.stream.util.XMLEventAllocator.allocate(javax.xml.stream.XMLStreamReader,javax.xml.stream.util.XMLEventConsumer)
     * throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.util.XMLEventAllocator#allocate(javax.xml.stream.XMLStreamReader,
     *      javax.xml.stream.util.XMLEventConsumer) public abstract void
     *      javax.xml.stream.util.XMLEventAllocator.allocate(javax.xml.stream.XMLStreamReader,javax.xml.stream.util.
     *      XMLEventConsumer) throws javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
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

}
