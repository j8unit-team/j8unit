package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DiagnosticClassTest
implements org.j8unit.repository.javax.tools.DiagnosticClassTests<javax.tools.Diagnostic> {

    @RunWith(J8Unit4.class)
    public static class KindClassTest
    implements org.j8unit.repository.javax.tools.DiagnosticClassTests.KindClassTests<javax.tools.Diagnostic.Kind> {

        @Override
        public Class<javax.tools.Diagnostic.Kind> createNewSUT() {
            return javax.tools.Diagnostic.Kind.class;
        }

    }

    @Override
    public Class<javax.tools.Diagnostic> createNewSUT() {
        return javax.tools.Diagnostic.class;
    }

}
