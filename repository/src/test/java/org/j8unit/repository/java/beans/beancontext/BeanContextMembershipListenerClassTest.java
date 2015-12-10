package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextMembershipListenerClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextMembershipListenerClassTests<java.beans.beancontext.BeanContextMembershipListener> {

    @Override
    public Class<java.beans.beancontext.BeanContextMembershipListener> createNewSUT() {
        return java.beans.beancontext.BeanContextMembershipListener.class;
    }

}
