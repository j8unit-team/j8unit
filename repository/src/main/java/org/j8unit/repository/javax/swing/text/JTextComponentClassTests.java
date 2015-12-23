package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.JTextComponent class javax.swing.text.JTextComponent}
 * , containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.JTextComponentTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.JTextComponentTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.JTextComponent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JTextComponentClassTests<SUT extends javax.swing.text.JTextComponent>
extends org.j8unit.repository.javax.swing.ScrollableClassTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.JTextComponent.AccessibleJTextComponent class
     * javax.swing.text.JTextComponent$AccessibleJTextComponent}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.JTextComponentTests.AccessibleJTextComponentTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.JTextComponentTests.AccessibleJTextComponentTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.JTextComponent.AccessibleJTextComponent
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AccessibleJTextComponentClassTests<SUT extends javax.swing.text.JTextComponent.AccessibleJTextComponent>
    extends org.j8unit.repository.javax.accessibility.AccessibleTextClassTests<SUT>, org.j8unit.repository.javax.swing.event.CaretListenerClassTests<SUT>,
    org.j8unit.repository.javax.swing.event.DocumentListenerClassTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleActionClassTests<SUT>,
    org.j8unit.repository.javax.accessibility.AccessibleEditableTextClassTests<SUT>,
    org.j8unit.repository.javax.accessibility.AccessibleExtendedTextClassTests<SUT>,
    org.j8unit.repository.javax.swing.JComponentClassTests.AccessibleJComponentClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.JTextComponent.AccessibleJTextComponent#AccessibleJTextComponent(javax.swing.text.JTextComponent)
         * public javax.swing.text.JTextComponent$AccessibleJTextComponent(javax.swing.text.JTextComponent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.JTextComponent.AccessibleJTextComponent#AccessibleJTextComponent(javax.swing.
         *             text.JTextComponent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_AccessibleJTextComponent_JTextComponent()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.JTextComponent.AccessibleJTextComponent sut = null; // = new
                                                                                       // AccessibleJTextComponent(javax.swing.text.JTextComponent);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.JTextComponent.AccessibleJTextComponent#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.JTextComponent.AccessibleJTextComponent.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.JTextComponent.DropLocation class
     * javax.swing.text.JTextComponent$DropLocation}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.JTextComponentTests.DropLocationTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.JTextComponentTests.DropLocationTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.JTextComponent.DropLocation
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DropLocationClassTests<SUT extends javax.swing.text.JTextComponent.DropLocation>
    extends org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.JTextComponent.DropLocation#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.JTextComponent.DropLocation.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.JTextComponent.KeyBinding class
     * javax.swing.text.JTextComponent$KeyBinding}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.JTextComponentTests.KeyBindingTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.JTextComponentTests.KeyBindingTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.JTextComponent.KeyBinding
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KeyBindingClassTests<SUT extends javax.swing.text.JTextComponent.KeyBinding>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.JTextComponent.KeyBinding#KeyBinding(javax.swing.KeyStroke, java.lang.String) public
         * javax.swing.text.JTextComponent$KeyBinding(javax.swing.KeyStroke,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.JTextComponent.KeyBinding#KeyBinding(javax.swing.KeyStroke, java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_KeyBinding_KeyStroke_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.JTextComponent.KeyBinding sut = null; // = new KeyBinding(javax.swing.KeyStroke,
                                                                         // java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.JTextComponent.KeyBinding#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.JTextComponent.KeyBinding.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.JTextComponent#JTextComponent() public javax.swing.text.JTextComponent()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.JTextComponent#JTextComponent()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTextComponent()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.JTextComponent sut = null; // = new JTextComponent();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.JTextComponent#addKeymap(java.lang.String, javax.swing.text.Keymap)
     * public static javax.swing.text.Keymap
     * javax.swing.text.JTextComponent.addKeymap(java.lang.String,javax.swing.text.Keymap)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.JTextComponent#addKeymap(java.lang.String, javax.swing.text.Keymap)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addKeymap_String_Keymap()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.JTextComponent#getKeymap(java.lang.String) public static
     * javax.swing.text.Keymap javax.swing.text.JTextComponent.getKeymap(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.JTextComponent#getKeymap(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeymap_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.JTextComponent#loadKeymap(javax.swing.text.Keymap, javax.swing.text.JTextComponent.KeyBinding[], javax.swing.Action[])
     * public static void
     * javax.swing.text.JTextComponent.loadKeymap(javax.swing.text.Keymap,javax.swing.text.JTextComponent$KeyBinding[],javax.swing.Action[])}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.JTextComponent#loadKeymap(javax.swing.text.Keymap,
     *             javax.swing.text.JTextComponent.KeyBinding[], javax.swing.Action[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadKeymap_Keymap_KeyBindingArray_ActionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.JTextComponent#removeKeymap(java.lang.String) public static
     * javax.swing.text.Keymap javax.swing.text.JTextComponent.removeKeymap(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.JTextComponent#removeKeymap(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeKeymap_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.text.JTextComponent#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.JTextComponent.class.isAssignableFrom(sut));
    }

}
