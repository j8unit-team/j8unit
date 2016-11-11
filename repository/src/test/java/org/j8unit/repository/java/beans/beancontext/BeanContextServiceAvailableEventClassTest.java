package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextServiceAvailableEvent} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextServiceAvailableEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextServiceAvailableEventClassTest
implements BeanContextServiceAvailableEventClassTests<BeanContextServiceAvailableEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServiceAvailableEvent]

    @Override
    public Class<BeanContextServiceAvailableEvent> createNewSUT() {
        return BeanContextServiceAvailableEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.beancontext.BeanContextServiceAvailableEvent#BeanContextServiceAvailableEvent(java.beans.beancontext.BeanContextServices, Class)
     * public
     * java.beans.beancontext.BeanContextServiceAvailableEvent(java.beans.beancontext.BeanContextServices,java.lang.Class)}.
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
    public void create_BeanContextServiceAvailableEvent_BeanContextServices_Class()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BeanContextServiceAvailableEvent sut = null; // = new
                                                           // BeanContextServiceAvailableEvent(java.beans.beancontext.BeanContextServices,
                                                           // Class);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextServiceAvailableEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServiceAvailableEvent]

}
