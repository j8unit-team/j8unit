package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalUnitClassTest
implements org.j8unit.repository.java.time.temporal.TemporalUnitClassTests<java.time.temporal.TemporalUnit> {

    @Override
    public Class<java.time.temporal.TemporalUnit> createNewSUT() {
        return java.time.temporal.TemporalUnit.class;
    }

}
