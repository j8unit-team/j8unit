package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JComboBox class javax.swing.JComboBox}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.swing.JComboBoxTests}.
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
 * @see org.j8unit.repository.javax.swing.JComboBoxTests
 */
@Category(J8UnitRepository.class)
public abstract interface JComboBoxClassTests<SUT extends Class<? extends javax.swing.JComboBox<E>>, E>
extends org.j8unit.repository.java.awt.ItemSelectableClassTests<SUT>, org.j8unit.repository.javax.swing.event.ListDataListenerClassTests<SUT>,
org.j8unit.repository.java.awt.event.ActionListenerClassTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JComboBox#JComboBox() public javax.swing.JComboBox()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JComboBox()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JComboBox<E> sut = null; // = new JComboBox();
    }

    /**
     * Test method for {@link javax.swing.JComboBox#JComboBox(java.util.Vector) public
     * javax.swing.JComboBox(java.util.Vector)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JComboBox_Vector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JComboBox<E> sut = null; // = new JComboBox(java.util.Vector);
    }

    /**
     * Test method for {@link javax.swing.JComboBox#JComboBox(java.lang.Object[]) public
     * javax.swing.JComboBox(java.lang.Object[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JComboBox_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JComboBox<E> sut = null; // = new JComboBox(java.lang.Object[]);
    }

    /**
     * Test method for {@link javax.swing.JComboBox#JComboBox(javax.swing.ComboBoxModel) public
     * javax.swing.JComboBox(javax.swing.ComboBoxModel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JComboBox_ComboBoxModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JComboBox<E> sut = null; // = new JComboBox(javax.swing.ComboBoxModel);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JComboBox<E>> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JComboBox.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.JComboBox$KeySelectionManager interface
     * javax.swing.JComboBox$KeySelectionManager}, containing all class relevant test methods (at least the test methods
     * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
     * instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JComboBoxTests.KeySelectionManagerTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JComboBoxTests.KeySelectionManagerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface KeySelectionManagerClassTests<SUT extends Class<? extends javax.swing.JComboBox.KeySelectionManager>>
    extends J8UnitTest<SUT> {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.JComboBox.KeySelectionManager> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JComboBox.KeySelectionManager.class.isAssignableFrom(sut));
        }

    }

}
