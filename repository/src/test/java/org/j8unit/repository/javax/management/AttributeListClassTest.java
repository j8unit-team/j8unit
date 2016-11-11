package org.j8unit.repository.javax.management;

import javax.management.AttributeList;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeList} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.AttributeListClassTests}).
 */

@RunWith(J8Unit4.class)
public class AttributeListClassTest
implements AttributeListClassTests<AttributeList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.AttributeList]

    @Override
    public Class<AttributeList> createNewSUT() {
        return AttributeList.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.AttributeList#AttributeList(java.util.List) public
     * javax.management.AttributeList(java.util.List<javax.management.Attribute>)}.
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
    public void create_AttributeList_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeList sut = null; // = new AttributeList(java.util.List);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.management.AttributeList#AttributeList()
     * public javax.management.AttributeList()}.
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
    public void create_AttributeList()
    throws Exception {
        // create new instance
        final AttributeList sut = new AttributeList();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.AttributeList#AttributeList(int) public javax.management.AttributeList(int)}.
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
    public void create_AttributeList_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeList sut = null; // = new AttributeList(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.AttributeList#AttributeList(javax.management.AttributeList) public
     * javax.management.AttributeList(javax.management.AttributeList)}.
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
    public void create_AttributeList_AttributeList()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeList sut = null; // = new AttributeList(javax.management.AttributeList);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.AttributeList]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.AttributeList]

}
