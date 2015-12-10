package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerBuilderClassTest
implements org.j8unit.repository.javax.management.MBeanServerBuilderClassTests<javax.management.MBeanServerBuilder> {

    @Override
    public Class<javax.management.MBeanServerBuilder> createNewSUT() {
        return javax.management.MBeanServerBuilder.class;
    }

}
