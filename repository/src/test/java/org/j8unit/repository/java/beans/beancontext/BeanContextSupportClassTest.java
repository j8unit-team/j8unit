package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextSupportClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextSupportClassTests<java.beans.beancontext.BeanContextSupport> {

    @Override
    public Class<java.beans.beancontext.BeanContextSupport> createNewSUT() {
        return java.beans.beancontext.BeanContextSupport.class;
    }

}
