package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanFeatureInfoClassTest
implements org.j8unit.repository.javax.management.MBeanFeatureInfoClassTests<javax.management.MBeanFeatureInfo> {

    @Override
    public Class<javax.management.MBeanFeatureInfo> createNewSUT() {
        return javax.management.MBeanFeatureInfo.class;
    }

}
