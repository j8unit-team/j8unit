package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServiceProviderClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServiceProviderClassTests<BeanContextServiceProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServiceProvider]

    @Override
    public Class<BeanContextServiceProvider> createNewSUT() {
        return BeanContextServiceProvider.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServiceProvider]

}
