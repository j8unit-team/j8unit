package org.j8unit.repository.javax.swing;

import javax.swing.JDesktopPane;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JDesktopPaneClassTest
implements org.j8unit.repository.javax.swing.JDesktopPaneClassTests<JDesktopPane> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JDesktopPane]

    @Override
    public Class<JDesktopPane> createNewSUT() {
        return JDesktopPane.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JDesktopPane#JDesktopPane() public
     * javax.swing.JDesktopPane()}.
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
    public void create_JDesktopPane()
    throws Exception {
        // create new instance
        final JDesktopPane sut = new JDesktopPane();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JDesktopPane]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JDesktopPane]

}
