package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BeanContextServiceRevokedEvent} (by
 * simply reusing the J8Unit test interface {@link BeanContextServiceRevokedEventTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextServiceRevokedEventTest
implements BeanContextServiceRevokedEventTests<BeanContextServiceRevokedEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceRevokedEvent]

    @Override
    public BeanContextServiceRevokedEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.beancontext.BeanContextServiceRevokedEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceRevokedEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceRevokedEvent]

}
