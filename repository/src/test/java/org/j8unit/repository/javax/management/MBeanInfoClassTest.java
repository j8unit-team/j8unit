package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanInfoClassTest
implements org.j8unit.repository.javax.management.MBeanInfoClassTests<javax.management.MBeanInfo> {

    @Override
    public Class<javax.management.MBeanInfo> createNewSUT() {
        return javax.management.MBeanInfo.class;
    }

}
