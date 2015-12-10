package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocalTimeTest
implements org.j8unit.repository.java.time.LocalTimeTests<java.time.LocalTime> {

    @Override
    public java.time.LocalTime createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.LocalTime] available.");
    }

}
