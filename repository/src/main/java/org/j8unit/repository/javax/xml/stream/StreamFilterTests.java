package org.j8unit.repository.javax.xml.stream;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.stream.StreamFilter interface javax.xml.stream.StreamFilter}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.stream.StreamFilterClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StreamFilterTests<SUT extends javax.xml.stream.StreamFilter>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.StreamFilter#accept(javax.xml.stream.XMLStreamReader) public abstract
     * boolean javax.xml.stream.StreamFilter.accept(javax.xml.stream.XMLStreamReader)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_XMLStreamReader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
