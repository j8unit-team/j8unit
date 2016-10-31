package org.j8unit.repository.javax.swing;

import javax.swing.Timer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerTest
implements org.j8unit.repository.javax.swing.TimerTests<Timer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Timer]

    @Override
    public Timer createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.Timer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Timer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Timer]

}
