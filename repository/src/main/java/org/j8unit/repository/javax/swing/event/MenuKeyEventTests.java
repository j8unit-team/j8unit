package org.j8unit.repository.javax.swing.event;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.event.MenuKeyEvent class javax.swing.event.MenuKeyEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.MenuKeyEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MenuKeyEventTests<SUT extends javax.swing.event.MenuKeyEvent>
extends org.j8unit.repository.java.awt.event.KeyEventTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuKeyEvent#getPath() public javax.swing.MenuElement[] javax.swing.event.MenuKeyEvent.getPath()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPath() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuKeyEvent#getMenuSelectionManager() public javax.swing.MenuSelectionManager javax.swing.event.MenuKeyEvent.getMenuSelectionManager()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenuSelectionManager() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
