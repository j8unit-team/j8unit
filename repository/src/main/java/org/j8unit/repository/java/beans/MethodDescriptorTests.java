package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.MethodDescriptor class java.beans.MethodDescriptor},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.beans.MethodDescriptorTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.MethodDescriptorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.MethodDescriptor
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MethodDescriptorTests<SUT extends java.beans.MethodDescriptor>
extends org.j8unit.repository.java.beans.FeatureDescriptorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.MethodDescriptor#getMethod() public synchronized java.lang.reflect.Method
     * java.beans.MethodDescriptor.getMethod()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.MethodDescriptor#getMethod()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.MethodDescriptor#getParameterDescriptors()
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
