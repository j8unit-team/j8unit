package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.Dispatch interface javax.xml.ws.Dispatch}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.DispatchClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DispatchTests<SUT extends javax.xml.ws.Dispatch<T>, T>
extends org.j8unit.repository.javax.xml.ws.BindingProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Dispatch#invoke(java.lang.Object) public abstract java.lang.Object
     * javax.xml.ws.Dispatch.invoke(java.lang.Object)}.
     * </p>
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
     * Test method for {@link javax.xml.ws.Dispatch#invokeAsync(java.lang.Object) public abstract javax.xml.ws.Response
     * javax.xml.ws.Dispatch.invokeAsync(java.lang.Object)}.
     * </p>
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
     * Test method for {@link javax.xml.ws.Dispatch#invokeAsync(java.lang.Object,javax.xml.ws.AsyncHandler) public
     * abstract java.util.concurrent.Future
     * javax.xml.ws.Dispatch.invokeAsync(java.lang.Object,javax.xml.ws.AsyncHandler)}.
     * </p>
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
     * Test method for {@link javax.xml.ws.Dispatch#invokeOneWay(java.lang.Object) public abstract void
     * javax.xml.ws.Dispatch.invokeOneWay(java.lang.Object)}.
     * </p>
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
