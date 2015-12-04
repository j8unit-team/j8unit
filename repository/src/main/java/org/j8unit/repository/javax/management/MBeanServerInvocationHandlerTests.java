package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.MBeanServerInvocationHandler class
 * javax.management.MBeanServerInvocationHandler}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.MBeanServerInvocationHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MBeanServerInvocationHandlerTests<SUT extends javax.management.MBeanServerInvocationHandler>
extends org.j8unit.repository.java.lang.reflect.InvocationHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerInvocationHandler#invoke(java.lang.Object,java.lang.reflect.Method,java.lang.Object[])
     * public java.lang.Object
     * javax.management.MBeanServerInvocationHandler.invoke(java.lang.Object,java.lang.reflect.Method,java.lang.Object[])
     * throws java.lang.Throwable}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerInvocationHandler#isMXBean() public boolean
     * javax.management.MBeanServerInvocationHandler.isMXBean()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isMXBean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerInvocationHandler#getMBeanServerConnection() public
     * javax.management.MBeanServerConnection javax.management.MBeanServerInvocationHandler.getMBeanServerConnection()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanServerConnection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerInvocationHandler#getObjectName() public
     * javax.management.ObjectName javax.management.MBeanServerInvocationHandler.getObjectName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
