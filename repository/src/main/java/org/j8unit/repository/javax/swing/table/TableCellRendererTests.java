package org.j8unit.repository.javax.swing.table;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.table.TableCellRenderer interface
 * javax.swing.table.TableCellRenderer}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link TableCellRendererClassTests}.
 * </p>
 *
 * @see javax.swing.table.TableCellRenderer interface javax.swing.table.TableCellRenderer (the hereby targeted
 *      class-under-test class)
 * @see TableCellRendererClassTests TableCellRendererClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TableCellRendererTests<SUT extends javax.swing.table.TableCellRenderer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, Object, boolean, boolean, int, int)
     * public abstract java.awt.Component
     * javax.swing.table.TableCellRenderer.getTableCellRendererComponent(javax.swing.JTable,java.lang.Object,boolean,boolean,int,int)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, Object, boolean, boolean, int, int)
     * public abstract java.awt.Component
     * javax.swing.table.TableCellRenderer.getTableCellRendererComponent(javax.swing.JTable,java.lang.Object,boolean,boolean,int,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, Object, boolean,
     *      boolean, int, int) public abstract java.awt.Component
     *      javax.swing.table.TableCellRenderer.getTableCellRendererComponent(javax.swing.JTable,java.lang.Object,
     *      boolean,boolean,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTableCellRendererComponent_JTable_Object_boolean_boolean_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
