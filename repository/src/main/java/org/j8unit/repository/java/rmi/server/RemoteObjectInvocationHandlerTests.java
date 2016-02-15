package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.RemoteObjectInvocationHandler class
 * java.rmi.server.RemoteObjectInvocationHandler}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RemoteObjectInvocationHandlerClassTests}.
 * </p>
 *
 * @see java.rmi.server.RemoteObjectInvocationHandler class java.rmi.server.RemoteObjectInvocationHandler (the hereby
 *      targeted class-under-test class)
 * @see RemoteObjectInvocationHandlerClassTests RemoteObjectInvocationHandlerClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RemoteObjectInvocationHandlerTests<SUT extends java.rmi.server.RemoteObjectInvocationHandler>
extends org.j8unit.repository.java.lang.reflect.InvocationHandlerTests<SUT>, RemoteObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.rmi.server.RemoteObjectInvocationHandler#invoke(Object, java.lang.reflect.Method, Object[]) public
     * java.lang.Object
     * java.rmi.server.RemoteObjectInvocationHandler.invoke(java.lang.Object,java.lang.reflect.Method,java.lang.Object[])
     * throws java.lang.Throwable}.
     *
     * <p>
     * Test method for
     * {@link java.rmi.server.RemoteObjectInvocationHandler#invoke(Object, java.lang.reflect.Method, Object[]) public
     * java.lang.Object
     * java.rmi.server.RemoteObjectInvocationHandler.invoke(java.lang.Object,java.lang.reflect.Method,java.lang.Object[])
     * throws java.lang.Throwable}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteObjectInvocationHandler#invoke(Object, java.lang.reflect.Method, Object[]) public
     *      java.lang.Object
     *      java.rmi.server.RemoteObjectInvocationHandler.invoke(java.lang.Object,java.lang.reflect.Method,java.lang.
     *      Object[]) throws java.lang.Throwable (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_invoke_Object_Method_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
