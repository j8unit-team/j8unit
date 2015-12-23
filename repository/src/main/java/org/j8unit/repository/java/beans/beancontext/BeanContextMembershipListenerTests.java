package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.beancontext.BeanContextMembershipListener interface
 * java.beans.beancontext.BeanContextMembershipListener}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.beans.beancontext.BeanContextMembershipListenerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextMembershipListenerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.beancontext.BeanContextMembershipListener
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextMembershipListenerTests<SUT extends java.beans.beancontext.BeanContextMembershipListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextMembershipListener#childrenAdded(java.beans.beancontext.BeanContextMembershipEvent)
     * public abstract void
     * java.beans.beancontext.BeanContextMembershipListener.childrenAdded(java.beans.beancontext.BeanContextMembershipEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextMembershipListener#childrenAdded(java.beans.beancontext.
     *             BeanContextMembershipEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_childrenAdded_BeanContextMembershipEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextMembershipListener#childrenRemoved(java.beans.beancontext.BeanContextMembershipEvent)
     * public abstract void
     * java.beans.beancontext.BeanContextMembershipListener.childrenRemoved(java.beans.beancontext.BeanContextMembershipEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextMembershipListener#childrenRemoved(java.beans.beancontext.
     *             BeanContextMembershipEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_childrenRemoved_BeanContextMembershipEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
