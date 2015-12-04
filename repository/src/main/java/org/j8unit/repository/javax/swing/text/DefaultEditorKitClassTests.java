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
 * Test class for {@link javax.swing.text.DefaultEditorKit class javax.swing.text.DefaultEditorKit},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests}.
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
 * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitTests
 */
@Category(J8UnitRepository.class)
public abstract interface DefaultEditorKitClassTests<SUT extends Class<? extends javax.swing.text.DefaultEditorKit>>
extends org.j8unit.repository.javax.swing.text.EditorKitClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.text.DefaultEditorKit#DefaultEditorKit() public javax.swing.text.DefaultEditorKit()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultEditorKit() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.text.DefaultEditorKit sut = null; // = new DefaultEditorKit();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.text.DefaultEditorKit> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.DefaultEditorKit.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultEditorKit$PasteAction class javax.swing.text.DefaultEditorKit$PasteAction},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.PasteActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.PasteActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PasteActionClassTests<SUT extends Class<? extends javax.swing.text.DefaultEditorKit.PasteAction>>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.DefaultEditorKit.PasteAction#PasteAction() public javax.swing.text.DefaultEditorKit$PasteAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PasteAction() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.DefaultEditorKit.PasteAction sut = null; // = new PasteAction();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.DefaultEditorKit.PasteAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultEditorKit.PasteAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction class javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.DefaultKeyTypedActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.DefaultKeyTypedActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultKeyTypedActionClassTests<SUT extends Class<? extends javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction>>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction#DefaultKeyTypedAction() public javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DefaultKeyTypedAction() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction sut = null; // = new DefaultKeyTypedAction();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultEditorKit$BeepAction class javax.swing.text.DefaultEditorKit$BeepAction},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.BeepActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.BeepActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface BeepActionClassTests<SUT extends Class<? extends javax.swing.text.DefaultEditorKit.BeepAction>>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.DefaultEditorKit.BeepAction#BeepAction() public javax.swing.text.DefaultEditorKit$BeepAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_BeepAction() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.DefaultEditorKit.BeepAction sut = null; // = new BeepAction();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.DefaultEditorKit.BeepAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultEditorKit.BeepAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultEditorKit$CopyAction class javax.swing.text.DefaultEditorKit$CopyAction},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.CopyActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.CopyActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CopyActionClassTests<SUT extends Class<? extends javax.swing.text.DefaultEditorKit.CopyAction>>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.DefaultEditorKit.CopyAction#CopyAction() public javax.swing.text.DefaultEditorKit$CopyAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CopyAction() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.DefaultEditorKit.CopyAction sut = null; // = new CopyAction();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.DefaultEditorKit.CopyAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultEditorKit.CopyAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultEditorKit$InsertTabAction class javax.swing.text.DefaultEditorKit$InsertTabAction},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.InsertTabActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.InsertTabActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface InsertTabActionClassTests<SUT extends Class<? extends javax.swing.text.DefaultEditorKit.InsertTabAction>>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.DefaultEditorKit.InsertTabAction#InsertTabAction() public javax.swing.text.DefaultEditorKit$InsertTabAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_InsertTabAction() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.DefaultEditorKit.InsertTabAction sut = null; // = new InsertTabAction();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.DefaultEditorKit.InsertTabAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultEditorKit.InsertTabAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultEditorKit$InsertBreakAction class javax.swing.text.DefaultEditorKit$InsertBreakAction},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.InsertBreakActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.InsertBreakActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface InsertBreakActionClassTests<SUT extends Class<? extends javax.swing.text.DefaultEditorKit.InsertBreakAction>>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.DefaultEditorKit.InsertBreakAction#InsertBreakAction() public javax.swing.text.DefaultEditorKit$InsertBreakAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_InsertBreakAction() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.DefaultEditorKit.InsertBreakAction sut = null; // = new InsertBreakAction();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.DefaultEditorKit.InsertBreakAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultEditorKit.InsertBreakAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultEditorKit$CutAction class javax.swing.text.DefaultEditorKit$CutAction},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.CutActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.CutActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CutActionClassTests<SUT extends Class<? extends javax.swing.text.DefaultEditorKit.CutAction>>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.DefaultEditorKit.CutAction#CutAction() public javax.swing.text.DefaultEditorKit$CutAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CutAction() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.DefaultEditorKit.CutAction sut = null; // = new CutAction();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.DefaultEditorKit.CutAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultEditorKit.CutAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultEditorKit$InsertContentAction class javax.swing.text.DefaultEditorKit$InsertContentAction},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.InsertContentActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.InsertContentActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface InsertContentActionClassTests<SUT extends Class<? extends javax.swing.text.DefaultEditorKit.InsertContentAction>>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.DefaultEditorKit.InsertContentAction#InsertContentAction() public javax.swing.text.DefaultEditorKit$InsertContentAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_InsertContentAction() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.DefaultEditorKit.InsertContentAction sut = null; // = new InsertContentAction();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.DefaultEditorKit.InsertContentAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultEditorKit.InsertContentAction.class.isAssignableFrom(sut));
        }

    }

}
