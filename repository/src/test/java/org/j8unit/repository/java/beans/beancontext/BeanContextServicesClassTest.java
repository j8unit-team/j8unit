package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServicesClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServicesClassTests<java.beans.beancontext.BeanContextServices> {

    @Override
    public Class<java.beans.beancontext.BeanContextServices> createNewSUT() {
        return java.beans.beancontext.BeanContextServices.class;
    }

}
