package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanParameterInfoClassTest
implements org.j8unit.repository.javax.management.MBeanParameterInfoClassTests<javax.management.MBeanParameterInfo> {

    @Override
    public Class<javax.management.MBeanParameterInfo> createNewSUT() {
        return javax.management.MBeanParameterInfo.class;
    }

}
