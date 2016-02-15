package org.j8unit.repository.java.util.prefs;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.prefs.NodeChangeEvent class java.util.prefs.NodeChangeEvent}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link NodeChangeEventClassTests}.
 * </p>
 *
 * @see java.util.prefs.NodeChangeEvent class java.util.prefs.NodeChangeEvent (the hereby targeted class-under-test
 *      class)
 * @see NodeChangeEventClassTests NodeChangeEventClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NodeChangeEventTests<SUT extends java.util.prefs.NodeChangeEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.prefs.NodeChangeEvent#getParent() public java.util.prefs.Preferences
     * java.util.prefs.NodeChangeEvent.getParent()}.
     *
     * <p>
     * Test method for {@link java.util.prefs.NodeChangeEvent#getParent() public java.util.prefs.Preferences
     * java.util.prefs.NodeChangeEvent.getParent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.prefs.NodeChangeEvent#getParent() public java.util.prefs.Preferences
     *      java.util.prefs.NodeChangeEvent.getParent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.prefs.NodeChangeEvent#getChild() public java.util.prefs.Preferences
     * java.util.prefs.NodeChangeEvent.getChild()}.
     *
     * <p>
     * Test method for {@link java.util.prefs.NodeChangeEvent#getChild() public java.util.prefs.Preferences
     * java.util.prefs.NodeChangeEvent.getChild()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.prefs.NodeChangeEvent#getChild() public java.util.prefs.Preferences
     *      java.util.prefs.NodeChangeEvent.getChild() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChild()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
