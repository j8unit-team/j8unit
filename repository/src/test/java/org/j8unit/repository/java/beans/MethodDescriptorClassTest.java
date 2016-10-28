package org.j8unit.repository.java.beans;

import java.beans.MethodDescriptor;
import java.beans.ParameterDescriptor;
import java.lang.reflect.Method;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MethodDescriptorClassTest
implements org.j8unit.repository.java.beans.MethodDescriptorClassTests<MethodDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.MethodDescriptor]

    @Override
    public Class<MethodDescriptor> createNewSUT() {
        return MethodDescriptor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link MethodDescriptor#MethodDescriptor(Method)
     * public java.beans.MethodDescriptor(java.lang.reflect.Method)}.
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
    public void create_MethodDescriptor_Method()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MethodDescriptor sut = null; // = new MethodDescriptor(Method);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link MethodDescriptor#MethodDescriptor(Method, ParameterDescriptor[]) public
     * java.beans.MethodDescriptor(java.lang.reflect.Method,java.beans.ParameterDescriptor[])}.
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
    public void create_MethodDescriptor_Method_ParameterDescriptorArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MethodDescriptor sut = null; // = new MethodDescriptor(Method, ParameterDescriptor[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.MethodDescriptor]

}
