package org.j8unit.repository.java.awt;

import java.awt.Panel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PanelClassTest
implements org.j8unit.repository.java.awt.PanelClassTests<Panel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Panel]

    @Override
    public Class<Panel> createNewSUT() {
        return Panel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Panel#Panel() public
     * java.awt.Panel()}.
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
    public void create_Panel()
    throws Exception {
        // create new instance
        final Panel sut = new Panel();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Panel#Panel(java.awt.LayoutManager)
     * public java.awt.Panel(java.awt.LayoutManager)}.
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
    public void create_Panel_LayoutManager()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Panel sut = null; // = new Panel(java.awt.LayoutManager);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Panel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Panel]

}
