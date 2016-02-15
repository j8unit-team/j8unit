package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.Dispatch interface javax.xml.ws.Dispatch}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link DispatchClassTests}.
 * </p>
 *
 * @see javax.xml.ws.Dispatch interface javax.xml.ws.Dispatch (the hereby targeted class-under-test class)
 * @see DispatchClassTests DispatchClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DispatchTests<SUT extends javax.xml.ws.Dispatch<T>, T>
extends BindingProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Dispatch#invoke(Object) public abstract T javax.xml.ws.Dispatch.invoke(T)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Dispatch#invoke(Object) public abstract java.lang.Object
     * javax.xml.ws.Dispatch.invoke(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Dispatch#invoke(Object) public abstract java.lang.Object
     *      javax.xml.ws.Dispatch.invoke(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Dispatch#invokeAsync(Object, javax.xml.ws.AsyncHandler) public abstract
     * java.util.concurrent.Future<?> javax.xml.ws.Dispatch.invokeAsync(T,javax.xml.ws.AsyncHandler<T>)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Dispatch#invokeAsync(Object, javax.xml.ws.AsyncHandler) public abstract
     * java.util.concurrent.Future javax.xml.ws.Dispatch.invokeAsync(java.lang.Object,javax.xml.ws.AsyncHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Dispatch#invokeAsync(Object, javax.xml.ws.AsyncHandler) public abstract
     *      java.util.concurrent.Future javax.xml.ws.Dispatch.invokeAsync(java.lang.Object,javax.xml.ws.AsyncHandler)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeAsync_Object_AsyncHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Dispatch#invokeAsync(Object) public abstract javax.xml.ws.Response
     * <T> javax.xml.ws.Dispatch.invokeAsync(T)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Dispatch#invokeAsync(Object) public abstract javax.xml.ws.Response
     * javax.xml.ws.Dispatch.invokeAsync(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Dispatch#invokeAsync(Object) public abstract javax.xml.ws.Response
     *      javax.xml.ws.Dispatch.invokeAsync(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeAsync_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Dispatch#invokeOneWay(Object) public abstract void
     * javax.xml.ws.Dispatch.invokeOneWay(T)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Dispatch#invokeOneWay(Object) public abstract void
     * javax.xml.ws.Dispatch.invokeOneWay(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Dispatch#invokeOneWay(Object) public abstract void
     *      javax.xml.ws.Dispatch.invokeOneWay(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeOneWay_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
