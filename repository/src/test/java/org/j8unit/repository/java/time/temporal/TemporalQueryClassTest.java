package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class TemporalQueryClassTest
implements org.j8unit.repository.java.time.temporal.TemporalQueryClassTests<java.time.temporal.TemporalQuery> {

    @Override
    public Class<java.time.temporal.TemporalQuery> createNewSUT() {
        return java.time.temporal.TemporalQuery.class;
    }

}
