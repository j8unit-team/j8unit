package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServicesListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextServicesListener} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextServicesListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextServicesListenerClassTest
implements BeanContextServicesListenerClassTests<BeanContextServicesListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServicesListener]

    @Override
    public Class<BeanContextServicesListener> createNewSUT() {
        return BeanContextServicesListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextServicesListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServicesListener]

}
