package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalAdjusterClassTest
implements org.j8unit.repository.java.time.temporal.TemporalAdjusterClassTests<java.time.temporal.TemporalAdjuster> {

    @Override
    public Class<java.time.temporal.TemporalAdjuster> createNewSUT() {
        return java.time.temporal.TemporalAdjuster.class;
    }

}
