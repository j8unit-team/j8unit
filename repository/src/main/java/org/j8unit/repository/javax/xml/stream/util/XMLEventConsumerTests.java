package org.j8unit.repository.javax.xml.stream.util;

import javax.xml.stream.util.XMLEventConsumer;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link XMLEventConsumer public abstract interface javax.xml.stream.util.XMLEventConsumer}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.stream.util.XMLEventConsumerClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLEventConsumerTests<SUT extends XMLEventConsumer>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.util.XMLEventConsumer]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.stream.util.XMLEventConsumer#add(javax.xml.stream.events.XMLEvent) public abstract void
     * javax.xml.stream.util.XMLEventConsumer.add(javax.xml.stream.events.XMLEvent) throws
     * javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_XMLEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.util.XMLEventConsumer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.util.XMLEventConsumer]

}
