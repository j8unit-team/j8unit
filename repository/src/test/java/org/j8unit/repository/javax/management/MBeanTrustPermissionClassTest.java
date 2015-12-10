package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanTrustPermissionClassTest
implements org.j8unit.repository.javax.management.MBeanTrustPermissionClassTests<javax.management.MBeanTrustPermission> {

    @Override
    public Class<javax.management.MBeanTrustPermission> createNewSUT() {
        return javax.management.MBeanTrustPermission.class;
    }

}
