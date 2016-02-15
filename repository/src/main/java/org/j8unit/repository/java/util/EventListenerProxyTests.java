package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.EventListenerProxy class java.util.EventListenerProxy}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link EventListenerProxyClassTests}.
 * </p>
 *
 * @see java.util.EventListenerProxy class java.util.EventListenerProxy (the hereby targeted class-under-test class)
 * @see EventListenerProxyClassTests EventListenerProxyClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EventListenerProxyTests<SUT extends java.util.EventListenerProxy<T>, T extends java.util.EventListener>
extends EventListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.EventListenerProxy#getListener() public T
     * java.util.EventListenerProxy.getListener()}.
     *
     * <p>
     * Test method for {@link java.util.EventListenerProxy#getListener() public java.util.EventListener
     * java.util.EventListenerProxy.getListener()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.EventListenerProxy#getListener() public java.util.EventListener
     *      java.util.EventListenerProxy.getListener() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
