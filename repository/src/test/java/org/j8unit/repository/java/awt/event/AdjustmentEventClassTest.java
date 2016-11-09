package org.j8unit.repository.java.awt.event;

import java.awt.event.AdjustmentEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AdjustmentEvent} (by simply reusing the
 * J8Unit test interface {@link AdjustmentEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class AdjustmentEventClassTest
implements AdjustmentEventClassTests<AdjustmentEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.AdjustmentEvent]

    @Override
    public Class<AdjustmentEvent> createNewSUT() {
        return AdjustmentEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.AdjustmentEvent#AdjustmentEvent(java.awt.Adjustable, int, int, int, boolean) public
     * java.awt.event.AdjustmentEvent(java.awt.Adjustable,int,int,int,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_AdjustmentEvent_Adjustable_int_int_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AdjustmentEvent sut = null; // = new AdjustmentEvent(java.awt.Adjustable, int, int, int, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.AdjustmentEvent#AdjustmentEvent(java.awt.Adjustable, int, int, int) public
     * java.awt.event.AdjustmentEvent(java.awt.Adjustable,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_AdjustmentEvent_Adjustable_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AdjustmentEvent sut = null; // = new AdjustmentEvent(java.awt.Adjustable, int, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.AdjustmentEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.AdjustmentEvent]

}
