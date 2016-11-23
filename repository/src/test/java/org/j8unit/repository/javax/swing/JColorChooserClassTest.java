package org.j8unit.repository.javax.swing;

import javax.swing.JColorChooser;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JColorChooser} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.JColorChooserClassTests}).
 */

@RunWith(J8Unit4.class)
public class JColorChooserClassTest
implements JColorChooserClassTests<JColorChooser> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JColorChooser]

    @Override
    public Class<JColorChooser> createNewSUT() {
        return JColorChooser.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JColorChooser#JColorChooser(javax.swing.colorchooser.ColorSelectionModel) public
     * javax.swing.JColorChooser(javax.swing.colorchooser.ColorSelectionModel)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JColorChooser_ColorSelectionModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JColorChooser sut = null; // = new JColorChooser(javax.swing.colorchooser.ColorSelectionModel);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JColorChooser#JColorChooser()
     * public javax.swing.JColorChooser()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JColorChooser()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JColorChooser sut = new JColorChooser();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JColorChooser#JColorChooser(java.awt.Color) public javax.swing.JColorChooser(java.awt.Color)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JColorChooser_Color()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JColorChooser sut = null; // = new JColorChooser(java.awt.Color);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.JColorChooser#showDialog(java.awt.Component, String, java.awt.Color) public static
     * java.awt.Color javax.swing.JColorChooser.showDialog(java.awt.Component,java.lang.String,java.awt.Color) throws
     * java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_showDialog_Component_String_Color()
    throws Exception {
        // write some test for {@link javax.swing.JColorChooser#showDialog(java.awt.Component, String, java.awt.Color)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.JColorChooser#createDialog(java.awt.Component, String, boolean, javax.swing.JColorChooser, java.awt.event.ActionListener, java.awt.event.ActionListener)
     * public static javax.swing.JDialog
     * javax.swing.JColorChooser.createDialog(java.awt.Component,java.lang.String,boolean,javax.swing.JColorChooser,java.awt.event.ActionListener,java.awt.event.ActionListener)
     * throws java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createDialog_Component_String_boolean_JColorChooser_ActionListener_ActionListener()
    throws Exception {
        // write some test for {@link javax.swing.JColorChooser#createDialog(java.awt.Component, String, boolean,
        // javax.swing.JColorChooser, java.awt.event.ActionListener, java.awt.event.ActionListener)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JColorChooser]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JColorChooser]

}
