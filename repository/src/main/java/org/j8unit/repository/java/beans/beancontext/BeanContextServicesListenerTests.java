package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.beancontext.BeanContextServicesListener interface
 * java.beans.beancontext.BeanContextServicesListener}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.beans.beancontext.BeanContextServicesListenerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextServicesListenerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.beancontext.BeanContextServicesListener
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextServicesListenerTests<SUT extends java.beans.beancontext.BeanContextServicesListener>
extends org.j8unit.repository.java.beans.beancontext.BeanContextServiceRevokedListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesListener#serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)
     * public abstract void
     * java.beans.beancontext.BeanContextServicesListener.serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServicesListener#serviceAvailable(java.beans.beancontext.
     *             BeanContextServiceAvailableEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_serviceAvailable_BeanContextServiceAvailableEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
