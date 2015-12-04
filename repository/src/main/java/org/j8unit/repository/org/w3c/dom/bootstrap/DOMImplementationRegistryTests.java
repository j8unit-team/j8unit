package org.j8unit.repository.org.w3c.dom.bootstrap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.bootstrap.DOMImplementationRegistry class
 * org.w3c.dom.bootstrap.DOMImplementationRegistry}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.bootstrap.DOMImplementationRegistryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DOMImplementationRegistryTests<SUT extends org.w3c.dom.bootstrap.DOMImplementationRegistry>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.bootstrap.DOMImplementationRegistry#addSource(org.w3c.dom.DOMImplementationSource) public void
     * org.w3c.dom.bootstrap.DOMImplementationRegistry.addSource(org.w3c.dom.DOMImplementationSource)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addSource_DOMImplementationSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.bootstrap.DOMImplementationRegistry#getDOMImplementation(java.lang.String)
     * public org.w3c.dom.DOMImplementation
     * org.w3c.dom.bootstrap.DOMImplementationRegistry.getDOMImplementation(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDOMImplementation_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.bootstrap.DOMImplementationRegistry#getDOMImplementationList(java.lang.String)
     * public org.w3c.dom.DOMImplementationList
     * org.w3c.dom.bootstrap.DOMImplementationRegistry.getDOMImplementationList(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDOMImplementationList_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
