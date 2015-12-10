package org.j8unit.repository.java.lang.instrument;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstrumentationClassTest
implements org.j8unit.repository.java.lang.instrument.InstrumentationClassTests<java.lang.instrument.Instrumentation> {

    @Override
    public Class<java.lang.instrument.Instrumentation> createNewSUT() {
        return java.lang.instrument.Instrumentation.class;
    }

}
