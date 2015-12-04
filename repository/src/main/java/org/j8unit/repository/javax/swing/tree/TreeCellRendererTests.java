package org.j8unit.repository.javax.swing.tree;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.tree.TreeCellRenderer interface javax.swing.tree.TreeCellRenderer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.tree.TreeCellRendererClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TreeCellRendererTests<SUT extends javax.swing.tree.TreeCellRenderer>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.tree.TreeCellRenderer#getTreeCellRendererComponent(javax.swing.JTree,java.lang.Object,boolean,boolean,boolean,int,boolean) public abstract java.awt.Component javax.swing.tree.TreeCellRenderer.getTreeCellRendererComponent(javax.swing.JTree,java.lang.Object,boolean,boolean,boolean,int,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeCellRendererComponent_JTree_Object_boolean_boolean_boolean_int_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
