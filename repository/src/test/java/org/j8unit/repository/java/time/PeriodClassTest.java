package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PeriodClassTest
implements org.j8unit.repository.java.time.PeriodClassTests<java.time.Period> {

    @Override
    public Class<java.time.Period> createNewSUT() {
        return java.time.Period.class;
    }

}
