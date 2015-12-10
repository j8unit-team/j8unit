package org.j8unit.repository.javax.management.timer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerClassTest
implements org.j8unit.repository.javax.management.timer.TimerClassTests<javax.management.timer.Timer> {

    @Override
    public Class<javax.management.timer.Timer> createNewSUT() {
        return javax.management.timer.Timer.class;
    }

}
