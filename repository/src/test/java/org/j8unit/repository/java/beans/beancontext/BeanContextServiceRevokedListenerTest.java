package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceRevokedListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BeanContextServiceRevokedListener}
 * (by simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextServiceRevokedListenerTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextServiceRevokedListenerTest
implements BeanContextServiceRevokedListenerTests<BeanContextServiceRevokedListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceRevokedListener]

    @Override
    public BeanContextServiceRevokedListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.beancontext.BeanContextServiceRevokedListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceRevokedListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceRevokedListener]

}
