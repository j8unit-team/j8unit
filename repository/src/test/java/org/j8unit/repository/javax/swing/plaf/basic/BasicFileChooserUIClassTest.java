package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicFileChooserUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicFileChooserUI} (by simply reusing
 * the J8Unit test interface {@link BasicFileChooserUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicFileChooserUIClassTest
implements BasicFileChooserUIClassTests<BasicFileChooserUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicFileChooserUI]

    @Override
    public Class<BasicFileChooserUI> createNewSUT() {
        return BasicFileChooserUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicFileChooserUI#BasicFileChooserUI(javax.swing.JFileChooser) public
     * javax.swing.plaf.basic.BasicFileChooserUI(javax.swing.JFileChooser)}.
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
    public void create_BasicFileChooserUI_JFileChooser()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BasicFileChooserUI sut = null; // = new BasicFileChooserUI(javax.swing.JFileChooser);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicFileChooserUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicFileChooserUI.createUI(javax.swing.JComponent)}.
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
    public void test_createUI_JComponent()
    throws Exception {
        // write some test for {@link javax.swing.plaf.basic.BasicFileChooserUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicFileChooserUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicFileChooserUI]

}
