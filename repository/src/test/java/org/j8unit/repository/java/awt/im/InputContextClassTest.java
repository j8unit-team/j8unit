package org.j8unit.repository.java.awt.im;

import java.awt.im.InputContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InputContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.im.InputContextClassTests}).
 */
@RunWith(J8Unit4.class)
public class InputContextClassTest
implements InputContextClassTests<InputContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.im.InputContext]

    @Override
    public Class<InputContext> createNewSUT() {
        return InputContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.im.InputContext#getInstance() public static
     * java.awt.im.InputContext java.awt.im.InputContext.getInstance()}.
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
    public void test_getInstance()
    throws Exception {
        // write some test for {@link java.awt.im.InputContext#getInstance()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.im.InputContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.im.InputContext]

}
