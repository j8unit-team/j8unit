package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.events.EventTarget interface org.w3c.dom.events.EventTarget}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link EventTargetClassTests}.
 * </p>
 *
 * @see org.w3c.dom.events.EventTarget interface org.w3c.dom.events.EventTarget (the hereby targeted class-under-test
 *      class)
 * @see EventTargetClassTests EventTargetClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EventTargetTests<SUT extends org.w3c.dom.events.EventTarget>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.events.EventTarget#dispatchEvent(org.w3c.dom.events.Event) public abstract
     * boolean org.w3c.dom.events.EventTarget.dispatchEvent(org.w3c.dom.events.Event) throws
     * org.w3c.dom.events.EventException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.events.EventTarget#dispatchEvent(org.w3c.dom.events.Event) public abstract
     * boolean org.w3c.dom.events.EventTarget.dispatchEvent(org.w3c.dom.events.Event) throws
     * org.w3c.dom.events.EventException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.events.EventTarget#dispatchEvent(org.w3c.dom.events.Event) public abstract boolean
     *      org.w3c.dom.events.EventTarget.dispatchEvent(org.w3c.dom.events.Event) throws
     *      org.w3c.dom.events.EventException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispatchEvent_Event()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.events.EventTarget#removeEventListener(String, org.w3c.dom.events.EventListener, boolean)
     * public abstract void
     * org.w3c.dom.events.EventTarget.removeEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)}.
     *
     * <p>
     * Test method for
     * {@link org.w3c.dom.events.EventTarget#removeEventListener(String, org.w3c.dom.events.EventListener, boolean)
     * public abstract void
     * org.w3c.dom.events.EventTarget.removeEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.events.EventTarget#removeEventListener(String, org.w3c.dom.events.EventListener, boolean) public
     *      abstract void
     *      org.w3c.dom.events.EventTarget.removeEventListener(java.lang.String,org.w3c.dom.events.EventListener,
     *      boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeEventListener_String_EventListener_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.events.EventTarget#addEventListener(String, org.w3c.dom.events.EventListener, boolean) public
     * abstract void
     * org.w3c.dom.events.EventTarget.addEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)}.
     *
     * <p>
     * Test method for
     * {@link org.w3c.dom.events.EventTarget#addEventListener(String, org.w3c.dom.events.EventListener, boolean) public
     * abstract void
     * org.w3c.dom.events.EventTarget.addEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.events.EventTarget#addEventListener(String, org.w3c.dom.events.EventListener, boolean) public
     *      abstract void
     *      org.w3c.dom.events.EventTarget.addEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addEventListener_String_EventListener_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
