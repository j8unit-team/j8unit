package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorInfoClassTest
implements org.j8unit.repository.java.lang.management.MonitorInfoClassTests<java.lang.management.MonitorInfo> {

    @Override
    public Class<java.lang.management.MonitorInfo> createNewSUT() {
        return java.lang.management.MonitorInfo.class;
    }

}
