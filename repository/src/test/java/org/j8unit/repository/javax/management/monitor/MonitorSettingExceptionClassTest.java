package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorSettingExceptionClassTest
implements org.j8unit.repository.javax.management.monitor.MonitorSettingExceptionClassTests<javax.management.monitor.MonitorSettingException> {

    @Override
    public Class<javax.management.monitor.MonitorSettingException> createNewSUT() {
        return javax.management.monitor.MonitorSettingException.class;
    }

}