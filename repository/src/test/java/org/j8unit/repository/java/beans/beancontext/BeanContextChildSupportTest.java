package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextChildSupportTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextChildSupportTests<java.beans.beancontext.BeanContextChildSupport> {

    @Override
    public java.beans.beancontext.BeanContextChildSupport createNewSUT() {
        return new java.beans.beancontext.BeanContextChildSupport();
    }

}
