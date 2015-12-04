package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JPanel class javax.swing.JPanel}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.swing.JPanelTests}.
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
 * @see org.j8unit.repository.javax.swing.JPanelTests
 */
@Category(J8UnitRepository.class)
public abstract interface JPanelClassTests<SUT extends Class<? extends javax.swing.JPanel>>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JPanel#JPanel() public javax.swing.JPanel()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JPanel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JPanel sut = null; // = new JPanel();
    }

    /**
     * Test method for {@link javax.swing.JPanel#JPanel(boolean) public javax.swing.JPanel(boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JPanel_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JPanel sut = null; // = new JPanel(boolean);
    }

    /**
     * Test method for {@link javax.swing.JPanel#JPanel(java.awt.LayoutManager) public
     * javax.swing.JPanel(java.awt.LayoutManager)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JPanel_LayoutManager()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JPanel sut = null; // = new JPanel(java.awt.LayoutManager);
    }

    /**
     * Test method for {@link javax.swing.JPanel#JPanel(java.awt.LayoutManager,boolean) public
     * javax.swing.JPanel(java.awt.LayoutManager,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JPanel_LayoutManager_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JPanel sut = null; // = new JPanel(java.awt.LayoutManager,boolean);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JPanel> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JPanel.class.isAssignableFrom(sut));
    }

}
