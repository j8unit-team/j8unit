package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.event.ComponentAdapter class java.awt.event.ComponentAdapter}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ComponentAdapterClassTests}.
 * </p>
 *
 * @see java.awt.event.ComponentAdapter class java.awt.event.ComponentAdapter (the hereby targeted class-under-test
 *      class)
 * @see ComponentAdapterClassTests ComponentAdapterClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ComponentAdapterTests<SUT extends java.awt.event.ComponentAdapter>
extends ComponentListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.ComponentAdapter#componentHidden(java.awt.event.ComponentEvent) public void
     * java.awt.event.ComponentAdapter.componentHidden(java.awt.event.ComponentEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.event.ComponentAdapter#componentHidden(java.awt.event.ComponentEvent) public void
     * java.awt.event.ComponentAdapter.componentHidden(java.awt.event.ComponentEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.ComponentAdapter#componentHidden(java.awt.event.ComponentEvent) public void
     *      java.awt.event.ComponentAdapter.componentHidden(java.awt.event.ComponentEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_componentHidden_ComponentEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.ComponentAdapter#componentResized(java.awt.event.ComponentEvent) public
     * void java.awt.event.ComponentAdapter.componentResized(java.awt.event.ComponentEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.event.ComponentAdapter#componentResized(java.awt.event.ComponentEvent) public
     * void java.awt.event.ComponentAdapter.componentResized(java.awt.event.ComponentEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.ComponentAdapter#componentResized(java.awt.event.ComponentEvent) public void
     *      java.awt.event.ComponentAdapter.componentResized(java.awt.event.ComponentEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_componentResized_ComponentEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.ComponentAdapter#componentMoved(java.awt.event.ComponentEvent) public void
     * java.awt.event.ComponentAdapter.componentMoved(java.awt.event.ComponentEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.event.ComponentAdapter#componentMoved(java.awt.event.ComponentEvent) public void
     * java.awt.event.ComponentAdapter.componentMoved(java.awt.event.ComponentEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.ComponentAdapter#componentMoved(java.awt.event.ComponentEvent) public void
     *      java.awt.event.ComponentAdapter.componentMoved(java.awt.event.ComponentEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_componentMoved_ComponentEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.ComponentAdapter#componentShown(java.awt.event.ComponentEvent) public void
     * java.awt.event.ComponentAdapter.componentShown(java.awt.event.ComponentEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.event.ComponentAdapter#componentShown(java.awt.event.ComponentEvent) public void
     * java.awt.event.ComponentAdapter.componentShown(java.awt.event.ComponentEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.ComponentAdapter#componentShown(java.awt.event.ComponentEvent) public void
     *      java.awt.event.ComponentAdapter.componentShown(java.awt.event.ComponentEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_componentShown_ComponentEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
