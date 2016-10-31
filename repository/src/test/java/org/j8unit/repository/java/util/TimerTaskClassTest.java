package org.j8unit.repository.java.util;

import java.util.TimerTask;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerTaskClassTest
implements org.j8unit.repository.java.util.TimerTaskClassTests<TimerTask> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.TimerTask]

    @Override
    public Class<TimerTask> createNewSUT() {
        return TimerTask.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.TimerTask]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.TimerTask]

}
