package org.j8unit.repository.java.util;

import java.util.Collection;
import java.util.LinkedList;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class LinkedListClassTest
implements org.j8unit.repository.java.util.LinkedListClassTests<LinkedList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.LinkedList]

    @Override
    public Class<LinkedList> createNewSUT() {
        return LinkedList.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link LinkedList#LinkedList() public
     * java.util.LinkedList()}.
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
    public void create_LinkedList()
    throws Exception {
        // create new instance
        final LinkedList sut = new LinkedList();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link LinkedList#LinkedList(Collection) public
     * java.util.LinkedList(java.util.Collection<? extends E>)}.
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
    public void create_LinkedList_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkedList sut = null; // = new LinkedList(Collection);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.LinkedList]

}
