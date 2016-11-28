package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Runtime} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.RuntimeClassTests}).
 */
@RunWith(J8Unit4.class)
public class RuntimeClassTest
implements RuntimeClassTests<Runtime> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Runtime]

    @Override
    public Class<Runtime> createNewSUT() {
        return Runtime.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Runtime#getRuntime() public static java.lang.Runtime
     * java.lang.Runtime.getRuntime()}.
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
    public void test_getRuntime()
    throws Exception {
        // write some test for {@link Runtime#getRuntime()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Runtime#runFinalizersOnExit(boolean) public static
     * void java.lang.Runtime.runFinalizersOnExit(boolean)}.
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
    public void test_runFinalizersOnExit_boolean()
    throws Exception {
        // write some test for {@link Runtime#runFinalizersOnExit(boolean)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Runtime]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Runtime]

}
