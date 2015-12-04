package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.DefaultCellEditor class javax.swing.DefaultCellEditor}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.DefaultCellEditorTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.DefaultCellEditorTests
 */
@Category(J8UnitRepository.class)
public abstract interface DefaultCellEditorClassTests<SUT extends Class<? extends javax.swing.DefaultCellEditor>>
extends org.j8unit.repository.javax.swing.table.TableCellEditorClassTests<SUT>, org.j8unit.repository.javax.swing.tree.TreeCellEditorClassTests<SUT>,
org.j8unit.repository.javax.swing.AbstractCellEditorClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.DefaultCellEditor#DefaultCellEditor(javax.swing.JComboBox) public
     * javax.swing.DefaultCellEditor(javax.swing.JComboBox)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultCellEditor_JComboBox()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.DefaultCellEditor sut = null; // = new DefaultCellEditor(javax.swing.JComboBox);
    }

    /**
     * Test method for {@link javax.swing.DefaultCellEditor#DefaultCellEditor(javax.swing.JCheckBox) public
     * javax.swing.DefaultCellEditor(javax.swing.JCheckBox)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultCellEditor_JCheckBox()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.DefaultCellEditor sut = null; // = new DefaultCellEditor(javax.swing.JCheckBox);
    }

    /**
     * Test method for {@link javax.swing.DefaultCellEditor#DefaultCellEditor(javax.swing.JTextField) public
     * javax.swing.DefaultCellEditor(javax.swing.JTextField)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultCellEditor_JTextField()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.DefaultCellEditor sut = null; // = new DefaultCellEditor(javax.swing.JTextField);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.DefaultCellEditor> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.DefaultCellEditor.class.isAssignableFrom(sut));
    }

}
