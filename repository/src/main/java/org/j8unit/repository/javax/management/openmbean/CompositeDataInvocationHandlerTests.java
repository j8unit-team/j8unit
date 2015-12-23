package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.openmbean.CompositeDataInvocationHandler class
 * javax.management.openmbean.CompositeDataInvocationHandler}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
 * class relevant test methods is
 * {@link org.j8unit.repository.javax.management.openmbean.CompositeDataInvocationHandlerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.openmbean.CompositeDataInvocationHandlerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.openmbean.CompositeDataInvocationHandler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompositeDataInvocationHandlerTests<SUT extends javax.management.openmbean.CompositeDataInvocationHandler>
extends org.j8unit.repository.java.lang.reflect.InvocationHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.openmbean.CompositeDataInvocationHandler#getCompositeData() public
     * javax.management.openmbean.CompositeData
     * javax.management.openmbean.CompositeDataInvocationHandler.getCompositeData()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.openmbean.CompositeDataInvocationHandler#getCompositeData()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCompositeData()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.openmbean.CompositeDataInvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     * public java.lang.Object
     * javax.management.openmbean.CompositeDataInvocationHandler.invoke(java.lang.Object,java.lang.reflect.Method,java.lang.Object[])
     * throws java.lang.Throwable}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.openmbean.CompositeDataInvocationHandler#invoke(java.lang.Object,
     *             java.lang.reflect.Method, java.lang.Object[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_invoke_Object_Method_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
