package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DiagnosticCollectorTest<S>
implements org.j8unit.repository.javax.tools.DiagnosticCollectorTests<javax.tools.DiagnosticCollector<S>, S> {

    @Override
    public javax.tools.DiagnosticCollector<S> createNewSUT() {
        return new javax.tools.DiagnosticCollector<>();
    }

}
