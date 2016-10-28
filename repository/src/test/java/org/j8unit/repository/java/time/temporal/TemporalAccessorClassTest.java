package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalAccessor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalAccessorClassTest
implements org.j8unit.repository.java.time.temporal.TemporalAccessorClassTests<TemporalAccessor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.TemporalAccessor]

    @Override
    public Class<TemporalAccessor> createNewSUT() {
        return TemporalAccessor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.TemporalAccessor]

}
