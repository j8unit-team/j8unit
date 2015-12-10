package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextProxyClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextProxyClassTests<java.beans.beancontext.BeanContextProxy> {

    @Override
    public Class<java.beans.beancontext.BeanContextProxy> createNewSUT() {
        return java.beans.beancontext.BeanContextProxy.class;
    }

}
