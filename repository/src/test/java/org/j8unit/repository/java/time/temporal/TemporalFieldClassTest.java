package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalFieldClassTest
implements org.j8unit.repository.java.time.temporal.TemporalFieldClassTests<java.time.temporal.TemporalField> {

    @Override
    public Class<java.time.temporal.TemporalField> createNewSUT() {
        return java.time.temporal.TemporalField.class;
    }

}
