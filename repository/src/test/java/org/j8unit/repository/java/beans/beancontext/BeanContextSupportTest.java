package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextSupportTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextSupportTests<java.beans.beancontext.BeanContextSupport> {

    @Override
    public java.beans.beancontext.BeanContextSupport createNewSUT() {
        return new java.beans.beancontext.BeanContextSupport();
    }

}
