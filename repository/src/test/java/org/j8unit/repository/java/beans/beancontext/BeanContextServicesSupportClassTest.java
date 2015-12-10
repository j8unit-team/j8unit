package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServicesSupportClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServicesSupportClassTests<java.beans.beancontext.BeanContextServicesSupport> {

    @Override
    public Class<java.beans.beancontext.BeanContextServicesSupport> createNewSUT() {
        return java.beans.beancontext.BeanContextServicesSupport.class;
    }

}
