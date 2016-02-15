package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.FocusTraversalPolicy class java.awt.FocusTraversalPolicy}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FocusTraversalPolicyClassTests}.
 * </p>
 *
 * @see java.awt.FocusTraversalPolicy class java.awt.FocusTraversalPolicy (the hereby targeted class-under-test class)
 * @see FocusTraversalPolicyClassTests FocusTraversalPolicyClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FocusTraversalPolicyTests<SUT extends java.awt.FocusTraversalPolicy>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getInitialComponent(java.awt.Window) public
     * java.awt.Component java.awt.FocusTraversalPolicy.getInitialComponent(java.awt.Window)}.
     *
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getInitialComponent(java.awt.Window) public
     * java.awt.Component java.awt.FocusTraversalPolicy.getInitialComponent(java.awt.Window)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.FocusTraversalPolicy#getInitialComponent(java.awt.Window) public java.awt.Component
     *      java.awt.FocusTraversalPolicy.getInitialComponent(java.awt.Window) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInitialComponent_Window()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getFirstComponent(java.awt.Container) public abstract
     * java.awt.Component java.awt.FocusTraversalPolicy.getFirstComponent(java.awt.Container)}.
     *
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getFirstComponent(java.awt.Container) public abstract
     * java.awt.Component java.awt.FocusTraversalPolicy.getFirstComponent(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.FocusTraversalPolicy#getFirstComponent(java.awt.Container) public abstract java.awt.Component
     *      java.awt.FocusTraversalPolicy.getFirstComponent(java.awt.Container) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFirstComponent_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getComponentBefore(java.awt.Container, java.awt.Component)
     * public abstract java.awt.Component
     * java.awt.FocusTraversalPolicy.getComponentBefore(java.awt.Container,java.awt.Component)}.
     *
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getComponentBefore(java.awt.Container, java.awt.Component)
     * public abstract java.awt.Component
     * java.awt.FocusTraversalPolicy.getComponentBefore(java.awt.Container,java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.FocusTraversalPolicy#getComponentBefore(java.awt.Container, java.awt.Component) public abstract
     *      java.awt.Component java.awt.FocusTraversalPolicy.getComponentBefore(java.awt.Container,java.awt.Component)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComponentBefore_Container_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getLastComponent(java.awt.Container) public abstract
     * java.awt.Component java.awt.FocusTraversalPolicy.getLastComponent(java.awt.Container)}.
     *
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getLastComponent(java.awt.Container) public abstract
     * java.awt.Component java.awt.FocusTraversalPolicy.getLastComponent(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.FocusTraversalPolicy#getLastComponent(java.awt.Container) public abstract java.awt.Component
     *      java.awt.FocusTraversalPolicy.getLastComponent(java.awt.Container) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLastComponent_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getDefaultComponent(java.awt.Container) public abstract
     * java.awt.Component java.awt.FocusTraversalPolicy.getDefaultComponent(java.awt.Container)}.
     *
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getDefaultComponent(java.awt.Container) public abstract
     * java.awt.Component java.awt.FocusTraversalPolicy.getDefaultComponent(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.FocusTraversalPolicy#getDefaultComponent(java.awt.Container) public abstract java.awt.Component
     *      java.awt.FocusTraversalPolicy.getDefaultComponent(java.awt.Container) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultComponent_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getComponentAfter(java.awt.Container, java.awt.Component)
     * public abstract java.awt.Component
     * java.awt.FocusTraversalPolicy.getComponentAfter(java.awt.Container,java.awt.Component)}.
     *
     * <p>
     * Test method for {@link java.awt.FocusTraversalPolicy#getComponentAfter(java.awt.Container, java.awt.Component)
     * public abstract java.awt.Component
     * java.awt.FocusTraversalPolicy.getComponentAfter(java.awt.Container,java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.FocusTraversalPolicy#getComponentAfter(java.awt.Container, java.awt.Component) public abstract
     *      java.awt.Component java.awt.FocusTraversalPolicy.getComponentAfter(java.awt.Container,java.awt.Component)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComponentAfter_Container_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
