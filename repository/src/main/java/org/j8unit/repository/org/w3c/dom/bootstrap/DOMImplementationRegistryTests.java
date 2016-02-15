package org.j8unit.repository.org.w3c.dom.bootstrap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.bootstrap.DOMImplementationRegistry class
 * org.w3c.dom.bootstrap.DOMImplementationRegistry}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link DOMImplementationRegistryClassTests}.
 * </p>
 *
 * @see org.w3c.dom.bootstrap.DOMImplementationRegistry class org.w3c.dom.bootstrap.DOMImplementationRegistry (the
 *      hereby targeted class-under-test class)
 * @see DOMImplementationRegistryClassTests DOMImplementationRegistryClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMImplementationRegistryTests<SUT extends org.w3c.dom.bootstrap.DOMImplementationRegistry>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.bootstrap.DOMImplementationRegistry#addSource(org.w3c.dom.DOMImplementationSource) public void
     * org.w3c.dom.bootstrap.DOMImplementationRegistry.addSource(org.w3c.dom.DOMImplementationSource)}.
     *
     * <p>
     * Test method for
     * {@link org.w3c.dom.bootstrap.DOMImplementationRegistry#addSource(org.w3c.dom.DOMImplementationSource) public void
     * org.w3c.dom.bootstrap.DOMImplementationRegistry.addSource(org.w3c.dom.DOMImplementationSource)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.bootstrap.DOMImplementationRegistry#addSource(org.w3c.dom.DOMImplementationSource) public void
     *      org.w3c.dom.bootstrap.DOMImplementationRegistry.addSource(org.w3c.dom.DOMImplementationSource) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link org.w3c.dom.bootstrap.DOMImplementationRegistry#getDOMImplementationList(String) public
     * org.w3c.dom.DOMImplementationList
     * org.w3c.dom.bootstrap.DOMImplementationRegistry.getDOMImplementationList(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.bootstrap.DOMImplementationRegistry#getDOMImplementationList(String) public
     * org.w3c.dom.DOMImplementationList
     * org.w3c.dom.bootstrap.DOMImplementationRegistry.getDOMImplementationList(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.bootstrap.DOMImplementationRegistry#getDOMImplementationList(String) public
     *      org.w3c.dom.DOMImplementationList
     *      org.w3c.dom.bootstrap.DOMImplementationRegistry.getDOMImplementationList(java.lang.String) (the hereby
     *      targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link org.w3c.dom.bootstrap.DOMImplementationRegistry#getDOMImplementation(String) public
     * org.w3c.dom.DOMImplementation
     * org.w3c.dom.bootstrap.DOMImplementationRegistry.getDOMImplementation(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.bootstrap.DOMImplementationRegistry#getDOMImplementation(String) public
     * org.w3c.dom.DOMImplementation
     * org.w3c.dom.bootstrap.DOMImplementationRegistry.getDOMImplementation(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.bootstrap.DOMImplementationRegistry#getDOMImplementation(String) public
     *      org.w3c.dom.DOMImplementation
     *      org.w3c.dom.bootstrap.DOMImplementationRegistry.getDOMImplementation(java.lang.String) (the hereby targeted
     *      method-under-test)
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

}
