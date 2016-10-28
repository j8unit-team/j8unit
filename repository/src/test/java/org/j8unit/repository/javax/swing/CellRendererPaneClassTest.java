package org.j8unit.repository.javax.swing;

import javax.swing.CellRendererPane;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CellRendererPaneClassTest
implements org.j8unit.repository.javax.swing.CellRendererPaneClassTests<CellRendererPane> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.CellRendererPane]

    @Override
    public Class<CellRendererPane> createNewSUT() {
        return CellRendererPane.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.CellRendererPane#CellRendererPane()
     * public javax.swing.CellRendererPane()}.
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
    public void create_CellRendererPane()
    throws Exception {
        // create new instance
        final CellRendererPane sut = new CellRendererPane();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.CellRendererPane]

}
