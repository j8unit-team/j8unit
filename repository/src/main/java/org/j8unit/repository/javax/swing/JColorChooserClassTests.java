package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.JColorChooser class javax.swing.JColorChooser}, containing
 * all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JColorChooserTests}.
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
 * @see org.j8unit.repository.javax.swing.JColorChooserTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.JColorChooser
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JColorChooserClassTests<SUT extends javax.swing.JColorChooser>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.JColorChooser#JColorChooser() public javax.swing.JColorChooser()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JColorChooser#JColorChooser()
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
     * <p>
     * Test method for {@link javax.swing.JColorChooser#JColorChooser(java.awt.Color) public
     * javax.swing.JColorChooser(java.awt.Color)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JColorChooser#JColorChooser(java.awt.Color)
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
     * <p>
     * Test method for {@link javax.swing.JColorChooser#JColorChooser(javax.swing.colorchooser.ColorSelectionModel)
     * public javax.swing.JColorChooser(javax.swing.colorchooser.ColorSelectionModel)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JColorChooser#JColorChooser(javax.swing.colorchooser.ColorSelectionModel)
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

    /**
     * <p>
     * Test method for
     * {@link javax.swing.JColorChooser#createDialog(java.awt.Component, java.lang.String, boolean, javax.swing.JColorChooser, java.awt.event.ActionListener, java.awt.event.ActionListener)
     * public static javax.swing.JDialog
     * javax.swing.JColorChooser.createDialog(java.awt.Component,java.lang.String,boolean,javax.swing.JColorChooser,java.awt.event.ActionListener,java.awt.event.ActionListener)
     * throws java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JColorChooser#createDialog(java.awt.Component, java.lang.String, boolean,
     *             javax.swing.JColorChooser, java.awt.event.ActionListener, java.awt.event.ActionListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDialog_Component_String_boolean_JColorChooser_ActionListener_ActionListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JColorChooser#showDialog(java.awt.Component, java.lang.String, java.awt.Color)
     * public static java.awt.Color
     * javax.swing.JColorChooser.showDialog(java.awt.Component,java.lang.String,java.awt.Color) throws
     * java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JColorChooser#showDialog(java.awt.Component, java.lang.String, java.awt.Color)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_showDialog_Component_String_Color()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.JColorChooser#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JColorChooser.class.isAssignableFrom(sut));
    }

}
