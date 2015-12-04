package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.stream.events.EndElement interface javax.xml.stream.events.EndElement}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.stream.events.EndElementClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface EndElementTests<SUT extends javax.xml.stream.events.EndElement>
extends org.j8unit.repository.javax.xml.stream.events.XMLEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.EndElement#getName() public abstract javax.xml.namespace.QName
     * javax.xml.stream.events.EndElement.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.EndElement#getNamespaces() public abstract java.util.Iterator
     * javax.xml.stream.events.EndElement.getNamespaces()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNamespaces()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
