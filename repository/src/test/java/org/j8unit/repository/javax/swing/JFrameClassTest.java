package org.j8unit.repository.javax.swing;

import javax.swing.JFrame;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JFrame} (by simply reusing the J8Unit
 * test interface {@link JFrameClassTests}).
 */

@RunWith(J8Unit4.class)
public class JFrameClassTest
implements JFrameClassTests<JFrame> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JFrame]

    @Override
    public Class<JFrame> createNewSUT() {
        return JFrame.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JFrame#JFrame() public
     * javax.swing.JFrame() throws java.awt.HeadlessException}.
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
    public void create_JFrame()
    throws Exception {
        // create new instance
        final JFrame sut = new JFrame();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JFrame#JFrame(java.awt.GraphicsConfiguration) public
     * javax.swing.JFrame(java.awt.GraphicsConfiguration)}.
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
    public void create_JFrame_GraphicsConfiguration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JFrame sut = null; // = new JFrame(java.awt.GraphicsConfiguration);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JFrame#JFrame(String) public
     * javax.swing.JFrame(java.lang.String) throws java.awt.HeadlessException}.
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
    public void create_JFrame_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JFrame sut = null; // = new JFrame(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JFrame#JFrame(String, java.awt.GraphicsConfiguration) public
     * javax.swing.JFrame(java.lang.String,java.awt.GraphicsConfiguration)}.
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
    public void create_JFrame_String_GraphicsConfiguration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JFrame sut = null; // = new JFrame(String, java.awt.GraphicsConfiguration);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.JFrame#isDefaultLookAndFeelDecorated()
     * public static boolean javax.swing.JFrame.isDefaultLookAndFeelDecorated()}.
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
    public void test_isDefaultLookAndFeelDecorated()
    throws Exception {
        // write some test for {@link javax.swing.JFrame#isDefaultLookAndFeelDecorated()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.JFrame#setDefaultLookAndFeelDecorated(boolean) public static void
     * javax.swing.JFrame.setDefaultLookAndFeelDecorated(boolean)}.
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
    public void test_setDefaultLookAndFeelDecorated_boolean()
    throws Exception {
        // write some test for {@link javax.swing.JFrame#setDefaultLookAndFeelDecorated(boolean)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JFrame]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JFrame]

}
