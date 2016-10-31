package org.j8unit.repository.javax.management;

import javax.management.MBeanServerInvocationHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerInvocationHandlerTest
implements org.j8unit.repository.javax.management.MBeanServerInvocationHandlerTests<MBeanServerInvocationHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanServerInvocationHandler]

    @Override
    public MBeanServerInvocationHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.MBeanServerInvocationHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.MBeanServerInvocationHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.MBeanServerInvocationHandler]

}
