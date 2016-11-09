package org.j8unit.repository.javax.swing;

import javax.swing.SpinnerListModel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SpinnerListModel} (by simply reusing the
 * J8Unit test interface {@link SpinnerListModelClassTests}).
 */

@RunWith(J8Unit4.class)
public class SpinnerListModelClassTest
implements SpinnerListModelClassTests<SpinnerListModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SpinnerListModel]

    @Override
    public Class<SpinnerListModel> createNewSUT() {
        return SpinnerListModel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.SpinnerListModel#SpinnerListModel(java.util.List) public
     * javax.swing.SpinnerListModel(java.util.List<?>)}.
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
    public void create_SpinnerListModel_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SpinnerListModel sut = null; // = new SpinnerListModel(java.util.List);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.SpinnerListModel#SpinnerListModel(Object[]) public
     * javax.swing.SpinnerListModel(java.lang.Object[])}.
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
    public void create_SpinnerListModel_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SpinnerListModel sut = null; // = new SpinnerListModel(Object[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.SpinnerListModel#SpinnerListModel()
     * public javax.swing.SpinnerListModel()}.
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
    public void create_SpinnerListModel()
    throws Exception {
        // create new instance
        final SpinnerListModel sut = new SpinnerListModel();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.SpinnerListModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SpinnerListModel]

}
