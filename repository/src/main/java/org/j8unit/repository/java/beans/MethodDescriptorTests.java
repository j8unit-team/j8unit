package org.j8unit.repository.java.beans;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.beans.MethodDescriptor class java.beans.MethodDescriptor},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.MethodDescriptorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MethodDescriptorTests<SUT extends java.beans.MethodDescriptor>
extends org.j8unit.repository.java.beans.FeatureDescriptorTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.beans.MethodDescriptor#getMethod() public synchronized java.lang.reflect.Method java.beans.MethodDescriptor.getMethod()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMethod() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.MethodDescriptor#getParameterDescriptors() public java.beans.ParameterDescriptor[] java.beans.MethodDescriptor.getParameterDescriptors()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameterDescriptors() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
