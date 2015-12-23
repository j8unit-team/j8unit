package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit class
 * javax.swing.text.StyledEditorKit}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests}.
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
 * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.StyledEditorKit
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StyledEditorKitClassTests<SUT extends javax.swing.text.StyledEditorKit>
extends org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.AlignmentAction class
     * javax.swing.text.StyledEditorKit$AlignmentAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.AlignmentActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.AlignmentActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.AlignmentAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AlignmentActionClassTests<SUT extends javax.swing.text.StyledEditorKit.AlignmentAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.AlignmentAction#AlignmentAction(java.lang.String, int) public
         * javax.swing.text.StyledEditorKit$AlignmentAction(java.lang.String,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.AlignmentAction#AlignmentAction(java.lang.String, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_AlignmentAction_String_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.AlignmentAction sut = null; // = new
                                                                               // AlignmentAction(java.lang.String,
                                                                               // int);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.AlignmentAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.AlignmentAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.BoldAction class
     * javax.swing.text.StyledEditorKit$BoldAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.BoldActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.BoldActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.BoldAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BoldActionClassTests<SUT extends javax.swing.text.StyledEditorKit.BoldAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.StyledEditorKit.BoldAction#BoldAction() public
         * javax.swing.text.StyledEditorKit$BoldAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.BoldAction#BoldAction()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.BoldAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.BoldAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.FontFamilyAction class
     * javax.swing.text.StyledEditorKit$FontFamilyAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontFamilyActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontFamilyActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.FontFamilyAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FontFamilyActionClassTests<SUT extends javax.swing.text.StyledEditorKit.FontFamilyAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.FontFamilyAction#FontFamilyAction(java.lang.String, java.lang.String)
         * public javax.swing.text.StyledEditorKit$FontFamilyAction(java.lang.String,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.FontFamilyAction#FontFamilyAction(java.lang.String,
         *             java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FontFamilyAction_String_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.FontFamilyAction sut = null; // = new
                                                                                // FontFamilyAction(java.lang.String,
                                                                                // java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.FontFamilyAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.FontFamilyAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.FontSizeAction class
     * javax.swing.text.StyledEditorKit$FontSizeAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontSizeActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontSizeActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.FontSizeAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FontSizeActionClassTests<SUT extends javax.swing.text.StyledEditorKit.FontSizeAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.StyledEditorKit.FontSizeAction#FontSizeAction(java.lang.String, int)
         * public javax.swing.text.StyledEditorKit$FontSizeAction(java.lang.String,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.FontSizeAction#FontSizeAction(java.lang.String, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FontSizeAction_String_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.FontSizeAction sut = null; // = new FontSizeAction(java.lang.String,
                                                                              // int);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.FontSizeAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.FontSizeAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.ForegroundAction class
     * javax.swing.text.StyledEditorKit$ForegroundAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ForegroundActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ForegroundActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.ForegroundAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ForegroundActionClassTests<SUT extends javax.swing.text.StyledEditorKit.ForegroundAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.ForegroundAction#ForegroundAction(java.lang.String, java.awt.Color)
         * public javax.swing.text.StyledEditorKit$ForegroundAction(java.lang.String,java.awt.Color)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.ForegroundAction#ForegroundAction(java.lang.String,
         *             java.awt.Color)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ForegroundAction_String_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyledEditorKit.ForegroundAction sut = null; // = new
                                                                                // ForegroundAction(java.lang.String,
                                                                                // java.awt.Color);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.ForegroundAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.ForegroundAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.ItalicAction class
     * javax.swing.text.StyledEditorKit$ItalicAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ItalicActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ItalicActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.ItalicAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ItalicActionClassTests<SUT extends javax.swing.text.StyledEditorKit.ItalicAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.StyledEditorKit.ItalicAction#ItalicAction() public
         * javax.swing.text.StyledEditorKit$ItalicAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.ItalicAction#ItalicAction()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.ItalicAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.ItalicAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.StyledTextAction class
     * javax.swing.text.StyledEditorKit$StyledTextAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.StyledTextAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StyledTextActionClassTests<SUT extends javax.swing.text.StyledEditorKit.StyledTextAction>
    extends org.j8unit.repository.javax.swing.text.TextActionClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.StyledEditorKit.StyledTextAction#StyledTextAction(java.lang.String)
         * public javax.swing.text.StyledEditorKit$StyledTextAction(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.StyledTextAction#StyledTextAction(java.lang.String)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.StyledTextAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.StyledTextAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.UnderlineAction class
     * javax.swing.text.StyledEditorKit$UnderlineAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.UnderlineActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitTests.UnderlineActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.UnderlineAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UnderlineActionClassTests<SUT extends javax.swing.text.StyledEditorKit.UnderlineAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.StyledEditorKit.UnderlineAction#UnderlineAction() public
         * javax.swing.text.StyledEditorKit$UnderlineAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.UnderlineAction#UnderlineAction()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.UnderlineAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyledEditorKit.UnderlineAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyledEditorKit#StyledEditorKit() public
     * javax.swing.text.StyledEditorKit()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#StyledEditorKit()
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

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.StyledEditorKit.class.isAssignableFrom(sut));
    }

}
