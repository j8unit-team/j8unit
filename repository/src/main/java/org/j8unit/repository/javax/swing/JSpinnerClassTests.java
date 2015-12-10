package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JSpinner class javax.swing.JSpinner}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.swing.JSpinnerTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.JSpinnerTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JSpinnerClassTests<SUT extends javax.swing.JSpinner>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.JSpinner$DateEditor class javax.swing.JSpinner$DateEditor}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JSpinnerTests.DateEditorTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JSpinnerTests.DateEditorTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DateEditorClassTests<SUT extends javax.swing.JSpinner.DateEditor>
    extends org.j8unit.repository.javax.swing.JSpinnerClassTests.DefaultEditorClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.JSpinner.DateEditor#DateEditor(javax.swing.JSpinner) public
         * javax.swing.JSpinner$DateEditor(javax.swing.JSpinner)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DateEditor_JSpinner()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JSpinner.DateEditor sut = null; // = new DateEditor(javax.swing.JSpinner);
        }

        /**
         * Test method for {@link javax.swing.JSpinner.DateEditor#DateEditor(javax.swing.JSpinner,java.lang.String)
         * public javax.swing.JSpinner$DateEditor(javax.swing.JSpinner,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DateEditor_JSpinner_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JSpinner.DateEditor sut = null; // = new
                                                              // DateEditor(javax.swing.JSpinner,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JSpinner.DateEditor.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.JSpinner$DefaultEditor class javax.swing.JSpinner$DefaultEditor}, containing
     * all class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JSpinnerTests.DefaultEditorTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JSpinnerTests.DefaultEditorTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultEditorClassTests<SUT extends javax.swing.JSpinner.DefaultEditor>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerClassTests<SUT>, org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>,
    org.j8unit.repository.java.awt.LayoutManagerClassTests<SUT>, org.j8unit.repository.javax.swing.JPanelClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.JSpinner.DefaultEditor#DefaultEditor(javax.swing.JSpinner) public
         * javax.swing.JSpinner$DefaultEditor(javax.swing.JSpinner)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DefaultEditor_JSpinner()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JSpinner.DefaultEditor sut = null; // = new DefaultEditor(javax.swing.JSpinner);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JSpinner.DefaultEditor.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.JSpinner$ListEditor class javax.swing.JSpinner$ListEditor}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JSpinnerTests.ListEditorTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JSpinnerTests.ListEditorTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ListEditorClassTests<SUT extends javax.swing.JSpinner.ListEditor>
    extends org.j8unit.repository.javax.swing.JSpinnerClassTests.DefaultEditorClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.JSpinner.ListEditor#ListEditor(javax.swing.JSpinner) public
         * javax.swing.JSpinner$ListEditor(javax.swing.JSpinner)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ListEditor_JSpinner()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JSpinner.ListEditor sut = null; // = new ListEditor(javax.swing.JSpinner);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JSpinner.ListEditor.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.JSpinner$NumberEditor class javax.swing.JSpinner$NumberEditor}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JSpinnerTests.NumberEditorTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JSpinnerTests.NumberEditorTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface NumberEditorClassTests<SUT extends javax.swing.JSpinner.NumberEditor>
    extends org.j8unit.repository.javax.swing.JSpinnerClassTests.DefaultEditorClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.JSpinner.NumberEditor#NumberEditor(javax.swing.JSpinner) public
         * javax.swing.JSpinner$NumberEditor(javax.swing.JSpinner)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_NumberEditor_JSpinner()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JSpinner.NumberEditor sut = null; // = new NumberEditor(javax.swing.JSpinner);
        }

        /**
         * Test method for {@link javax.swing.JSpinner.NumberEditor#NumberEditor(javax.swing.JSpinner,java.lang.String)
         * public javax.swing.JSpinner$NumberEditor(javax.swing.JSpinner,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_NumberEditor_JSpinner_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JSpinner.NumberEditor sut = null; // = new
                                                                // NumberEditor(javax.swing.JSpinner,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JSpinner.NumberEditor.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.JSpinner#JSpinner() public javax.swing.JSpinner()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JSpinner()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JSpinner sut = null; // = new JSpinner();
    }

    /**
     * Test method for {@link javax.swing.JSpinner#JSpinner(javax.swing.SpinnerModel) public
     * javax.swing.JSpinner(javax.swing.SpinnerModel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JSpinner_SpinnerModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JSpinner sut = null; // = new JSpinner(javax.swing.SpinnerModel);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JSpinner.class.isAssignableFrom(sut));
    }

}
