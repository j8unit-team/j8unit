package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.DOMImplementationSource interface
 * org.w3c.dom.DOMImplementationSource}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DOMImplementationSourceClassTests}.
 * </p>
 *
 * @see org.w3c.dom.DOMImplementationSource interface org.w3c.dom.DOMImplementationSource (the hereby targeted
 *      class-under-test class)
 * @see DOMImplementationSourceClassTests DOMImplementationSourceClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMImplementationSourceTests<SUT extends org.w3c.dom.DOMImplementationSource>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementationSource#getDOMImplementation(String) public abstract
     * org.w3c.dom.DOMImplementation org.w3c.dom.DOMImplementationSource.getDOMImplementation(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementationSource#getDOMImplementation(String) public abstract
     * org.w3c.dom.DOMImplementation org.w3c.dom.DOMImplementationSource.getDOMImplementation(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMImplementationSource#getDOMImplementation(String) public abstract
     *      org.w3c.dom.DOMImplementation org.w3c.dom.DOMImplementationSource.getDOMImplementation(java.lang.String)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link org.w3c.dom.DOMImplementationSource#getDOMImplementationList(String) public abstract
     * org.w3c.dom.DOMImplementationList org.w3c.dom.DOMImplementationSource.getDOMImplementationList(java.lang.String)}
     * .
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementationSource#getDOMImplementationList(String) public abstract
     * org.w3c.dom.DOMImplementationList org.w3c.dom.DOMImplementationSource.getDOMImplementationList(java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMImplementationSource#getDOMImplementationList(String) public abstract
     *      org.w3c.dom.DOMImplementationList
     *      org.w3c.dom.DOMImplementationSource.getDOMImplementationList(java.lang.String) (the hereby targeted
     *      method-under-test)
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
