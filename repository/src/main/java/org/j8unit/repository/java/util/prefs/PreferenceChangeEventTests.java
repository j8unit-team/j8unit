package org.j8unit.repository.java.util.prefs;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.prefs.PreferenceChangeEvent class java.util.prefs.PreferenceChangeEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.prefs.PreferenceChangeEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PreferenceChangeEventTests<SUT extends java.util.prefs.PreferenceChangeEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeEvent#getNewValue() public java.lang.String java.util.prefs.PreferenceChangeEvent.getNewValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNewValue() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeEvent#getNode() public java.util.prefs.Preferences java.util.prefs.PreferenceChangeEvent.getNode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNode() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeEvent#getKey() public java.lang.String java.util.prefs.PreferenceChangeEvent.getKey()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKey() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
