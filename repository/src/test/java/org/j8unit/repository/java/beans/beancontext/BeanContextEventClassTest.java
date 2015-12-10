package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextEventClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextEventClassTests<java.beans.beancontext.BeanContextEvent> {

    @Override
    public Class<java.beans.beancontext.BeanContextEvent> createNewSUT() {
        return java.beans.beancontext.BeanContextEvent.class;
    }

}
