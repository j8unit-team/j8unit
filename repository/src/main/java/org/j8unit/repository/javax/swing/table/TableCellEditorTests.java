package org.j8unit.repository.javax.swing.table;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.table.TableCellEditor interface javax.swing.table.TableCellEditor},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.table.TableCellEditorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TableCellEditorTests<SUT extends javax.swing.table.TableCellEditor>
extends org.j8unit.repository.javax.swing.CellEditorTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.table.TableCellEditor#getTableCellEditorComponent(javax.swing.JTable,java.lang.Object,boolean,int,int) public abstract java.awt.Component javax.swing.table.TableCellEditor.getTableCellEditorComponent(javax.swing.JTable,java.lang.Object,boolean,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTableCellEditorComponent_JTable_Object_boolean_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
