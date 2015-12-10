package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerBuilderTest
implements org.j8unit.repository.javax.management.MBeanServerBuilderTests<javax.management.MBeanServerBuilder> {

    @Override
    public javax.management.MBeanServerBuilder createNewSUT() {
        return new javax.management.MBeanServerBuilder();
    }

}
