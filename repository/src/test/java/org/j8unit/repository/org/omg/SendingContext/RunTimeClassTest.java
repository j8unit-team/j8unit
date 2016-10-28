package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.SendingContext.RunTime;

@RunWith(J8Unit4.class)
public class RunTimeClassTest
implements org.j8unit.repository.org.omg.SendingContext.RunTimeClassTests<RunTime> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.SendingContext.RunTime]

    @Override
    public Class<RunTime> createNewSUT() {
        return RunTime.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.SendingContext.RunTime]

}
