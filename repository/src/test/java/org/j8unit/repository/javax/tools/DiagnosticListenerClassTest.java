package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DiagnosticListenerClassTest
implements org.j8unit.repository.javax.tools.DiagnosticListenerClassTests<javax.tools.DiagnosticListener> {

    @Override
    public Class<javax.tools.DiagnosticListener> createNewSUT() {
        return javax.tools.DiagnosticListener.class;
    }

}
