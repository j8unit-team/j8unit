package org.j8unit.repository.javax.tools;

import javax.tools.DiagnosticListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DiagnosticListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.tools.DiagnosticListenerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DiagnosticListenerClassTest
implements DiagnosticListenerClassTests<DiagnosticListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.DiagnosticListener]

    @Override
    public Class<DiagnosticListener> createNewSUT() {
        return DiagnosticListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.DiagnosticListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.DiagnosticListener]

}
