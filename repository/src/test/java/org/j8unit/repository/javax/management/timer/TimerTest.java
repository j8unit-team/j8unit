package org.j8unit.repository.javax.management.timer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerTest
implements org.j8unit.repository.javax.management.timer.TimerTests<javax.management.timer.Timer> {

    @Override
    public javax.management.timer.Timer createNewSUT() {
        return new javax.management.timer.Timer();
    }

}
