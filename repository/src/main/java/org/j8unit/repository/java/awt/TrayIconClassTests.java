package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.TrayIcon class java.awt.TrayIcon}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.awt.TrayIconTests}.
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
 * @see org.j8unit.repository.java.awt.TrayIconTests
 */
@Category(J8UnitRepository.class)
public abstract interface TrayIconClassTests<SUT extends Class<? extends java.awt.TrayIcon>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.awt.TrayIcon$MessageType class java.awt.TrayIcon$MessageType}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.TrayIconTests.MessageTypeTests}.
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
     * @see org.j8unit.repository.java.awt.TrayIconTests.MessageTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MessageTypeClassTests<SUT extends Class<? extends java.awt.TrayIcon.MessageType>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, java.awt.TrayIcon.MessageType> {

        /**
         * <p>
         * Test method for {@link java.awt.TrayIcon.MessageType#valueOf(java.lang.String) public static
         * java.awt.TrayIcon$MessageType java.awt.TrayIcon$MessageType.valueOf(java.lang.String)}.
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
         * Test method for {@link java.awt.TrayIcon.MessageType#values() public static java.awt.TrayIcon$MessageType[]
         * java.awt.TrayIcon$MessageType.values()}.
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
            final Class<? extends java.awt.TrayIcon.MessageType> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.TrayIcon.MessageType.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.awt.TrayIcon#TrayIcon(java.awt.Image) public java.awt.TrayIcon(java.awt.Image)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TrayIcon_Image()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.TrayIcon sut = null; // = new TrayIcon(java.awt.Image);
    }

    /**
     * Test method for {@link java.awt.TrayIcon#TrayIcon(java.awt.Image,java.lang.String) public
     * java.awt.TrayIcon(java.awt.Image,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TrayIcon_Image_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.TrayIcon sut = null; // = new TrayIcon(java.awt.Image,java.lang.String);
    }

    /**
     * Test method for {@link java.awt.TrayIcon#TrayIcon(java.awt.Image,java.lang.String,java.awt.PopupMenu) public
     * java.awt.TrayIcon(java.awt.Image,java.lang.String,java.awt.PopupMenu)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TrayIcon_Image_String_PopupMenu()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.TrayIcon sut = null; // = new TrayIcon(java.awt.Image,java.lang.String,java.awt.PopupMenu);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.TrayIcon> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.TrayIcon.class.isAssignableFrom(sut));
    }

}
