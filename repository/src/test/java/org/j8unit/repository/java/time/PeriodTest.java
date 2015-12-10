package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PeriodTest
implements org.j8unit.repository.java.time.PeriodTests<java.time.Period> {

    @Override
    public java.time.Period createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.time.Period] available.");
    }

}
