package org.j8unit.repository.javax.xml.transform.dom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.transform.dom.DOMLocator interface
 * javax.xml.transform.dom.DOMLocator}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DOMLocatorClassTests}.
 * </p>
 *
 * @see javax.xml.transform.dom.DOMLocator interface javax.xml.transform.dom.DOMLocator (the hereby targeted
 *      class-under-test class)
 * @see DOMLocatorClassTests DOMLocatorClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMLocatorTests<SUT extends javax.xml.transform.dom.DOMLocator>
extends org.j8unit.repository.javax.xml.transform.SourceLocatorTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.transform.dom.DOMLocator#getOriginatingNode() public abstract org.w3c.dom.Node
     * javax.xml.transform.dom.DOMLocator.getOriginatingNode()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.dom.DOMLocator#getOriginatingNode() public abstract org.w3c.dom.Node
     * javax.xml.transform.dom.DOMLocator.getOriginatingNode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.dom.DOMLocator#getOriginatingNode() public abstract org.w3c.dom.Node
     *      javax.xml.transform.dom.DOMLocator.getOriginatingNode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOriginatingNode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
