package org.j8unit.repository.java.awt.geom;

import java.awt.geom.FlatteningPathIterator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FlatteningPathIterator} (by simply
 * reusing the J8Unit test interface {@link FlatteningPathIteratorClassTests}).
 */

@RunWith(J8Unit4.class)
public class FlatteningPathIteratorClassTest
implements FlatteningPathIteratorClassTests<FlatteningPathIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.geom.FlatteningPathIterator]

    @Override
    public Class<FlatteningPathIterator> createNewSUT() {
        return FlatteningPathIterator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.geom.FlatteningPathIterator#FlatteningPathIterator(java.awt.geom.PathIterator, double, int)
     * public java.awt.geom.FlatteningPathIterator(java.awt.geom.PathIterator,double,int)}.
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
    public void create_FlatteningPathIterator_PathIterator_double_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FlatteningPathIterator sut = null; // = new FlatteningPathIterator(java.awt.geom.PathIterator, double,
                                                 // int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.geom.FlatteningPathIterator#FlatteningPathIterator(java.awt.geom.PathIterator, double) public
     * java.awt.geom.FlatteningPathIterator(java.awt.geom.PathIterator,double)}.
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
    public void create_FlatteningPathIterator_PathIterator_double()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FlatteningPathIterator sut = null; // = new FlatteningPathIterator(java.awt.geom.PathIterator, double);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.geom.FlatteningPathIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.geom.FlatteningPathIterator]

}
