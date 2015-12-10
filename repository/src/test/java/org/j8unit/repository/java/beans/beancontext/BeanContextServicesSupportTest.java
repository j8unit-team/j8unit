package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServicesSupportTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServicesSupportTests<java.beans.beancontext.BeanContextServicesSupport> {

    @Override
    public java.beans.beancontext.BeanContextServicesSupport createNewSUT() {
        return new java.beans.beancontext.BeanContextServicesSupport();
    }

}
