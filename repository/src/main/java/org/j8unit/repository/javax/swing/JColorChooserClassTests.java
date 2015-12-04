package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JColorChooser class javax.swing.JColorChooser}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JColorChooserTests}.
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
 * @see org.j8unit.repository.javax.swing.JColorChooserTests
 */
@Category(J8UnitRepository.class)
public abstract interface JColorChooserClassTests<SUT extends Class<? extends javax.swing.JColorChooser>>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JColorChooser#JColorChooser(java.awt.Color) public
     * javax.swing.JColorChooser(java.awt.Color)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JColorChooser_Color()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JColorChooser sut = null; // = new JColorChooser(java.awt.Color);
    }

    /**
     * Test method for {@link javax.swing.JColorChooser#JColorChooser() public javax.swing.JColorChooser()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JColorChooser()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JColorChooser sut = null; // = new JColorChooser();
    }

    /**
     * Test method for {@link javax.swing.JColorChooser#JColorChooser(javax.swing.colorchooser.ColorSelectionModel)
     * public javax.swing.JColorChooser(javax.swing.colorchooser.ColorSelectionModel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JColorChooser_ColorSelectionModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JColorChooser sut = null; // = new
                                                    // JColorChooser(javax.swing.colorchooser.ColorSelectionModel);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JColorChooser> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JColorChooser.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JColorChooser#showDialog(java.awt.Component,java.lang.String,java.awt.Color)
     * public static java.awt.Color
     * javax.swing.JColorChooser.showDialog(java.awt.Component,java.lang.String,java.awt.Color) throws
     * java.awt.HeadlessException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_showDialog_Component_String_Color()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.JColorChooser#createDialog(java.awt.Component,java.lang.String,boolean,javax.swing.JColorChooser,java.awt.event.ActionListener,java.awt.event.ActionListener)
     * public static javax.swing.JDialog
     * javax.swing.JColorChooser.createDialog(java.awt.Component,java.lang.String,boolean,javax.swing.JColorChooser,java.awt.event.ActionListener,java.awt.event.ActionListener)
     * throws java.awt.HeadlessException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDialog_Component_String_boolean_JColorChooser_ActionListener_ActionListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
