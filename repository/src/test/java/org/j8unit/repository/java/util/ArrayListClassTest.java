package org.j8unit.repository.java.util;

import java.util.ArrayList;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ArrayList} (by simply reusing the J8Unit
 * test interface {@link ArrayListClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ArrayListClassTest
implements ArrayListClassTests<ArrayList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.ArrayList]

    @Override
    public Class<ArrayList> createNewSUT() {
        return ArrayList.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.ArrayList#ArrayList(java.util.Collection) public java.util.ArrayList(java.util.Collection<?
     * extends E>)}.
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
    public void create_ArrayList_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ArrayList sut = null; // = new ArrayList(java.util.Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.ArrayList#ArrayList() public
     * java.util.ArrayList()}.
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
    public void create_ArrayList()
    throws Exception {
        // create new instance
        final ArrayList sut = new ArrayList();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.ArrayList#ArrayList(int) public
     * java.util.ArrayList(int)}.
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
    public void create_ArrayList_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ArrayList sut = null; // = new ArrayList(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.ArrayList]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.ArrayList]

}
