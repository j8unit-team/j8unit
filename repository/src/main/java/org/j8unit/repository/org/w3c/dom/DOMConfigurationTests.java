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
 * non-{@code static} methods) of {@linkplain org.w3c.dom.DOMConfiguration interface org.w3c.dom.DOMConfiguration}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DOMConfigurationClassTests}.
 * </p>
 *
 * @see org.w3c.dom.DOMConfiguration interface org.w3c.dom.DOMConfiguration (the hereby targeted class-under-test class)
 * @see DOMConfigurationClassTests DOMConfigurationClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMConfigurationTests<SUT extends org.w3c.dom.DOMConfiguration>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMConfiguration#getParameterNames() public abstract org.w3c.dom.DOMStringList
     * org.w3c.dom.DOMConfiguration.getParameterNames()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMConfiguration#getParameterNames() public abstract org.w3c.dom.DOMStringList
     * org.w3c.dom.DOMConfiguration.getParameterNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMConfiguration#getParameterNames() public abstract org.w3c.dom.DOMStringList
     *      org.w3c.dom.DOMConfiguration.getParameterNames() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameterNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMConfiguration#setParameter(String, Object) public abstract void
     * org.w3c.dom.DOMConfiguration.setParameter(java.lang.String,java.lang.Object) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMConfiguration#setParameter(String, Object) public abstract void
     * org.w3c.dom.DOMConfiguration.setParameter(java.lang.String,java.lang.Object) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMConfiguration#setParameter(String, Object) public abstract void
     *      org.w3c.dom.DOMConfiguration.setParameter(java.lang.String,java.lang.Object) throws org.w3c.dom.DOMException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setParameter_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMConfiguration#canSetParameter(String, Object) public abstract boolean
     * org.w3c.dom.DOMConfiguration.canSetParameter(java.lang.String,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMConfiguration#canSetParameter(String, Object) public abstract boolean
     * org.w3c.dom.DOMConfiguration.canSetParameter(java.lang.String,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMConfiguration#canSetParameter(String, Object) public abstract boolean
     *      org.w3c.dom.DOMConfiguration.canSetParameter(java.lang.String,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_canSetParameter_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMConfiguration#getParameter(String) public abstract java.lang.Object
     * org.w3c.dom.DOMConfiguration.getParameter(java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMConfiguration#getParameter(String) public abstract java.lang.Object
     * org.w3c.dom.DOMConfiguration.getParameter(java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMConfiguration#getParameter(String) public abstract java.lang.Object
     *      org.w3c.dom.DOMConfiguration.getParameter(java.lang.String) throws org.w3c.dom.DOMException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameter_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
