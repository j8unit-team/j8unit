package org.j8unit.repository.javax.swing;

import javax.swing.SpinnerDateModel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SpinnerDateModel} (by simply reusing the
 * J8Unit test interface {@link SpinnerDateModelClassTests}).
 */

@RunWith(J8Unit4.class)
public class SpinnerDateModelClassTest
implements SpinnerDateModelClassTests<SpinnerDateModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SpinnerDateModel]

    @Override
    public Class<SpinnerDateModel> createNewSUT() {
        return SpinnerDateModel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.SpinnerDateModel#SpinnerDateModel(java.util.Date, Comparable, Comparable, int) public
     * javax.swing.SpinnerDateModel(java.util.Date,java.lang.Comparable,java.lang.Comparable,int)}.
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
    public void create_SpinnerDateModel_Date_Comparable_Comparable_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SpinnerDateModel sut = null; // = new SpinnerDateModel(java.util.Date, Comparable, Comparable, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.SpinnerDateModel#SpinnerDateModel()
     * public javax.swing.SpinnerDateModel()}.
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
    public void create_SpinnerDateModel()
    throws Exception {
        // create new instance
        final SpinnerDateModel sut = new SpinnerDateModel();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.SpinnerDateModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SpinnerDateModel]

}
