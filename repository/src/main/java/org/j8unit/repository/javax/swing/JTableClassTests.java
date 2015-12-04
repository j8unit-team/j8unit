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
 * Test class for {@link javax.swing.JTable class javax.swing.JTable},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.JTableTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.JTableTests
 */
@Category(J8UnitRepository.class)
public abstract interface JTableClassTests<SUT extends Class<? extends javax.swing.JTable>>
extends org.j8unit.repository.javax.swing.event.TableModelListenerClassTests<SUT>,
        org.j8unit.repository.javax.swing.ScrollableClassTests<SUT>,
        org.j8unit.repository.javax.swing.event.TableColumnModelListenerClassTests<SUT>,
        org.j8unit.repository.javax.swing.event.ListSelectionListenerClassTests<SUT>,
        org.j8unit.repository.javax.swing.event.CellEditorListenerClassTests<SUT>,
        org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
        org.j8unit.repository.javax.swing.event.RowSorterListenerClassTests<SUT>,
        org.j8unit.repository.javax.swing.JComponentClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.JTable#JTable(javax.swing.table.TableModel,javax.swing.table.TableColumnModel,javax.swing.ListSelectionModel) public javax.swing.JTable(javax.swing.table.TableModel,javax.swing.table.TableColumnModel,javax.swing.ListSelectionModel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTable_TableModel_TableColumnModel_ListSelectionModel() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JTable sut = null; // = new JTable(javax.swing.table.TableModel,javax.swing.table.TableColumnModel,javax.swing.ListSelectionModel);
    }

    /**
     * Test method for {@link javax.swing.JTable#JTable(int,int) public javax.swing.JTable(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTable_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JTable sut = null; // = new JTable(int,int);
    }

    /**
     * Test method for {@link javax.swing.JTable#JTable(java.util.Vector,java.util.Vector) public javax.swing.JTable(java.util.Vector,java.util.Vector)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTable_Vector_Vector() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JTable sut = null; // = new JTable(java.util.Vector,java.util.Vector);
    }

    /**
     * Test method for {@link javax.swing.JTable#JTable(java.lang.Object[][],java.lang.Object[]) public javax.swing.JTable(java.lang.Object[][],java.lang.Object[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTable_ObjectArrayArray_ObjectArray() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JTable sut = null; // = new JTable(java.lang.Object[][],java.lang.Object[]);
    }

    /**
     * Test method for {@link javax.swing.JTable#JTable() public javax.swing.JTable()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JTable sut = null; // = new JTable();
    }

    /**
     * Test method for {@link javax.swing.JTable#JTable(javax.swing.table.TableModel) public javax.swing.JTable(javax.swing.table.TableModel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTable_TableModel() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JTable sut = null; // = new JTable(javax.swing.table.TableModel);
    }

    /**
     * Test method for {@link javax.swing.JTable#JTable(javax.swing.table.TableModel,javax.swing.table.TableColumnModel) public javax.swing.JTable(javax.swing.table.TableModel,javax.swing.table.TableColumnModel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTable_TableModel_TableColumnModel() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JTable sut = null; // = new JTable(javax.swing.table.TableModel,javax.swing.table.TableColumnModel);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.JTable> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JTable.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#createScrollPaneForTable(javax.swing.JTable) public static javax.swing.JScrollPane javax.swing.JTable.createScrollPaneForTable(javax.swing.JTable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createScrollPaneForTable_JTable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.JTable$DropLocation class javax.swing.JTable$DropLocation},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.JTableTests.DropLocationTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JTableTests.DropLocationTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface DropLocationClassTests<SUT extends Class<? extends javax.swing.JTable.DropLocation>>
    extends org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.JTable.DropLocation> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JTable.DropLocation.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.JTable$PrintMode class javax.swing.JTable$PrintMode},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.JTableTests.PrintModeTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JTableTests.PrintModeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PrintModeClassTests<SUT extends Class<? extends javax.swing.JTable.PrintMode>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,javax.swing.JTable.PrintMode>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.JTable.PrintMode> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JTable.PrintMode.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.swing.JTable.PrintMode#valueOf(java.lang.String) public static javax.swing.JTable$PrintMode javax.swing.JTable$PrintMode.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.JTable.PrintMode#values() public static javax.swing.JTable$PrintMode[] javax.swing.JTable$PrintMode.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
