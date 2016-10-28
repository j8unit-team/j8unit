package org.j8unit.repository.javax.tools;

import javax.tools.DiagnosticListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DiagnosticListenerClassTest
implements org.j8unit.repository.javax.tools.DiagnosticListenerClassTests<DiagnosticListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.DiagnosticListener]

    @Override
    public Class<DiagnosticListener> createNewSUT() {
        return DiagnosticListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.DiagnosticListener]

}
