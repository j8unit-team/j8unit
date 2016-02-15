package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.events.EndElement interface
 * javax.xml.stream.events.EndElement}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link EndElementClassTests}.
 * </p>
 *
 * @see javax.xml.stream.events.EndElement interface javax.xml.stream.events.EndElement (the hereby targeted
 *      class-under-test class)
 * @see EndElementClassTests EndElementClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EndElementTests<SUT extends javax.xml.stream.events.EndElement>
extends XMLEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.EndElement#getName() public abstract javax.xml.namespace.QName
     * javax.xml.stream.events.EndElement.getName()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.events.EndElement#getName() public abstract javax.xml.namespace.QName
     * javax.xml.stream.events.EndElement.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.events.EndElement#getName() public abstract javax.xml.namespace.QName
     *      javax.xml.stream.events.EndElement.getName() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.xml.stream.events.EndElement#getNamespaces() public abstract java.util.Iterator
     * javax.xml.stream.events.EndElement.getNamespaces()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.events.EndElement#getNamespaces() public abstract java.util.Iterator
     *      javax.xml.stream.events.EndElement.getNamespaces() (the hereby targeted method-under-test)
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
