package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextChildSupportClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextChildSupportClassTests<java.beans.beancontext.BeanContextChildSupport> {

    @Override
    public Class<java.beans.beancontext.BeanContextChildSupport> createNewSUT() {
        return java.beans.beancontext.BeanContextChildSupport.class;
    }

}
