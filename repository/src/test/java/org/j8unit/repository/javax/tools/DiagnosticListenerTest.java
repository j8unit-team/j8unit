package org.j8unit.repository.javax.tools;

import javax.tools.DiagnosticListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DiagnosticListenerTest<S>
implements org.j8unit.repository.javax.tools.DiagnosticListenerTests<DiagnosticListener<S>, S> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DiagnosticListener]

    @Override
    public DiagnosticListener<S> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.DiagnosticListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DiagnosticListener]

}
