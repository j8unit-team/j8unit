package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.StyledEditorKit class javax.swing.text.StyledEditorKit}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests}.
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
 * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests
 */
@Category(J8UnitRepository.class)
public abstract interface StyledEditorKitClassTests<SUT extends Class<? extends javax.swing.text.StyledEditorKit>>
extends org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.text.StyledEditorKit#StyledEditorKit() public
     * javax.swing.text.StyledEditorKit()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StyledEditorKit()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.StyledEditorKit sut = null; // = new StyledEditorKit();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.text.StyledEditorKit> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.StyledEditorKit.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyledEditorKit$StyledTextAction class
     * javax.swing.text.StyledEditorKit$StyledTextAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface StyledTextActionClassTests<SUT extends Class<? extends javax.swing.text.StyledEditorKit.StyledTextAction>>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.StyledEditorKit.StyledTextAction#StyledTextAction(java.lang.String)
         * public javax.swing.text.StyledEditorKit$StyledTextAction(java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_StyledTextAction_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.StyledTextAction sut = null; // = new
                                                                                // StyledTextAction(java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyledEditorKit.StyledTextAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.StyledTextAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyledEditorKit$FontSizeAction class
     * javax.swing.text.StyledEditorKit$FontSizeAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontSizeActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontSizeActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FontSizeActionClassTests<SUT extends Class<? extends javax.swing.text.StyledEditorKit.FontSizeAction>>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.StyledEditorKit.FontSizeAction#FontSizeAction(java.lang.String,int)
         * public javax.swing.text.StyledEditorKit$FontSizeAction(java.lang.String,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FontSizeAction_String_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.FontSizeAction sut = null; // = new
                                                                              // FontSizeAction(java.lang.String,int);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyledEditorKit.FontSizeAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.FontSizeAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyledEditorKit$BoldAction class
     * javax.swing.text.StyledEditorKit$BoldAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.BoldActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.BoldActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface BoldActionClassTests<SUT extends Class<? extends javax.swing.text.StyledEditorKit.BoldAction>>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.StyledEditorKit.BoldAction#BoldAction() public
         * javax.swing.text.StyledEditorKit$BoldAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_BoldAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.BoldAction sut = null; // = new BoldAction();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyledEditorKit.BoldAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.BoldAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyledEditorKit$FontFamilyAction class
     * javax.swing.text.StyledEditorKit$FontFamilyAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontFamilyActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontFamilyActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FontFamilyActionClassTests<SUT extends Class<? extends javax.swing.text.StyledEditorKit.FontFamilyAction>>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.FontFamilyAction#FontFamilyAction(java.lang.String,java.lang.String)
         * public javax.swing.text.StyledEditorKit$FontFamilyAction(java.lang.String,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FontFamilyAction_String_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.FontFamilyAction sut = null; // = new
                                                                                // FontFamilyAction(java.lang.String,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyledEditorKit.FontFamilyAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.FontFamilyAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyledEditorKit$AlignmentAction class
     * javax.swing.text.StyledEditorKit$AlignmentAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.AlignmentActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.AlignmentActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AlignmentActionClassTests<SUT extends Class<? extends javax.swing.text.StyledEditorKit.AlignmentAction>>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.StyledEditorKit.AlignmentAction#AlignmentAction(java.lang.String,int)
         * public javax.swing.text.StyledEditorKit$AlignmentAction(java.lang.String,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_AlignmentAction_String_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.AlignmentAction sut = null; // = new
                                                                               // AlignmentAction(java.lang.String,int);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyledEditorKit.AlignmentAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.AlignmentAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyledEditorKit$ForegroundAction class
     * javax.swing.text.StyledEditorKit$ForegroundAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ForegroundActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ForegroundActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ForegroundActionClassTests<SUT extends Class<? extends javax.swing.text.StyledEditorKit.ForegroundAction>>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.ForegroundAction#ForegroundAction(java.lang.String,java.awt.Color)
         * public javax.swing.text.StyledEditorKit$ForegroundAction(java.lang.String,java.awt.Color)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ForegroundAction_String_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.ForegroundAction sut = null; // = new
                                                                                // ForegroundAction(java.lang.String,java.awt.Color);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyledEditorKit.ForegroundAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.ForegroundAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyledEditorKit$UnderlineAction class
     * javax.swing.text.StyledEditorKit$UnderlineAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.UnderlineActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.UnderlineActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface UnderlineActionClassTests<SUT extends Class<? extends javax.swing.text.StyledEditorKit.UnderlineAction>>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.StyledEditorKit.UnderlineAction#UnderlineAction() public
         * javax.swing.text.StyledEditorKit$UnderlineAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_UnderlineAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.UnderlineAction sut = null; // = new UnderlineAction();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyledEditorKit.UnderlineAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.UnderlineAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyledEditorKit$ItalicAction class
     * javax.swing.text.StyledEditorKit$ItalicAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ItalicActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ItalicActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ItalicActionClassTests<SUT extends Class<? extends javax.swing.text.StyledEditorKit.ItalicAction>>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.StyledEditorKit.ItalicAction#ItalicAction() public
         * javax.swing.text.StyledEditorKit$ItalicAction()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ItalicAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.ItalicAction sut = null; // = new ItalicAction();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyledEditorKit.ItalicAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.ItalicAction.class.isAssignableFrom(sut));
        }

    }

}
