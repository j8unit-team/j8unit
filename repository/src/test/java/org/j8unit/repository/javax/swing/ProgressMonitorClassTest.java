package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProgressMonitorClassTest
implements org.j8unit.repository.javax.swing.ProgressMonitorClassTests<javax.swing.ProgressMonitor> {

    @Override
    public Class<javax.swing.ProgressMonitor> createNewSUT() {
        return javax.swing.ProgressMonitor.class;
    }

}
