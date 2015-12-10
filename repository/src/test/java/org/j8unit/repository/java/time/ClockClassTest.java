package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClockClassTest
implements org.j8unit.repository.java.time.ClockClassTests<java.time.Clock> {

    @Override
    public Class<java.time.Clock> createNewSUT() {
        return java.time.Clock.class;
    }

}
