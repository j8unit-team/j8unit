package org.j8unit.repository.javax.swing;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.Painter interface javax.swing.Painter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.PainterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PainterTests<SUT extends javax.swing.Painter<T>, T>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.Painter#paint(java.awt.Graphics2D,java.lang.Object,int,int) public abstract void javax.swing.Painter.paint(java.awt.Graphics2D,java.lang.Object,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paint_Graphics2D_Object_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
