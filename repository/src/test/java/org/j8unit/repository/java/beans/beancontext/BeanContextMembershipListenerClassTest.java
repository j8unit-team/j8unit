package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextMembershipListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextMembershipListener} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextMembershipListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class BeanContextMembershipListenerClassTest
implements BeanContextMembershipListenerClassTests<BeanContextMembershipListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextMembershipListener]

    @Override
    public Class<BeanContextMembershipListener> createNewSUT() {
        return BeanContextMembershipListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextMembershipListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextMembershipListener]

}
