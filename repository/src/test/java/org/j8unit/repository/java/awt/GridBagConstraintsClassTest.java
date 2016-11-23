package org.j8unit.repository.java.awt;

import java.awt.GridBagConstraints;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GridBagConstraints} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.GridBagConstraintsClassTests}).
 */

@RunWith(J8Unit4.class)
public class GridBagConstraintsClassTest
implements GridBagConstraintsClassTests<GridBagConstraints> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.GridBagConstraints]

    @Override
    public Class<GridBagConstraints> createNewSUT() {
        return GridBagConstraints.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.GridBagConstraints#GridBagConstraints() public java.awt.GridBagConstraints()}.
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
    public void create_GridBagConstraints()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GridBagConstraints sut = new GridBagConstraints();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.GridBagConstraints#GridBagConstraints(int, int, int, int, double, double, int, int, java.awt.Insets, int, int)
     * public java.awt.GridBagConstraints(int,int,int,int,double,double,int,int,java.awt.Insets,int,int)}.
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
    public void create_GridBagConstraints_int_int_int_int_double_double_int_int_Insets_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GridBagConstraints sut = null; // = new GridBagConstraints(int, int, int, int, double, double, int, int,
                                             // java.awt.Insets, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.GridBagConstraints]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.GridBagConstraints]

}
