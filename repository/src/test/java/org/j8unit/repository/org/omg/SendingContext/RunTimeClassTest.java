package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.SendingContext.RunTime;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RunTime} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.SendingContext.RunTimeClassTests}).
 */
@RunWith(J8Unit4.class)
public class RunTimeClassTest
implements RunTimeClassTests<RunTime> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.SendingContext.RunTime]

    @Override
    public Class<RunTime> createNewSUT() {
        return RunTime.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.SendingContext.RunTime]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.SendingContext.RunTime]

}
