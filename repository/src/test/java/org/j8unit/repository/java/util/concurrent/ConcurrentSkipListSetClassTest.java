package org.j8unit.repository.java.util.concurrent;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConcurrentSkipListSetClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentSkipListSetClassTests<ConcurrentSkipListSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentSkipListSet]

    @Override
    public Class<ConcurrentSkipListSet> createNewSUT() {
        return ConcurrentSkipListSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ConcurrentSkipListSet#ConcurrentSkipListSet(SortedSet) public
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
        final ConcurrentSkipListSet sut = null; // = new ConcurrentSkipListSet(SortedSet);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ConcurrentSkipListSet#ConcurrentSkipListSet(Collection) public
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
        final ConcurrentSkipListSet sut = null; // = new ConcurrentSkipListSet(Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ConcurrentSkipListSet#ConcurrentSkipListSet(Comparator) public
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
        final ConcurrentSkipListSet sut = null; // = new ConcurrentSkipListSet(Comparator);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ConcurrentSkipListSet#ConcurrentSkipListSet()
     * public java.util.concurrent.ConcurrentSkipListSet()}.
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
        final ConcurrentSkipListSet sut = new ConcurrentSkipListSet();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentSkipListSet]

}
