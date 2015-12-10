package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneOffsetTest
implements org.j8unit.repository.java.time.ZoneOffsetTests<java.time.ZoneOffset> {

    @Override
    public java.time.ZoneOffset createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.ZoneOffset] available.");
    }

}
