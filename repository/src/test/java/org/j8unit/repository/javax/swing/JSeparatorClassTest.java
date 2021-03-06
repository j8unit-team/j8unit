package org.j8unit.repository.javax.swing;

import javax.swing.JSeparator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JSeparator} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.JSeparatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class JSeparatorClassTest
implements JSeparatorClassTests<JSeparator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JSeparator]

    @Override
    public Class<JSeparator> createNewSUT() {
        return JSeparator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JSeparator#JSeparator() public
     * javax.swing.JSeparator()}.
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
    public void create_JSeparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JSeparator sut = new JSeparator();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JSeparator#JSeparator(int) public
     * javax.swing.JSeparator(int)}.
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
    public void create_JSeparator_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JSeparator sut = null; // = new JSeparator(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JSeparator]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JSeparator]

}
