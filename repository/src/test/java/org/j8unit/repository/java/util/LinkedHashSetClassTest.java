package org.j8unit.repository.java.util;

import java.util.LinkedHashSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LinkedHashSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.LinkedHashSetClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class LinkedHashSetClassTest
implements LinkedHashSetClassTests<LinkedHashSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.LinkedHashSet]

    @Override
    public Class<LinkedHashSet> createNewSUT() {
        return LinkedHashSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.LinkedHashSet#LinkedHashSet(java.util.Collection) public
     * java.util.LinkedHashSet(java.util.Collection<? extends E>)}.
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
    public void create_LinkedHashSet_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkedHashSet sut = null; // = new LinkedHashSet(java.util.Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.LinkedHashSet#LinkedHashSet() public
     * java.util.LinkedHashSet()}.
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
    public void create_LinkedHashSet()
    throws Exception {
        // create new instance
        final LinkedHashSet sut = new LinkedHashSet();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.LinkedHashSet#LinkedHashSet(int)
     * public java.util.LinkedHashSet(int)}.
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
    public void create_LinkedHashSet_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkedHashSet sut = null; // = new LinkedHashSet(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.LinkedHashSet#LinkedHashSet(int, float) public java.util.LinkedHashSet(int,float)}.
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
    public void create_LinkedHashSet_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkedHashSet sut = null; // = new LinkedHashSet(int, float);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.LinkedHashSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.LinkedHashSet]

}
