package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DiagnosticCollectorClassTest
implements org.j8unit.repository.javax.tools.DiagnosticCollectorClassTests<javax.tools.DiagnosticCollector> {

    @Override
    public Class<javax.tools.DiagnosticCollector> createNewSUT() {
        return javax.tools.DiagnosticCollector.class;
    }

}
