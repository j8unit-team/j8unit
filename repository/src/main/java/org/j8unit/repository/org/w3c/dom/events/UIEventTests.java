package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.w3c.dom.events.UIEvent interface org.w3c.dom.events.UIEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.w3c.dom.events.UIEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.w3c.dom.events.UIEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.w3c.dom.events.UIEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UIEventTests<SUT extends org.w3c.dom.events.UIEvent>
extends org.j8unit.repository.org.w3c.dom.events.EventTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.events.UIEvent#getDetail() public abstract int
     * org.w3c.dom.events.UIEvent.getDetail()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.events.UIEvent#getDetail()
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
     * Test method for {@link org.w3c.dom.events.UIEvent#getView() public abstract org.w3c.dom.views.AbstractView
     * org.w3c.dom.events.UIEvent.getView()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.events.UIEvent#getView()
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

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.events.UIEvent#initUIEvent(java.lang.String, boolean, boolean, org.w3c.dom.views.AbstractView, int)
     * public abstract void
     * org.w3c.dom.events.UIEvent.initUIEvent(java.lang.String,boolean,boolean,org.w3c.dom.views.AbstractView,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.events.UIEvent#initUIEvent(java.lang.String, boolean, boolean,
     *             org.w3c.dom.views.AbstractView, int)
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

}
