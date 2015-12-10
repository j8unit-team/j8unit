package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanConstructorInfoClassTest
implements org.j8unit.repository.javax.management.MBeanConstructorInfoClassTests<javax.management.MBeanConstructorInfo> {

    @Override
    public Class<javax.management.MBeanConstructorInfo> createNewSUT() {
        return javax.management.MBeanConstructorInfo.class;
    }

}
