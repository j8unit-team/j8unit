package org.j8unit.repository.javax.swing;

import javax.swing.JComboBox;
import javax.swing.JComboBox.KeySelectionManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JComboBox} (by simply reusing the J8Unit
 * test interface {@link JComboBoxClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class JComboBoxClassTest
implements JComboBoxClassTests<JComboBox> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JComboBox]

    @Override
    public Class<JComboBox> createNewSUT() {
        return JComboBox.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JComboBox#JComboBox(javax.swing.ComboBoxModel) public
     * javax.swing.JComboBox(javax.swing.ComboBoxModel<E>)}.
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
    public void create_JComboBox_ComboBoxModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JComboBox sut = null; // = new JComboBox(javax.swing.ComboBoxModel);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JComboBox#JComboBox(Object[])
     * public javax.swing.JComboBox(E[])}.
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
    public void create_JComboBox_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JComboBox sut = null; // = new JComboBox(Object[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JComboBox#JComboBox(java.util.Vector) public javax.swing.JComboBox(java.util.Vector<E>)}.
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
    public void create_JComboBox_Vector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JComboBox sut = null; // = new JComboBox(java.util.Vector);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JComboBox#JComboBox() public
     * javax.swing.JComboBox()}.
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
    public void create_JComboBox()
    throws Exception {
        // create new instance
        final JComboBox sut = new JComboBox();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JComboBox]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JComboBox]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeySelectionManager} (by simply
     * reusing the J8Unit test interface {@link KeySelectionManagerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeySelectionManagerClassTest
    implements KeySelectionManagerClassTests<KeySelectionManager> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JComboBox$KeySelectionManager]

        @Override
        public Class<KeySelectionManager> createNewSUT() {
            return KeySelectionManager.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JComboBox$KeySelectionManager]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JComboBox$KeySelectionManager]

    }

}
