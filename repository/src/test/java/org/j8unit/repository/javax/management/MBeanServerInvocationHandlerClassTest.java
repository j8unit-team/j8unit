package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerInvocationHandlerClassTest
implements org.j8unit.repository.javax.management.MBeanServerInvocationHandlerClassTests<javax.management.MBeanServerInvocationHandler> {

    @Override
    public Class<javax.management.MBeanServerInvocationHandler> createNewSUT() {
        return javax.management.MBeanServerInvocationHandler.class;
    }

}
