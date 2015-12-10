package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextContainerProxyClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextContainerProxyClassTests<java.beans.beancontext.BeanContextContainerProxy> {

    @Override
    public Class<java.beans.beancontext.BeanContextContainerProxy> createNewSUT() {
        return java.beans.beancontext.BeanContextContainerProxy.class;
    }

}
