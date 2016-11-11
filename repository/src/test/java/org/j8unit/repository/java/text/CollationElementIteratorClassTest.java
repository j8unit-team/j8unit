package org.j8unit.repository.java.text;

import java.text.CollationElementIterator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CollationElementIterator} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.text.CollationElementIteratorClassTests}).
 */

@RunWith(J8Unit4.class)
public class CollationElementIteratorClassTest
implements CollationElementIteratorClassTests<CollationElementIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.CollationElementIterator]

    @Override
    public Class<CollationElementIterator> createNewSUT() {
        return CollationElementIterator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.text.CollationElementIterator#primaryOrder(int)
     * public static final int java.text.CollationElementIterator.primaryOrder(int)}.
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
    public void test_primaryOrder_int()
    throws Exception {
        // write some test for {@link java.text.CollationElementIterator#primaryOrder(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.text.CollationElementIterator#tertiaryOrder(int) public static final short
     * java.text.CollationElementIterator.tertiaryOrder(int)}.
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
    public void test_tertiaryOrder_int()
    throws Exception {
        // write some test for {@link java.text.CollationElementIterator#tertiaryOrder(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.text.CollationElementIterator#secondaryOrder(int) public static final short
     * java.text.CollationElementIterator.secondaryOrder(int)}.
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
    public void test_secondaryOrder_int()
    throws Exception {
        // write some test for {@link java.text.CollationElementIterator#secondaryOrder(int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.CollationElementIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.CollationElementIterator]

}
