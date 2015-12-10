package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanPermissionTest
implements org.j8unit.repository.javax.management.MBeanPermissionTests<javax.management.MBeanPermission> {

    @Override
    public javax.management.MBeanPermission createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.MBeanPermission] available.");
    }

}
