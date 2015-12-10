package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalAccessorClassTest
implements org.j8unit.repository.java.time.temporal.TemporalAccessorClassTests<java.time.temporal.TemporalAccessor> {

    @Override
    public Class<java.time.temporal.TemporalAccessor> createNewSUT() {
        return java.time.temporal.TemporalAccessor.class;
    }

}
