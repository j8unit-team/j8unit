package org.j8unit.repository.javax.swing.plaf;

import static org.junit.Assert.fail;
import javax.swing.plaf.LabelUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LabelUI} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.plaf.LabelUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class LabelUIClassTest
implements LabelUIClassTests<LabelUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.LabelUI]

    @Override
    public Class<LabelUI> createNewSUT() {
        return LabelUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.plaf.LabelUI#LabelUI() public
     * javax.swing.plaf.LabelUI()}.
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
    public void create_LabelUI()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.LabelUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.LabelUI]

}
