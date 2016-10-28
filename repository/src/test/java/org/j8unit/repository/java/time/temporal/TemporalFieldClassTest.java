package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalField;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalFieldClassTest
implements org.j8unit.repository.java.time.temporal.TemporalFieldClassTests<TemporalField> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.TemporalField]

    @Override
    public Class<TemporalField> createNewSUT() {
        return TemporalField.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.TemporalField]

}
