package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ScheduledFuture;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ScheduledFutureClassTest
implements org.j8unit.repository.java.util.concurrent.ScheduledFutureClassTests<ScheduledFuture> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ScheduledFuture]

    @Override
    public Class<ScheduledFuture> createNewSUT() {
        return ScheduledFuture.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ScheduledFuture]

}
