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
 * Test class for {@link javax.swing.ListCellRenderer interface javax.swing.ListCellRenderer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.ListCellRendererClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ListCellRendererTests<SUT extends javax.swing.ListCellRenderer<E>, E>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing.JList,java.lang.Object,int,boolean,boolean) public abstract java.awt.Component javax.swing.ListCellRenderer.getListCellRendererComponent(javax.swing.JList,java.lang.Object,int,boolean,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getListCellRendererComponent_JList_Object_int_boolean_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
