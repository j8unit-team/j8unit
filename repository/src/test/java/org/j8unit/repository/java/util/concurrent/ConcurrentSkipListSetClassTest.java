package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ConcurrentSkipListSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConcurrentSkipListSet} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ConcurrentSkipListSetClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConcurrentSkipListSetClassTest
implements ConcurrentSkipListSetClassTests<ConcurrentSkipListSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentSkipListSet]

    @Override
    public Class<ConcurrentSkipListSet> createNewSUT() {
        return ConcurrentSkipListSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentSkipListSet#ConcurrentSkipListSet() public
     * java.util.concurrent.ConcurrentSkipListSet()}.
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
    public void create_ConcurrentSkipListSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentSkipListSet sut = new ConcurrentSkipListSet();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentSkipListSet#ConcurrentSkipListSet(java.util.Collection) public
     * java.util.concurrent.ConcurrentSkipListSet(java.util.Collection<? extends E>)}.
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
    public void create_ConcurrentSkipListSet_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentSkipListSet sut = null; // = new ConcurrentSkipListSet(java.util.Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentSkipListSet#ConcurrentSkipListSet(java.util.Comparator) public
     * java.util.concurrent.ConcurrentSkipListSet(java.util.Comparator<? super E>)}.
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
    public void create_ConcurrentSkipListSet_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentSkipListSet sut = null; // = new ConcurrentSkipListSet(java.util.Comparator);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentSkipListSet#ConcurrentSkipListSet(java.util.SortedSet) public
     * java.util.concurrent.ConcurrentSkipListSet(java.util.SortedSet<E>)}.
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
    public void create_ConcurrentSkipListSet_SortedSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentSkipListSet sut = null; // = new ConcurrentSkipListSet(java.util.SortedSet);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ConcurrentSkipListSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentSkipListSet]

}
