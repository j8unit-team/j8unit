package org.j8unit.repository.java.util;

import java.util.Random;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Random} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.RandomClassTests}).
 */
@RunWith(J8Unit4.class)
public class RandomClassTest
implements RandomClassTests<Random> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Random]

    @Override
    public Class<Random> createNewSUT() {
        return Random.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Random#Random() public
     * java.util.Random()}.
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
    public void create_Random()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Random sut = new Random();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Random#Random(long) public
     * java.util.Random(long)}.
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
    public void create_Random_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Random sut = null; // = new Random(long);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Random]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Random]

}
