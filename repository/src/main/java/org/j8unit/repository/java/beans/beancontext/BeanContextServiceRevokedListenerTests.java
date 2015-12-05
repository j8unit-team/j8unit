package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContextServiceRevokedListener interface
 * java.beans.beancontext.BeanContextServiceRevokedListener}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextServiceRevokedListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextServiceRevokedListenerTests<SUT extends java.beans.beancontext.BeanContextServiceRevokedListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServiceRevokedListener#serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)
     * public abstract void
     * java.beans.beancontext.BeanContextServiceRevokedListener.serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_serviceRevoked_BeanContextServiceRevokedEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}