package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.w3c.dom.events.EventTarget interface
 * org.w3c.dom.events.EventTarget}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.w3c.dom.events.EventTargetTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.w3c.dom.events.EventTargetClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.w3c.dom.events.EventTarget
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EventTargetTests<SUT extends org.w3c.dom.events.EventTarget>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.events.EventTarget#addEventListener(java.lang.String, org.w3c.dom.events.EventListener, boolean)
     * public abstract void
     * org.w3c.dom.events.EventTarget.addEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.events.EventTarget#addEventListener(java.lang.String, org.w3c.dom.events.EventListener,
     *             boolean)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.events.EventTarget#dispatchEvent(org.w3c.dom.events.Event)
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
     * {@link org.w3c.dom.events.EventTarget#removeEventListener(java.lang.String, org.w3c.dom.events.EventListener, boolean)
     * public abstract void
     * org.w3c.dom.events.EventTarget.removeEventListener(java.lang.String,org.w3c.dom.events.EventListener,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.events.EventTarget#removeEventListener(java.lang.String,
     *             org.w3c.dom.events.EventListener, boolean)
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
