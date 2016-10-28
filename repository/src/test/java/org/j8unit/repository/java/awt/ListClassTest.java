package org.j8unit.repository.java.awt;

import java.awt.List;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListClassTest
implements org.j8unit.repository.java.awt.ListClassTests<List> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.List]

    @Override
    public Class<List> createNewSUT() {
        return List.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link List#List(int, boolean) public
     * java.awt.List(int,boolean) throws java.awt.HeadlessException}.
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
    public void create_List_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final List sut = null; // = new List(int, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link List#List(int) public java.awt.List(int) throws
     * java.awt.HeadlessException}.
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
    public void create_List_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final List sut = null; // = new List(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link List#List() public java.awt.List() throws
     * java.awt.HeadlessException}.
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
    public void create_List()
    throws Exception {
        // create new instance
        final List sut = new List();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.List]

}
