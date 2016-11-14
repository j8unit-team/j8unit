package org.j8unit.repository.java.util;

import java.util.TimerTask;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TimerTask} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.TimerTaskClassTests}).
 */

@RunWith(J8Unit4.class)
public class TimerTaskClassTest
implements TimerTaskClassTests<TimerTask> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.TimerTask]

    @Override
    public Class<TimerTask> createNewSUT() {
        return TimerTask.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.TimerTask]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.TimerTask]

}
