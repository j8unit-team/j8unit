package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceRevokedListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextServiceRevokedListener} (by
 * simply reusing the J8Unit test interface {@link BeanContextServiceRevokedListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextServiceRevokedListenerClassTest
implements BeanContextServiceRevokedListenerClassTests<BeanContextServiceRevokedListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServiceRevokedListener]

    @Override
    public Class<BeanContextServiceRevokedListener> createNewSUT() {
        return BeanContextServiceRevokedListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextServiceRevokedListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServiceRevokedListener]

}
