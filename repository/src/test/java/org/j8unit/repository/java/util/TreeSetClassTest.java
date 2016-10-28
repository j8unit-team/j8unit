package org.j8unit.repository.java.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class TreeSetClassTest
implements org.j8unit.repository.java.util.TreeSetClassTests<TreeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.TreeSet]

    @Override
    public Class<TreeSet> createNewSUT() {
        return TreeSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TreeSet#TreeSet(SortedSet) public
     * java.util.TreeSet(java.util.SortedSet<E>)}.
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
    public void create_TreeSet_SortedSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TreeSet sut = null; // = new TreeSet(SortedSet);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TreeSet#TreeSet(Collection) public
     * java.util.TreeSet(java.util.Collection<? extends E>)}.
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
    public void create_TreeSet_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TreeSet sut = null; // = new TreeSet(Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TreeSet#TreeSet(Comparator) public
     * java.util.TreeSet(java.util.Comparator<? super E>)}.
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
    public void create_TreeSet_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TreeSet sut = null; // = new TreeSet(Comparator);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TreeSet#TreeSet() public java.util.TreeSet()}.
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
    public void create_TreeSet()
    throws Exception {
        // create new instance
        final TreeSet sut = new TreeSet();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.TreeSet]

}
