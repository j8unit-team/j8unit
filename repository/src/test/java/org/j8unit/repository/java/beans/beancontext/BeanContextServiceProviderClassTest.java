package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServiceProviderClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServiceProviderClassTests<java.beans.beancontext.BeanContextServiceProvider> {

    @Override
    public Class<java.beans.beancontext.BeanContextServiceProvider> createNewSUT() {
        return java.beans.beancontext.BeanContextServiceProvider.class;
    }

}
