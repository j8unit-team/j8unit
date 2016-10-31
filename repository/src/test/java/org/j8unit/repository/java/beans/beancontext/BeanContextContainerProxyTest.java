package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextContainerProxy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextContainerProxyTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextContainerProxyTests<BeanContextContainerProxy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextContainerProxy]

    @Override
    public BeanContextContainerProxy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.beancontext.BeanContextContainerProxy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextContainerProxy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextContainerProxy]

}
