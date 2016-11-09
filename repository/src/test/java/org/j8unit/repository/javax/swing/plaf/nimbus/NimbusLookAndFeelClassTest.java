package org.j8unit.repository.javax.swing.plaf.nimbus;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NimbusLookAndFeel} (by simply reusing the
 * J8Unit test interface {@link NimbusLookAndFeelClassTests}).
 */

@RunWith(J8Unit4.class)
public class NimbusLookAndFeelClassTest
implements NimbusLookAndFeelClassTests<NimbusLookAndFeel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.nimbus.NimbusLookAndFeel]

    @Override
    public Class<NimbusLookAndFeel> createNewSUT() {
        return NimbusLookAndFeel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.nimbus.NimbusLookAndFeel#NimbusLookAndFeel() public
     * javax.swing.plaf.nimbus.NimbusLookAndFeel()}.
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
    public void create_NimbusLookAndFeel()
    throws Exception {
        // create new instance
        final NimbusLookAndFeel sut = new NimbusLookAndFeel();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.nimbus.NimbusLookAndFeel#getStyle(javax.swing.JComponent, javax.swing.plaf.synth.Region)
     * public static javax.swing.plaf.nimbus.NimbusStyle
     * javax.swing.plaf.nimbus.NimbusLookAndFeel.getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region)}.
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
    public void test_getStyle_JComponent_Region()
    throws Exception {
        // write some test for {@link javax.swing.plaf.nimbus.NimbusLookAndFeel#getStyle(javax.swing.JComponent,
        // javax.swing.plaf.synth.Region)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.nimbus.NimbusLookAndFeel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.nimbus.NimbusLookAndFeel]

}
