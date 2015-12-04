package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.events.EventTarget interface org.w3c.dom.events.EventTarget}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.events.EventTargetClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EventTargetTests<SUT extends org.w3c.dom.events.EventTarget>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.events.EventTarget#addEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)
     * public abstract void
     * org.w3c.dom.events.EventTarget.addEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link org.w3c.dom.events.EventTarget#dispatchEvent(org.w3c.dom.events.Event) public abstract
     * boolean org.w3c.dom.events.EventTarget.dispatchEvent(org.w3c.dom.events.Event) throws
     * org.w3c.dom.events.EventException}.
     * </p>
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
     * {@link org.w3c.dom.events.EventTarget#removeEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)
     * public abstract void
     * org.w3c.dom.events.EventTarget.removeEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)}.
     * </p>
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

}
