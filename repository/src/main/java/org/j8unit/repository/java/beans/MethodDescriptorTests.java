package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.MethodDescriptor class java.beans.MethodDescriptor}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MethodDescriptorClassTests}.
 * </p>
 *
 * @see java.beans.MethodDescriptor class java.beans.MethodDescriptor (the hereby targeted class-under-test class)
 * @see MethodDescriptorClassTests MethodDescriptorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MethodDescriptorTests<SUT extends java.beans.MethodDescriptor>
extends FeatureDescriptorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.MethodDescriptor#getMethod() public synchronized java.lang.reflect.Method
     * java.beans.MethodDescriptor.getMethod()}.
     *
     * <p>
     * Test method for {@link java.beans.MethodDescriptor#getMethod() public synchronized java.lang.reflect.Method
     * java.beans.MethodDescriptor.getMethod()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.MethodDescriptor#getMethod() public synchronized java.lang.reflect.Method
     *      java.beans.MethodDescriptor.getMethod() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMethod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.MethodDescriptor#getParameterDescriptors() public
     * java.beans.ParameterDescriptor[] java.beans.MethodDescriptor.getParameterDescriptors()}.
     *
     * <p>
     * Test method for {@link java.beans.MethodDescriptor#getParameterDescriptors() public
     * java.beans.ParameterDescriptor[] java.beans.MethodDescriptor.getParameterDescriptors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.MethodDescriptor#getParameterDescriptors() public java.beans.ParameterDescriptor[]
     *      java.beans.MethodDescriptor.getParameterDescriptors() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameterDescriptors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
