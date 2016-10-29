package org.j8unit.repository.javax.swing;

import static org.junit.Assert.fail;
import javax.swing.JComponent;
import javax.swing.JComponent.AccessibleJComponent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JComponentClassTest
implements org.j8unit.repository.javax.swing.JComponentClassTests<JComponent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JComponent]

    @Override
    public Class<JComponent> createNewSUT() {
        return JComponent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JComponent#JComponent() public
     * javax.swing.JComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_JComponent()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.JComponent#setDefaultLocale(java.util.Locale) public static void
     * javax.swing.JComponent.setDefaultLocale(java.util.Locale)}.
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
    public void test_setDefaultLocale_Locale()
    throws Exception {
        // write some test for {@link javax.swing.JComponent#setDefaultLocale(java.util.Locale)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.JComponent#isLightweightComponent(java.awt.Component) public static boolean
     * javax.swing.JComponent.isLightweightComponent(java.awt.Component)}.
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
    public void test_isLightweightComponent_Component()
    throws Exception {
        // write some test for {@link javax.swing.JComponent#isLightweightComponent(java.awt.Component)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.JComponent#getDefaultLocale() public
     * static java.util.Locale javax.swing.JComponent.getDefaultLocale()}.
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
    public void test_getDefaultLocale()
    throws Exception {
        // write some test for {@link javax.swing.JComponent#getDefaultLocale()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JComponent]

    @RunWith(J8Unit4.class)
    public static class AccessibleJComponentClassTest
    implements org.j8unit.repository.javax.swing.JComponentClassTests.AccessibleJComponentClassTests<AccessibleJComponent> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JComponent$AccessibleJComponent]

        @Override
        public Class<AccessibleJComponent> createNewSUT() {
            return AccessibleJComponent.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JComponent$AccessibleJComponent]

    }

}
