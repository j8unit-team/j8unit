package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JPopupMenu class javax.swing.JPopupMenu}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JPopupMenuTests}.
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
 * @see org.j8unit.repository.javax.swing.JPopupMenuTests
 */
@Category(J8UnitRepository.class)
public abstract interface JPopupMenuClassTests<SUT extends Class<? extends javax.swing.JPopupMenu>>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.MenuElementClassTests<SUT>,
org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.JPopupMenu$Separator class javax.swing.JPopupMenu$Separator}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JPopupMenuTests.SeparatorTests}.
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
     * @see org.j8unit.repository.javax.swing.JPopupMenuTests.SeparatorTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SeparatorClassTests<SUT extends Class<? extends javax.swing.JPopupMenu.Separator>>
    extends org.j8unit.repository.javax.swing.JSeparatorClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.JPopupMenu.Separator#Separator() public
         * javax.swing.JPopupMenu$Separator()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Separator()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JPopupMenu.Separator sut = null; // = new Separator();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.JPopupMenu.Separator> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JPopupMenu.Separator.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.JPopupMenu#JPopupMenu() public javax.swing.JPopupMenu()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JPopupMenu()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JPopupMenu sut = null; // = new JPopupMenu();
    }

    /**
     * Test method for {@link javax.swing.JPopupMenu#JPopupMenu(java.lang.String) public
     * javax.swing.JPopupMenu(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JPopupMenu_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JPopupMenu sut = null; // = new JPopupMenu(java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JPopupMenu#getDefaultLightWeightPopupEnabled() public static boolean
     * javax.swing.JPopupMenu.getDefaultLightWeightPopupEnabled()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultLightWeightPopupEnabled()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JPopupMenu#setDefaultLightWeightPopupEnabled(boolean) public static void
     * javax.swing.JPopupMenu.setDefaultLightWeightPopupEnabled(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultLightWeightPopupEnabled_boolean()
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
        final Class<? extends javax.swing.JPopupMenu> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JPopupMenu.class.isAssignableFrom(sut));
    }

}
