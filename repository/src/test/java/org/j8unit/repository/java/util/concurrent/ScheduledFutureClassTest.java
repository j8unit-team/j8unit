package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ScheduledFutureClassTest
implements org.j8unit.repository.java.util.concurrent.ScheduledFutureClassTests<java.util.concurrent.ScheduledFuture> {

    @Override
    public Class<java.util.concurrent.ScheduledFuture> createNewSUT() {
        return java.util.concurrent.ScheduledFuture.class;
    }

}
