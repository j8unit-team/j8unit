package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServicesListenerClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServicesListenerClassTests<java.beans.beancontext.BeanContextServicesListener> {

    @Override
    public Class<java.beans.beancontext.BeanContextServicesListener> createNewSUT() {
        return java.beans.beancontext.BeanContextServicesListener.class;
    }

}
