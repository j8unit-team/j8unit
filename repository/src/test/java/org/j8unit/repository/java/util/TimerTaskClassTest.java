package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerTaskClassTest
implements org.j8unit.repository.java.util.TimerTaskClassTests<java.util.TimerTask> {

    @Override
    public Class<java.util.TimerTask> createNewSUT() {
        return java.util.TimerTask.class;
    }

}
