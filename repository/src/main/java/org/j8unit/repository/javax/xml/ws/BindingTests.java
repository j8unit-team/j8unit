package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.Binding interface javax.xml.ws.Binding}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link BindingClassTests}.
 * </p>
 *
 * @see javax.xml.ws.Binding interface javax.xml.ws.Binding (the hereby targeted class-under-test class)
 * @see BindingClassTests BindingClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BindingTests<SUT extends javax.xml.ws.Binding>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Binding#getBindingID() public abstract java.lang.String
     * javax.xml.ws.Binding.getBindingID()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Binding#getBindingID() public abstract java.lang.String
     * javax.xml.ws.Binding.getBindingID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Binding#getBindingID() public abstract java.lang.String javax.xml.ws.Binding.getBindingID()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBindingID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Binding#getHandlerChain() public abstract java.util.List
     * <javax.xml.ws.handler.Handler> javax.xml.ws.Binding.getHandlerChain()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Binding#getHandlerChain() public abstract java.util.List
     * javax.xml.ws.Binding.getHandlerChain()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Binding#getHandlerChain() public abstract java.util.List javax.xml.ws.Binding.getHandlerChain()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHandlerChain()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Binding#setHandlerChain(java.util.List) public abstract void
     * javax.xml.ws.Binding.setHandlerChain(java.util.List<javax.xml.ws.handler.Handler>)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Binding#setHandlerChain(java.util.List) public abstract void
     * javax.xml.ws.Binding.setHandlerChain(java.util.List)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Binding#setHandlerChain(java.util.List) public abstract void
     *      javax.xml.ws.Binding.setHandlerChain(java.util.List) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setHandlerChain_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
