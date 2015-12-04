package org.j8unit.repository.java.awt;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.ItemSelectable interface java.awt.ItemSelectable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.ItemSelectableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ItemSelectableTests<SUT extends java.awt.ItemSelectable>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.ItemSelectable#addItemListener(java.awt.event.ItemListener) public abstract void java.awt.ItemSelectable.addItemListener(java.awt.event.ItemListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addItemListener_ItemListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.ItemSelectable#getSelectedObjects() public abstract java.lang.Object[] java.awt.ItemSelectable.getSelectedObjects()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedObjects() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.ItemSelectable#removeItemListener(java.awt.event.ItemListener) public abstract void java.awt.ItemSelectable.removeItemListener(java.awt.event.ItemListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeItemListener_ItemListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
