package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanFeatureInfoTest
implements org.j8unit.repository.javax.management.MBeanFeatureInfoTests<javax.management.MBeanFeatureInfo> {

    @Override
    public javax.management.MBeanFeatureInfo createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.MBeanFeatureInfo] available.");
    }

}
