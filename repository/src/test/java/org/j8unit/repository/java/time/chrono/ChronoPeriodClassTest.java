package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChronoPeriodClassTest
implements org.j8unit.repository.java.time.chrono.ChronoPeriodClassTests<java.time.chrono.ChronoPeriod> {

    @Override
    public Class<java.time.chrono.ChronoPeriod> createNewSUT() {
        return java.time.chrono.ChronoPeriod.class;
    }

}
