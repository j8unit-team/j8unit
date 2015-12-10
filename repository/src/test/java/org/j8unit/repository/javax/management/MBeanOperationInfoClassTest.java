package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanOperationInfoClassTest
implements org.j8unit.repository.javax.management.MBeanOperationInfoClassTests<javax.management.MBeanOperationInfo> {

    @Override
    public Class<javax.management.MBeanOperationInfo> createNewSUT() {
        return javax.management.MBeanOperationInfo.class;
    }

}
