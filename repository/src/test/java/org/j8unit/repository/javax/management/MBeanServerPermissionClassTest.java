package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerPermissionClassTest
implements org.j8unit.repository.javax.management.MBeanServerPermissionClassTests<javax.management.MBeanServerPermission> {

    @Override
    public Class<javax.management.MBeanServerPermission> createNewSUT() {
        return javax.management.MBeanServerPermission.class;
    }

}
