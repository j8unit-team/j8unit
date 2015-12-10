package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextClassTests<java.beans.beancontext.BeanContext> {

    @Override
    public Class<java.beans.beancontext.BeanContext> createNewSUT() {
        return java.beans.beancontext.BeanContext.class;
    }

}
