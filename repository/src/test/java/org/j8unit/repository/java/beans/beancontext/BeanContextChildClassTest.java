package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextChildClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextChildClassTests<java.beans.beancontext.BeanContextChild> {

    @Override
    public Class<java.beans.beancontext.BeanContextChild> createNewSUT() {
        return java.beans.beancontext.BeanContextChild.class;
    }

}
