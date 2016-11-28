package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextServiceRevokedEvent} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextServiceRevokedEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class BeanContextServiceRevokedEventClassTest
implements BeanContextServiceRevokedEventClassTests<BeanContextServiceRevokedEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServiceRevokedEvent]

    @Override
    public Class<BeanContextServiceRevokedEvent> createNewSUT() {
        return BeanContextServiceRevokedEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.beancontext.BeanContextServiceRevokedEvent#BeanContextServiceRevokedEvent(java.beans.beancontext.BeanContextServices, Class, boolean)
     * public
     * java.beans.beancontext.BeanContextServiceRevokedEvent(java.beans.beancontext.BeanContextServices,java.lang.Class,boolean)}.
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
    public void create_BeanContextServiceRevokedEvent_BeanContextServices_Class_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BeanContextServiceRevokedEvent sut = null; // = new
                                                         // BeanContextServiceRevokedEvent(java.beans.beancontext.BeanContextServices,
                                                         // Class, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextServiceRevokedEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServiceRevokedEvent]

}
