package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServicesListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServicesListenerClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServicesListenerClassTests<BeanContextServicesListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServicesListener]

    @Override
    public Class<BeanContextServicesListener> createNewSUT() {
        return BeanContextServicesListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServicesListener]

}
