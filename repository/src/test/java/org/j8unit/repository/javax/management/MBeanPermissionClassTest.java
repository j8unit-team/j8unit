package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanPermissionClassTest
implements org.j8unit.repository.javax.management.MBeanPermissionClassTests<javax.management.MBeanPermission> {

    @Override
    public Class<javax.management.MBeanPermission> createNewSUT() {
        return javax.management.MBeanPermission.class;
    }

}
