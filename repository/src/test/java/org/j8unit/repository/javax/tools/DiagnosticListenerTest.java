package org.j8unit.repository.javax.tools;

import javax.tools.DiagnosticListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DiagnosticListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.tools.DiagnosticListenerTests}).
 */
@RunWith(J8Unit4.class)
public class DiagnosticListenerTest<S>
implements DiagnosticListenerTests<DiagnosticListener<S>, S> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DiagnosticListener]

    @Override
    public DiagnosticListener<S> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.DiagnosticListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.DiagnosticListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.DiagnosticListener]

}
