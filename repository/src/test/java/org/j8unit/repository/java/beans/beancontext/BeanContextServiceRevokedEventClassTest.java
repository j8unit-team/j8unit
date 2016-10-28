package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.beans.beancontext.BeanContextServices;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServiceRevokedEventClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServiceRevokedEventClassTests<BeanContextServiceRevokedEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServiceRevokedEvent]

    @Override
    public Class<BeanContextServiceRevokedEvent> createNewSUT() {
        return BeanContextServiceRevokedEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link BeanContextServiceRevokedEvent#BeanContextServiceRevokedEvent(BeanContextServices, Class, boolean) public
     * java.beans.beancontext.BeanContextServiceRevokedEvent(java.beans.beancontext.BeanContextServices,java.lang.Class,boolean)}
     * .
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
        final BeanContextServiceRevokedEvent sut = null; // = new BeanContextServiceRevokedEvent(BeanContextServices,
                                                         // Class, boolean);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServiceRevokedEvent]

}
