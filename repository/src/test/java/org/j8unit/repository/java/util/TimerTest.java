package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerTest
implements org.j8unit.repository.java.util.TimerTests<java.util.Timer> {

    @Override
    public java.util.Timer createNewSUT() {
        return new java.util.Timer();
    }

}
