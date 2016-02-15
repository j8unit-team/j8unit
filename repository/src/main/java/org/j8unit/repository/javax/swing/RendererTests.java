package org.j8unit.repository.javax.swing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.Renderer interface javax.swing.Renderer}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link RendererClassTests}.
 * </p>
 *
 * @see javax.swing.Renderer interface javax.swing.Renderer (the hereby targeted class-under-test class)
 * @see RendererClassTests RendererClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RendererTests<SUT extends javax.swing.Renderer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.Renderer#setValue(Object, boolean) public abstract void
     * javax.swing.Renderer.setValue(java.lang.Object,boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.Renderer#setValue(Object, boolean) public abstract void
     * javax.swing.Renderer.setValue(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.Renderer#setValue(Object, boolean) public abstract void
     *      javax.swing.Renderer.setValue(java.lang.Object,boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setValue_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.Renderer#getComponent() public abstract java.awt.Component
     * javax.swing.Renderer.getComponent()}.
     *
     * <p>
     * Test method for {@link javax.swing.Renderer#getComponent() public abstract java.awt.Component
     * javax.swing.Renderer.getComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.Renderer#getComponent() public abstract java.awt.Component javax.swing.Renderer.getComponent()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
