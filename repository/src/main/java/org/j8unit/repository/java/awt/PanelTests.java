package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.Panel class java.awt.Panel}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link PanelClassTests}.
 * </p>
 *
 * @see java.awt.Panel class java.awt.Panel (the hereby targeted class-under-test class)
 * @see PanelClassTests PanelClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PanelTests<SUT extends java.awt.Panel>
extends org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>, ContainerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.Panel#addNotify() public void java.awt.Panel.addNotify()}.
     *
     * <p>
     * Test method for {@link java.awt.Panel#addNotify() public void java.awt.Panel.addNotify()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.Panel#addNotify() public void java.awt.Panel.addNotify() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotify()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Panel#getAccessibleContext() public javax.accessibility.AccessibleContext
     * java.awt.Panel.getAccessibleContext()}.
     *
     * <p>
     * Test method for {@link java.awt.Panel#getAccessibleContext() public javax.accessibility.AccessibleContext
     * java.awt.Panel.getAccessibleContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.Panel#getAccessibleContext() public javax.accessibility.AccessibleContext
     *      java.awt.Panel.getAccessibleContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
