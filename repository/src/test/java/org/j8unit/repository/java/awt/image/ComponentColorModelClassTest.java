package org.j8unit.repository.java.awt.image;

import java.awt.image.ComponentColorModel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComponentColorModel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.ComponentColorModelClassTests}).
 */
@RunWith(J8Unit4.class)
public class ComponentColorModelClassTest
implements ComponentColorModelClassTests<ComponentColorModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.ComponentColorModel]

    @Override
    public Class<ComponentColorModel> createNewSUT() {
        return ComponentColorModel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.ComponentColorModel#ComponentColorModel(java.awt.color.ColorSpace, int[], boolean, boolean, int, int)
     * public java.awt.image.ComponentColorModel(java.awt.color.ColorSpace,int[],boolean,boolean,int,int)}.
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
    public void create_ComponentColorModel_ColorSpace_intArray_boolean_boolean_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ComponentColorModel sut = null; // = new ComponentColorModel(java.awt.color.ColorSpace, int[], boolean,
                                              // boolean, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.ComponentColorModel#ComponentColorModel(java.awt.color.ColorSpace, boolean, boolean, int, int)
     * public java.awt.image.ComponentColorModel(java.awt.color.ColorSpace,boolean,boolean,int,int)}.
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
    public void create_ComponentColorModel_ColorSpace_boolean_boolean_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ComponentColorModel sut = null; // = new ComponentColorModel(java.awt.color.ColorSpace, boolean, boolean,
                                              // int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.ComponentColorModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.ComponentColorModel]

}
