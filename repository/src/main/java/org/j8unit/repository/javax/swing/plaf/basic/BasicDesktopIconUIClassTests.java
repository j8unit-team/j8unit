package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicDesktopIconUI class javax.swing.plaf.basic.BasicDesktopIconUI},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUITests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicDesktopIconUIClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicDesktopIconUI>>
extends org.j8unit.repository.javax.swing.plaf.DesktopIconUIClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicDesktopIconUI#BasicDesktopIconUI() public
     * javax.swing.plaf.basic.BasicDesktopIconUI()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicDesktopIconUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicDesktopIconUI sut = null; // = new BasicDesktopIconUI();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.plaf.basic.BasicDesktopIconUI> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicDesktopIconUI.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicDesktopIconUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicDesktopIconUI.createUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicDesktopIconUI$MouseInputHandler class
     * javax.swing.plaf.basic.BasicDesktopIconUI$MouseInputHandler}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUITests.MouseInputHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUITests.MouseInputHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MouseInputHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler>>
    extends org.j8unit.repository.javax.swing.event.MouseInputAdapterClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler#MouseInputHandler(javax.swing.plaf.basic.BasicDesktopIconUI)
         * public
         * javax.swing.plaf.basic.BasicDesktopIconUI$MouseInputHandler(javax.swing.plaf.basic.BasicDesktopIconUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MouseInputHandler_BasicDesktopIconUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler sut = null; // = new
                                                                                          // MouseInputHandler(javax.swing.plaf.basic.BasicDesktopIconUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler.class.isAssignableFrom(sut));
        }

    }

}
