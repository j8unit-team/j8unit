package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.Dialog class java.awt.Dialog}, containing all class relevant test methods (at least
 * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is {@link org.j8unit.repository.java.awt.DialogTests}.
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
 * @see org.j8unit.repository.java.awt.DialogTests
 */
@Category(J8UnitRepository.class)
public abstract interface DialogClassTests<SUT extends Class<? extends java.awt.Dialog>>
extends org.j8unit.repository.java.awt.WindowClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.awt.Dialog$ModalExclusionType class java.awt.Dialog$ModalExclusionType}, containing
     * all class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.DialogTests.ModalExclusionTypeTests}.
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
     * @see org.j8unit.repository.java.awt.DialogTests.ModalExclusionTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ModalExclusionTypeClassTests<SUT extends Class<? extends java.awt.Dialog.ModalExclusionType>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, java.awt.Dialog.ModalExclusionType> {

        /**
         * <p>
         * Test method for {@link java.awt.Dialog.ModalExclusionType#valueOf(java.lang.String) public static
         * java.awt.Dialog$ModalExclusionType java.awt.Dialog$ModalExclusionType.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.awt.Dialog.ModalExclusionType#values() public static
         * java.awt.Dialog$ModalExclusionType[] java.awt.Dialog$ModalExclusionType.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.Dialog.ModalExclusionType> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.Dialog.ModalExclusionType.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.awt.Dialog$ModalityType class java.awt.Dialog$ModalityType}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.DialogTests.ModalityTypeTests}.
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
     * @see org.j8unit.repository.java.awt.DialogTests.ModalityTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ModalityTypeClassTests<SUT extends Class<? extends java.awt.Dialog.ModalityType>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, java.awt.Dialog.ModalityType> {

        /**
         * <p>
         * Test method for {@link java.awt.Dialog.ModalityType#valueOf(java.lang.String) public static
         * java.awt.Dialog$ModalityType java.awt.Dialog$ModalityType.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.awt.Dialog.ModalityType#values() public static java.awt.Dialog$ModalityType[]
         * java.awt.Dialog$ModalityType.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.Dialog.ModalityType> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.Dialog.ModalityType.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Dialog) public java.awt.Dialog(java.awt.Dialog)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Dialog()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Dialog);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Dialog,java.lang.String) public
     * java.awt.Dialog(java.awt.Dialog,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Dialog_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Dialog,java.lang.String);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Dialog,java.lang.String,boolean) public
     * java.awt.Dialog(java.awt.Dialog,java.lang.String,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Dialog_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Dialog,java.lang.String,boolean);
    }

    /**
     * Test method for
     * {@link java.awt.Dialog#Dialog(java.awt.Dialog,java.lang.String,boolean,java.awt.GraphicsConfiguration) public
     * java.awt.Dialog(java.awt.Dialog,java.lang.String,boolean,java.awt.GraphicsConfiguration)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Dialog_String_boolean_GraphicsConfiguration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new
                                          // Dialog(java.awt.Dialog,java.lang.String,boolean,java.awt.GraphicsConfiguration);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Frame) public java.awt.Dialog(java.awt.Frame)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Frame()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Frame);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Frame,boolean) public
     * java.awt.Dialog(java.awt.Frame,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Frame_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Frame,boolean);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Frame,java.lang.String) public
     * java.awt.Dialog(java.awt.Frame,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Frame_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Frame,java.lang.String);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Frame,java.lang.String,boolean) public
     * java.awt.Dialog(java.awt.Frame,java.lang.String,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Frame_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Frame,java.lang.String,boolean);
    }

    /**
     * Test method for
     * {@link java.awt.Dialog#Dialog(java.awt.Frame,java.lang.String,boolean,java.awt.GraphicsConfiguration) public
     * java.awt.Dialog(java.awt.Frame,java.lang.String,boolean,java.awt.GraphicsConfiguration)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Frame_String_boolean_GraphicsConfiguration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new
                                          // Dialog(java.awt.Frame,java.lang.String,boolean,java.awt.GraphicsConfiguration);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Window) public java.awt.Dialog(java.awt.Window)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Window()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Window);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Window,java.awt.Dialog.ModalityType) public
     * java.awt.Dialog(java.awt.Window,java.awt.Dialog$ModalityType)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Window_ModalityType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Window,java.awt.Dialog.ModalityType);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Window,java.lang.String) public
     * java.awt.Dialog(java.awt.Window,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Window_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new Dialog(java.awt.Window,java.lang.String);
    }

    /**
     * Test method for {@link java.awt.Dialog#Dialog(java.awt.Window,java.lang.String,java.awt.Dialog.ModalityType)
     * public java.awt.Dialog(java.awt.Window,java.lang.String,java.awt.Dialog$ModalityType)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Window_String_ModalityType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new
                                          // Dialog(java.awt.Window,java.lang.String,java.awt.Dialog.ModalityType);
    }

    /**
     * Test method for
     * {@link java.awt.Dialog#Dialog(java.awt.Window,java.lang.String,java.awt.Dialog.ModalityType,java.awt.GraphicsConfiguration)
     * public
     * java.awt.Dialog(java.awt.Window,java.lang.String,java.awt.Dialog$ModalityType,java.awt.GraphicsConfiguration)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Dialog_Window_String_ModalityType_GraphicsConfiguration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Dialog sut = null; // = new
                                          // Dialog(java.awt.Window,java.lang.String,java.awt.Dialog.ModalityType,java.awt.GraphicsConfiguration);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.Dialog> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.Dialog.class.isAssignableFrom(sut));
    }

}
