package org.j8unit.repository.java.beans;

import java.beans.BeanDescriptor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanDescriptorClassTest
implements org.j8unit.repository.java.beans.BeanDescriptorClassTests<BeanDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.BeanDescriptor]

    @Override
    public Class<BeanDescriptor> createNewSUT() {
        return BeanDescriptor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.beans.BeanDescriptor#BeanDescriptor(Class)
     * public java.beans.BeanDescriptor(java.lang.Class<?>)}.
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
    public void create_BeanDescriptor_Class()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BeanDescriptor sut = null; // = new BeanDescriptor(Class);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.BeanDescriptor#BeanDescriptor(Class, Class) public
     * java.beans.BeanDescriptor(java.lang.Class<?>,java.lang.Class<?>)}.
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
    public void create_BeanDescriptor_Class_Class()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BeanDescriptor sut = null; // = new BeanDescriptor(Class, Class);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.BeanDescriptor]

}
