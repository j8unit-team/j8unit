package org.j8unit.repository.javax.swing;

import static org.junit.Assert.fail;
import javax.swing.AbstractButton;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractButton} (by simply reusing the
 * J8Unit test interface {@link AbstractButtonClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractButtonClassTest
implements AbstractButtonClassTests<AbstractButton> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.AbstractButton]

    @Override
    public Class<AbstractButton> createNewSUT() {
        return AbstractButton.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.AbstractButton#AbstractButton()
     * public javax.swing.AbstractButton()}.
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
    public void create_AbstractButton()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.AbstractButton]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.AbstractButton]

}
