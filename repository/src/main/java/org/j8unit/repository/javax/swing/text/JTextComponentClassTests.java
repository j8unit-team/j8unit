package org.j8unit.repository.javax.swing.text;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.JTextComponent class javax.swing.text.JTextComponent},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.text.JTextComponentTests}.
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
 * @see org.j8unit.repository.javax.swing.text.JTextComponentTests
 */
@Category(J8UnitRepository.class)
public abstract interface JTextComponentClassTests<SUT extends Class<? extends javax.swing.text.JTextComponent>>
extends org.j8unit.repository.javax.swing.ScrollableClassTests<SUT>,
        org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
        org.j8unit.repository.javax.swing.JComponentClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.text.JTextComponent#JTextComponent() public javax.swing.text.JTextComponent()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTextComponent() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.text.JTextComponent sut = null; // = new JTextComponent();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.text.JTextComponent> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.JTextComponent.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.JTextComponent#loadKeymap(javax.swing.text.Keymap,javax.swing.text.JTextComponent.KeyBinding[],javax.swing.Action[]) public static void javax.swing.text.JTextComponent.loadKeymap(javax.swing.text.Keymap,javax.swing.text.JTextComponent$KeyBinding[],javax.swing.Action[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadKeymap_Keymap_KeyBindingArray_ActionArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.JTextComponent#addKeymap(java.lang.String,javax.swing.text.Keymap) public static javax.swing.text.Keymap javax.swing.text.JTextComponent.addKeymap(java.lang.String,javax.swing.text.Keymap)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addKeymap_String_Keymap() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.JTextComponent#removeKeymap(java.lang.String) public static javax.swing.text.Keymap javax.swing.text.JTextComponent.removeKeymap(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeKeymap_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.JTextComponent#getKeymap(java.lang.String) public static javax.swing.text.Keymap javax.swing.text.JTextComponent.getKeymap(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeymap_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.JTextComponent$DropLocation class javax.swing.text.JTextComponent$DropLocation},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.JTextComponentTests.DropLocationTests}.
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
     * @see org.j8unit.repository.javax.swing.text.JTextComponentTests.DropLocationTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface DropLocationClassTests<SUT extends Class<? extends javax.swing.text.JTextComponent.DropLocation>>
    extends org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.JTextComponent.DropLocation> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.JTextComponent.DropLocation.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.JTextComponent$KeyBinding class javax.swing.text.JTextComponent$KeyBinding},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.JTextComponentTests.KeyBindingTests}.
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
     * @see org.j8unit.repository.javax.swing.text.JTextComponentTests.KeyBindingTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface KeyBindingClassTests<SUT extends Class<? extends javax.swing.text.JTextComponent.KeyBinding>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.JTextComponent.KeyBinding#KeyBinding(javax.swing.KeyStroke,java.lang.String) public javax.swing.text.JTextComponent$KeyBinding(javax.swing.KeyStroke,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_KeyBinding_KeyStroke_String() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.JTextComponent.KeyBinding sut = null; // = new KeyBinding(javax.swing.KeyStroke,java.lang.String);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.JTextComponent.KeyBinding> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.JTextComponent.KeyBinding.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.JTextComponent$AccessibleJTextComponent class javax.swing.text.JTextComponent$AccessibleJTextComponent},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.JTextComponentTests.AccessibleJTextComponentTests}.
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
     * @see org.j8unit.repository.javax.swing.text.JTextComponentTests.AccessibleJTextComponentTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AccessibleJTextComponentClassTests<SUT extends Class<? extends javax.swing.text.JTextComponent.AccessibleJTextComponent>>
    extends org.j8unit.repository.javax.accessibility.AccessibleTextClassTests<SUT>,
            org.j8unit.repository.javax.swing.event.CaretListenerClassTests<SUT>,
            org.j8unit.repository.javax.swing.event.DocumentListenerClassTests<SUT>,
            org.j8unit.repository.javax.accessibility.AccessibleActionClassTests<SUT>,
            org.j8unit.repository.javax.accessibility.AccessibleEditableTextClassTests<SUT>,
            org.j8unit.repository.javax.accessibility.AccessibleExtendedTextClassTests<SUT>,
            org.j8unit.repository.javax.swing.JComponentClassTests.AccessibleJComponentClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.JTextComponent.AccessibleJTextComponent#AccessibleJTextComponent(javax.swing.text.JTextComponent) public javax.swing.text.JTextComponent$AccessibleJTextComponent(javax.swing.text.JTextComponent)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_AccessibleJTextComponent_JTextComponent() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.JTextComponent.AccessibleJTextComponent sut = null; // = new AccessibleJTextComponent(javax.swing.text.JTextComponent);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.JTextComponent.AccessibleJTextComponent> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.JTextComponent.AccessibleJTextComponent.class.isAssignableFrom(sut));
        }

    }

}
