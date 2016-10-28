package org.j8unit.repository.java.lang.instrument;

import java.lang.instrument.Instrumentation;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstrumentationClassTest
implements org.j8unit.repository.java.lang.instrument.InstrumentationClassTests<Instrumentation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.instrument.Instrumentation]

    @Override
    public Class<Instrumentation> createNewSUT() {
        return Instrumentation.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.instrument.Instrumentation]

}
