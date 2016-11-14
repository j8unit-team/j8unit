package org.j8unit.repository.java.util.logging;

import java.util.logging.SimpleFormatter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleFormatter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.logging.SimpleFormatterClassTests}).
 */

@RunWith(J8Unit4.class)
public class SimpleFormatterClassTest
implements SimpleFormatterClassTests<SimpleFormatter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.SimpleFormatter]

    @Override
    public Class<SimpleFormatter> createNewSUT() {
        return SimpleFormatter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.logging.SimpleFormatter#SimpleFormatter() public java.util.logging.SimpleFormatter()}.
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
    public void create_SimpleFormatter()
    throws Exception {
        // create new instance
        final SimpleFormatter sut = new SimpleFormatter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.SimpleFormatter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.SimpleFormatter]

}
