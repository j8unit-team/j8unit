package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.beancontext.BeanContextMembershipListener interface
 * java.beans.beancontext.BeanContextMembershipListener}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link BeanContextMembershipListenerClassTests}.
 * </p>
 *
 * @see java.beans.beancontext.BeanContextMembershipListener interface
 *      java.beans.beancontext.BeanContextMembershipListener (the hereby targeted class-under-test class)
 * @see BeanContextMembershipListenerClassTests BeanContextMembershipListenerClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextMembershipListenerTests<SUT extends java.beans.beancontext.BeanContextMembershipListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextMembershipListener#childrenRemoved(java.beans.beancontext.BeanContextMembershipEvent)
     * public abstract void
     * java.beans.beancontext.BeanContextMembershipListener.childrenRemoved(java.beans.beancontext.BeanContextMembershipEvent)}
     * .
     *
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
     * @see java.beans.beancontext.BeanContextMembershipListener#childrenRemoved(java.beans.beancontext.BeanContextMembershipEvent)
     *      public abstract void
     *      java.beans.beancontext.BeanContextMembershipListener.childrenRemoved(java.beans.beancontext.
     *      BeanContextMembershipEvent) (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextMembershipListener#childrenAdded(java.beans.beancontext.BeanContextMembershipEvent)
     * public abstract void
     * java.beans.beancontext.BeanContextMembershipListener.childrenAdded(java.beans.beancontext.BeanContextMembershipEvent)}
     * .
     *
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
     * @see java.beans.beancontext.BeanContextMembershipListener#childrenAdded(java.beans.beancontext.BeanContextMembershipEvent)
     *      public abstract void
     *      java.beans.beancontext.BeanContextMembershipListener.childrenAdded(java.beans.beancontext.
     *      BeanContextMembershipEvent) (the hereby targeted method-under-test)
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

}
