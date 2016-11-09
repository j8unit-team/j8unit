package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ConcurrentLinkedDeque;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConcurrentLinkedDeque} (by simply reusing
 * the J8Unit test interface {@link ConcurrentLinkedDequeClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConcurrentLinkedDequeClassTest
implements ConcurrentLinkedDequeClassTests<ConcurrentLinkedDeque> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentLinkedDeque]

    @Override
    public Class<ConcurrentLinkedDeque> createNewSUT() {
        return ConcurrentLinkedDeque.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentLinkedDeque#ConcurrentLinkedDeque(java.util.Collection) public
     * java.util.concurrent.ConcurrentLinkedDeque(java.util.Collection<? extends E>)}.
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
    public void create_ConcurrentLinkedDeque_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentLinkedDeque sut = null; // = new ConcurrentLinkedDeque(java.util.Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentLinkedDeque#ConcurrentLinkedDeque() public
     * java.util.concurrent.ConcurrentLinkedDeque()}.
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
    public void create_ConcurrentLinkedDeque()
    throws Exception {
        // create new instance
        final ConcurrentLinkedDeque sut = new ConcurrentLinkedDeque();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ConcurrentLinkedDeque]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentLinkedDeque]

}
