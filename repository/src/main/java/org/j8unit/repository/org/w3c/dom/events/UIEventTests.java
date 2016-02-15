package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.events.UIEvent interface org.w3c.dom.events.UIEvent}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link UIEventClassTests}.
 * </p>
 *
 * @see org.w3c.dom.events.UIEvent interface org.w3c.dom.events.UIEvent (the hereby targeted class-under-test class)
 * @see UIEventClassTests UIEventClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UIEventTests<SUT extends org.w3c.dom.events.UIEvent>
extends EventTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.events.UIEvent#getDetail() public abstract int
     * org.w3c.dom.events.UIEvent.getDetail()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.events.UIEvent#getDetail() public abstract int
     * org.w3c.dom.events.UIEvent.getDetail()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.events.UIEvent#getDetail() public abstract int org.w3c.dom.events.UIEvent.getDetail() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDetail()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.events.UIEvent#initUIEvent(String, boolean, boolean, org.w3c.dom.views.AbstractView, int)
     * public abstract void
     * org.w3c.dom.events.UIEvent.initUIEvent(java.lang.String,boolean,boolean,org.w3c.dom.views.AbstractView,int)}.
     *
     * <p>
     * Test method for
     * {@link org.w3c.dom.events.UIEvent#initUIEvent(String, boolean, boolean, org.w3c.dom.views.AbstractView, int)
     * public abstract void
     * org.w3c.dom.events.UIEvent.initUIEvent(java.lang.String,boolean,boolean,org.w3c.dom.views.AbstractView,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.events.UIEvent#initUIEvent(String, boolean, boolean, org.w3c.dom.views.AbstractView, int) public
     *      abstract void
     *      org.w3c.dom.events.UIEvent.initUIEvent(java.lang.String,boolean,boolean,org.w3c.dom.views.AbstractView,int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initUIEvent_String_boolean_boolean_AbstractView_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.events.UIEvent#getView() public abstract org.w3c.dom.views.AbstractView
     * org.w3c.dom.events.UIEvent.getView()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.events.UIEvent#getView() public abstract org.w3c.dom.views.AbstractView
     * org.w3c.dom.events.UIEvent.getView()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.events.UIEvent#getView() public abstract org.w3c.dom.views.AbstractView
     *      org.w3c.dom.events.UIEvent.getView() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getView()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
