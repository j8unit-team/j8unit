package org.j8unit.repository.javax.swing;

import javax.swing.JButton;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JButton} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.JButtonClassTests}).
 */
@RunWith(J8Unit4.class)
public class JButtonClassTest
implements JButtonClassTests<JButton> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JButton]

    @Override
    public Class<JButton> createNewSUT() {
        return JButton.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JButton#JButton(javax.swing.Icon)
     * public javax.swing.JButton(javax.swing.Icon)}.
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
    public void create_JButton_Icon()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JButton sut = null; // = new JButton(javax.swing.Icon);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JButton#JButton(String, javax.swing.Icon) public
     * javax.swing.JButton(java.lang.String,javax.swing.Icon)}.
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
    public void create_JButton_String_Icon()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JButton sut = null; // = new JButton(String, javax.swing.Icon);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JButton#JButton() public
     * javax.swing.JButton()}.
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
    public void create_JButton()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JButton sut = new JButton();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JButton#JButton(javax.swing.Action)
     * public javax.swing.JButton(javax.swing.Action)}.
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
    public void create_JButton_Action()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JButton sut = null; // = new JButton(javax.swing.Action);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JButton#JButton(String) public
     * javax.swing.JButton(java.lang.String)}.
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
    public void create_JButton_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JButton sut = null; // = new JButton(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JButton]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JButton]

}
