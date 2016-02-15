package org.j8unit.repository.java.awt;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.MenuContainer interface java.awt.MenuContainer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MenuContainerClassTests}.
 * </p>
 *
 * @see java.awt.MenuContainer interface java.awt.MenuContainer (the hereby targeted class-under-test class)
 * @see MenuContainerClassTests MenuContainerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MenuContainerTests<SUT extends java.awt.MenuContainer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.MenuContainer#getFont() public abstract java.awt.Font
     * java.awt.MenuContainer.getFont()}.
     *
     * <p>
     * Test method for {@link java.awt.MenuContainer#getFont() public abstract java.awt.Font
     * java.awt.MenuContainer.getFont()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuContainer#getFont() public abstract java.awt.Font java.awt.MenuContainer.getFont() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFont()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuContainer#remove(java.awt.MenuComponent) public abstract void
     * java.awt.MenuContainer.remove(java.awt.MenuComponent)}.
     *
     * <p>
     * Test method for {@link java.awt.MenuContainer#remove(java.awt.MenuComponent) public abstract void
     * java.awt.MenuContainer.remove(java.awt.MenuComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuContainer#remove(java.awt.MenuComponent) public abstract void
     *      java.awt.MenuContainer.remove(java.awt.MenuComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_MenuComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.MenuContainer#postEvent(java.awt.Event) public abstract boolean
     * java.awt.MenuContainer.postEvent(java.awt.Event)}.
     *
     * <p>
     * Test method for {@link java.awt.MenuContainer#postEvent(java.awt.Event) public abstract boolean
     * java.awt.MenuContainer.postEvent(java.awt.Event)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.MenuContainer#postEvent(java.awt.Event) public abstract boolean
     *      java.awt.MenuContainer.postEvent(java.awt.Event) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_postEvent_Event()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
