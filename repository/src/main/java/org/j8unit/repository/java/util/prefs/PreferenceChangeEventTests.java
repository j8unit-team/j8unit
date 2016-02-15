package org.j8unit.repository.java.util.prefs;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.prefs.PreferenceChangeEvent class
 * java.util.prefs.PreferenceChangeEvent}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link PreferenceChangeEventClassTests}.
 * </p>
 *
 * @see java.util.prefs.PreferenceChangeEvent class java.util.prefs.PreferenceChangeEvent (the hereby targeted
 *      class-under-test class)
 * @see PreferenceChangeEventClassTests PreferenceChangeEventClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PreferenceChangeEventTests<SUT extends java.util.prefs.PreferenceChangeEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeEvent#getNewValue() public java.lang.String
     * java.util.prefs.PreferenceChangeEvent.getNewValue()}.
     *
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeEvent#getNewValue() public java.lang.String
     * java.util.prefs.PreferenceChangeEvent.getNewValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.prefs.PreferenceChangeEvent#getNewValue() public java.lang.String
     *      java.util.prefs.PreferenceChangeEvent.getNewValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNewValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeEvent#getNode() public java.util.prefs.Preferences
     * java.util.prefs.PreferenceChangeEvent.getNode()}.
     *
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeEvent#getNode() public java.util.prefs.Preferences
     * java.util.prefs.PreferenceChangeEvent.getNode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.prefs.PreferenceChangeEvent#getNode() public java.util.prefs.Preferences
     *      java.util.prefs.PreferenceChangeEvent.getNode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeEvent#getKey() public java.lang.String
     * java.util.prefs.PreferenceChangeEvent.getKey()}.
     *
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeEvent#getKey() public java.lang.String
     * java.util.prefs.PreferenceChangeEvent.getKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.prefs.PreferenceChangeEvent#getKey() public java.lang.String
     *      java.util.prefs.PreferenceChangeEvent.getKey() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
