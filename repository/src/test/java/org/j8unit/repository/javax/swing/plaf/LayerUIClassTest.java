package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.LayerUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class LayerUIClassTest
implements org.j8unit.repository.javax.swing.plaf.LayerUIClassTests<LayerUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.LayerUI]

    @Override
    public Class<LayerUI> createNewSUT() {
        return LayerUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link LayerUI#LayerUI() public
     * javax.swing.plaf.LayerUI()}.
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
    public void create_LayerUI()
    throws Exception {
        // create new instance
        final LayerUI sut = new LayerUI();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.LayerUI]

}
