package org.j8unit.repository.javax.swing.text.html;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.HTMLEditorKit class javax.swing.text.html.HTMLEditorKit}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests}.
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
 * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests
 */
@Category(J8UnitRepository.class)
public abstract interface HTMLEditorKitClassTests<SUT extends Class<? extends javax.swing.text.html.HTMLEditorKit>>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#HTMLEditorKit() public
     * javax.swing.text.html.HTMLEditorKit()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HTMLEditorKit()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.html.HTMLEditorKit sut = null; // = new HTMLEditorKit();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.text.html.HTMLEditorKit> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.html.HTMLEditorKit.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$LinkController class
     * javax.swing.text.html.HTMLEditorKit$LinkController}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.LinkControllerTests}.
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
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.LinkControllerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface LinkControllerClassTests<SUT extends Class<? extends javax.swing.text.html.HTMLEditorKit.LinkController>>
    extends org.j8unit.repository.java.awt.event.MouseMotionListenerClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.awt.event.MouseAdapterClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.LinkController#LinkController() public
         * javax.swing.text.html.HTMLEditorKit$LinkController()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_LinkController()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLEditorKit.LinkController sut = null; // = new LinkController();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.html.HTMLEditorKit.LinkController> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLEditorKit.LinkController.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$HTMLFactory class
     * javax.swing.text.html.HTMLEditorKit$HTMLFactory}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.HTMLFactoryTests}.
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
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.HTMLFactoryTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface HTMLFactoryClassTests<SUT extends Class<? extends javax.swing.text.html.HTMLEditorKit.HTMLFactory>>
    extends org.j8unit.repository.javax.swing.text.ViewFactoryClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.HTMLFactory#HTMLFactory() public
         * javax.swing.text.html.HTMLEditorKit$HTMLFactory()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_HTMLFactory()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLEditorKit.HTMLFactory sut = null; // = new HTMLFactory();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.html.HTMLEditorKit.HTMLFactory> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLEditorKit.HTMLFactory.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$ParserCallback class
     * javax.swing.text.html.HTMLEditorKit$ParserCallback}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserCallbackTests}.
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
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserCallbackTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ParserCallbackClassTests<SUT extends Class<? extends javax.swing.text.html.HTMLEditorKit.ParserCallback>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#ParserCallback() public
         * javax.swing.text.html.HTMLEditorKit$ParserCallback()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ParserCallback()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLEditorKit.ParserCallback sut = null; // = new ParserCallback();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.html.HTMLEditorKit.ParserCallback> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLEditorKit.ParserCallback.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$HTMLTextAction class
     * javax.swing.text.html.HTMLEditorKit$HTMLTextAction}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.HTMLTextActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.HTMLTextActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface HTMLTextActionClassTests<SUT extends Class<? extends javax.swing.text.html.HTMLEditorKit.HTMLTextAction>>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.HTMLTextAction#HTMLTextAction(java.lang.String)
         * public javax.swing.text.html.HTMLEditorKit$HTMLTextAction(java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_HTMLTextAction_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLEditorKit.HTMLTextAction sut = null; // = new
                                                                                 // HTMLTextAction(java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.html.HTMLEditorKit.HTMLTextAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLEditorKit.HTMLTextAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$Parser class
     * javax.swing.text.html.HTMLEditorKit$Parser}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserTests}.
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
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ParserClassTests<SUT extends Class<? extends javax.swing.text.html.HTMLEditorKit.Parser>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.Parser#Parser() public
         * javax.swing.text.html.HTMLEditorKit$Parser()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Parser()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLEditorKit.Parser sut = null; // = new Parser();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.html.HTMLEditorKit.Parser> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLEditorKit.Parser.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction class
     * javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.InsertHTMLTextActionTests}.
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
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.InsertHTMLTextActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface InsertHTMLTextActionClassTests<SUT extends Class<? extends javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction>>
    extends org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.HTMLTextActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction#InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML.Tag,javax.swing.text.html.HTML.Tag,javax.swing.text.html.HTML.Tag,javax.swing.text.html.HTML.Tag)
         * public
         * javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_InsertHTMLTextAction_String_String_Tag_Tag_Tag_Tag()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction sut = null; // = new
                                                                                       // InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML.Tag,javax.swing.text.html.HTML.Tag,javax.swing.text.html.HTML.Tag,javax.swing.text.html.HTML.Tag);
        }

        /**
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction#InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML.Tag,javax.swing.text.html.HTML.Tag)
         * public
         * javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_InsertHTMLTextAction_String_String_Tag_Tag()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction sut = null; // = new
                                                                                       // InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML.Tag,javax.swing.text.html.HTML.Tag);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction.class.isAssignableFrom(sut));
        }

    }

}
