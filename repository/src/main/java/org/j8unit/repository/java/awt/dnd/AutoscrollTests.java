package org.j8unit.repository.java.awt.dnd;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.dnd.Autoscroll interface java.awt.dnd.Autoscroll},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.dnd.AutoscrollClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AutoscrollTests<SUT extends java.awt.dnd.Autoscroll>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.dnd.Autoscroll#autoscroll(java.awt.Point) public abstract void java.awt.dnd.Autoscroll.autoscroll(java.awt.Point)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_autoscroll_Point() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.Autoscroll#getAutoscrollInsets() public abstract java.awt.Insets java.awt.dnd.Autoscroll.getAutoscrollInsets()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAutoscrollInsets() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
