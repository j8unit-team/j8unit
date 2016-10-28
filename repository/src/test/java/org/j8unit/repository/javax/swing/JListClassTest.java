package org.j8unit.repository.javax.swing;

import javax.swing.JList;
import javax.swing.JList.DropLocation;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class JListClassTest
implements org.j8unit.repository.javax.swing.JListClassTests<JList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JList]

    @Override
    public Class<JList> createNewSUT() {
        return JList.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JList#JList() public
     * javax.swing.JList()}.
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
    public void create_JList()
    throws Exception {
        // create new instance
        final JList sut = new JList();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JList#JList(java.util.Vector)
     * public javax.swing.JList(java.util.Vector<? extends E>)}.
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
    public void create_JList_Vector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JList sut = null; // = new JList(java.util.Vector);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JList#JList(Object[]) public
     * javax.swing.JList(E[])}.
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
    public void create_JList_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JList sut = null; // = new JList(Object[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JList#JList(javax.swing.ListModel)
     * public javax.swing.JList(javax.swing.ListModel<E>)}.
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
    public void create_JList_ListModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JList sut = null; // = new JList(javax.swing.ListModel);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JList]

    @RunWith(J8Unit4.class)
    public static class DropLocationClassTest
    implements org.j8unit.repository.javax.swing.JListClassTests.DropLocationClassTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JList$DropLocation]

        @Override
        public Class<DropLocation> createNewSUT() {
            return DropLocation.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JList$DropLocation]

    }

}
