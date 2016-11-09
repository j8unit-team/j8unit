package org.j8unit.repository.java.nio.channels;

import java.nio.channels.Selector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Selector} (by simply reusing the J8Unit
 * test interface {@link SelectorClassTests}).
 */

@RunWith(J8Unit4.class)
public class SelectorClassTest
implements SelectorClassTests<Selector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.Selector]

    @Override
    public Class<Selector> createNewSUT() {
        return Selector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.channels.Selector#open() public static
     * java.nio.channels.Selector java.nio.channels.Selector.open() throws java.io.IOException}.
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
    public void test_open()
    throws Exception {
        // write some test for {@link java.nio.channels.Selector#open()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.Selector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.Selector]

}
