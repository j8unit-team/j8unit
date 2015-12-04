package org.j8unit.repository.org.w3c.dom;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.DOMConfiguration interface org.w3c.dom.DOMConfiguration}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.DOMConfigurationClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DOMConfigurationTests<SUT extends org.w3c.dom.DOMConfiguration>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMConfiguration#getParameterNames() public abstract org.w3c.dom.DOMStringList
     * org.w3c.dom.DOMConfiguration.getParameterNames()}.
     * </p>
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
     * Test method for {@link org.w3c.dom.DOMConfiguration#setParameter(java.lang.String,java.lang.Object) public
     * abstract void org.w3c.dom.DOMConfiguration.setParameter(java.lang.String,java.lang.Object) throws
     * org.w3c.dom.DOMException}.
     * </p>
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
     * Test method for {@link org.w3c.dom.DOMConfiguration#canSetParameter(java.lang.String,java.lang.Object) public
     * abstract boolean org.w3c.dom.DOMConfiguration.canSetParameter(java.lang.String,java.lang.Object)}.
     * </p>
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
     * Test method for {@link org.w3c.dom.DOMConfiguration#getParameter(java.lang.String) public abstract
     * java.lang.Object org.w3c.dom.DOMConfiguration.getParameter(java.lang.String) throws org.w3c.dom.DOMException}.
     * </p>
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
