package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.PolicyFactory;

@RunWith(J8Unit4.class)
public class PolicyFactoryTest
implements org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryTests<PolicyFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.PolicyFactory]

    @Override
    public PolicyFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.PolicyFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.PolicyFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.PolicyFactory]

}
