package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ThreadLocalRandom;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadLocalRandomClassTest
implements org.j8unit.repository.java.util.concurrent.ThreadLocalRandomClassTests<ThreadLocalRandom> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ThreadLocalRandom]

    @Override
    public Class<ThreadLocalRandom> createNewSUT() {
        return ThreadLocalRandom.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ThreadLocalRandom#current() public static
     * java.util.concurrent.ThreadLocalRandom java.util.concurrent.ThreadLocalRandom.current()}.
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
    public void test_current()
    throws Exception {
        // write some test for {@link ThreadLocalRandom#current()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadLocalRandom]

}
