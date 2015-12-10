package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardMBeanTest
implements org.j8unit.repository.javax.management.StandardMBeanTests<javax.management.StandardMBean> {

    @Override
    public javax.management.StandardMBean createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.management.StandardMBean] available.");
    }

}
