package org.j8unit.repository.javax.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.RuntimeErrorException class javax.management.RuntimeErrorException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.RuntimeErrorExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RuntimeErrorExceptionTests<SUT extends javax.management.RuntimeErrorException>
extends org.j8unit.repository.javax.management.JMRuntimeExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.RuntimeErrorException#getCause() public java.lang.Throwable javax.management.RuntimeErrorException.getCause()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCause() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.RuntimeErrorException#getTargetError() public java.lang.Error javax.management.RuntimeErrorException.getTargetError()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetError() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
