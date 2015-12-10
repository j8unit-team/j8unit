package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanInfoTest
implements org.j8unit.repository.javax.management.MBeanInfoTests<javax.management.MBeanInfo> {

    @Override
    public javax.management.MBeanInfo createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.MBeanInfo] available.");
    }

}
