package org.j8unit.repository.javax.xml.ws.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.spi.Invoker class javax.xml.ws.spi.Invoker}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link InvokerClassTests}.
 * </p>
 *
 * @see javax.xml.ws.spi.Invoker class javax.xml.ws.spi.Invoker (the hereby targeted class-under-test class)
 * @see InvokerClassTests InvokerClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvokerTests<SUT extends javax.xml.ws.spi.Invoker>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.Invoker#invoke(java.lang.reflect.Method, Object...) public abstract
     * java.lang.Object javax.xml.ws.spi.Invoker.invoke(java.lang.reflect.Method,java.lang.Object...) throws
     * java.lang.IllegalAccessException,java.lang.IllegalArgumentException,java.lang.reflect.InvocationTargetException}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.spi.Invoker#invoke(java.lang.reflect.Method, Object...) public abstract
     * java.lang.Object javax.xml.ws.spi.Invoker.invoke(java.lang.reflect.Method,java.lang.Object...) throws
     * java.lang.IllegalAccessException,java.lang.IllegalArgumentException,java.lang.reflect.InvocationTargetException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Invoker#invoke(java.lang.reflect.Method, Object...) public abstract java.lang.Object
     *      javax.xml.ws.spi.Invoker.invoke(java.lang.reflect.Method,java.lang.Object[]) throws
     *      java.lang.IllegalAccessException,java.lang.IllegalArgumentException,java.lang.reflect.
     *      InvocationTargetException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_Method_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.Invoker#inject(javax.xml.ws.WebServiceContext) public abstract void
     * javax.xml.ws.spi.Invoker.inject(javax.xml.ws.WebServiceContext) throws
     * java.lang.IllegalAccessException,java.lang.IllegalArgumentException,java.lang.reflect.InvocationTargetException}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.spi.Invoker#inject(javax.xml.ws.WebServiceContext) public abstract void
     * javax.xml.ws.spi.Invoker.inject(javax.xml.ws.WebServiceContext) throws
     * java.lang.IllegalAccessException,java.lang.IllegalArgumentException,java.lang.reflect.InvocationTargetException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.Invoker#inject(javax.xml.ws.WebServiceContext) public abstract void
     *      javax.xml.ws.spi.Invoker.inject(javax.xml.ws.WebServiceContext) throws
     *      java.lang.IllegalAccessException,java.lang.IllegalArgumentException,java.lang.reflect.
     *      InvocationTargetException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_inject_WebServiceContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
