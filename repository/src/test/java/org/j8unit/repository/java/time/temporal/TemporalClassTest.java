package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalClassTest
implements org.j8unit.repository.java.time.temporal.TemporalClassTests<java.time.temporal.Temporal> {

    @Override
    public Class<java.time.temporal.Temporal> createNewSUT() {
        return java.time.temporal.Temporal.class;
    }

}
