package org.j8unit.repository.java.util;

import java.util.Vector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Vector} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.VectorClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class VectorClassTest
implements VectorClassTests<Vector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Vector]

    @Override
    public Class<Vector> createNewSUT() {
        return Vector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Vector#Vector(java.util.Collection)
     * public java.util.Vector(java.util.Collection<? extends E>)}.
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
    public void create_Vector_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Vector sut = null; // = new Vector(java.util.Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Vector#Vector() public
     * java.util.Vector()}.
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
    public void create_Vector()
    throws Exception {
        // create new instance
        final Vector sut = new Vector();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Vector#Vector(int) public
     * java.util.Vector(int)}.
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
    public void create_Vector_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Vector sut = null; // = new Vector(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Vector#Vector(int, int) public
     * java.util.Vector(int,int)}.
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
    public void create_Vector_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Vector sut = null; // = new Vector(int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Vector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Vector]

}
