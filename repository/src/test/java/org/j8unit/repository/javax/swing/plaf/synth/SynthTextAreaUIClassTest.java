package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthTextAreaUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SynthTextAreaUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.synth.SynthTextAreaUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class SynthTextAreaUIClassTest
implements SynthTextAreaUIClassTests<SynthTextAreaUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.synth.SynthTextAreaUI]

    @Override
    public Class<SynthTextAreaUI> createNewSUT() {
        return SynthTextAreaUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.synth.SynthTextAreaUI#SynthTextAreaUI() public javax.swing.plaf.synth.SynthTextAreaUI()}.
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
    public void create_SynthTextAreaUI()
    throws Exception {
        // create new instance
        final SynthTextAreaUI sut = new SynthTextAreaUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.synth.SynthTextAreaUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.synth.SynthTextAreaUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.synth.SynthTextAreaUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.synth.SynthTextAreaUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.synth.SynthTextAreaUI]

}
