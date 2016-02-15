package org.j8unit.repository.java.beans;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.Customizer interface java.beans.Customizer}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link CustomizerClassTests}.
 * </p>
 *
 * @see java.beans.Customizer interface java.beans.Customizer (the hereby targeted class-under-test class)
 * @see CustomizerClassTests CustomizerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CustomizerTests<SUT extends java.beans.Customizer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.Customizer#setObject(Object) public abstract void
     * java.beans.Customizer.setObject(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.Customizer#setObject(Object) public abstract void
     * java.beans.Customizer.setObject(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.Customizer#setObject(Object) public abstract void
     *      java.beans.Customizer.setObject(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setObject_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.Customizer#addPropertyChangeListener(java.beans.PropertyChangeListener) public
     * abstract void java.beans.Customizer.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for {@link java.beans.Customizer#addPropertyChangeListener(java.beans.PropertyChangeListener) public
     * abstract void java.beans.Customizer.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.Customizer#addPropertyChangeListener(java.beans.PropertyChangeListener) public abstract void
     *      java.beans.Customizer.addPropertyChangeListener(java.beans.PropertyChangeListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.Customizer#removePropertyChangeListener(java.beans.PropertyChangeListener)
     * public abstract void java.beans.Customizer.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for {@link java.beans.Customizer#removePropertyChangeListener(java.beans.PropertyChangeListener)
     * public abstract void java.beans.Customizer.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.Customizer#removePropertyChangeListener(java.beans.PropertyChangeListener) public abstract void
     *      java.beans.Customizer.removePropertyChangeListener(java.beans.PropertyChangeListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
