package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class RunnableScheduledFutureClassTest
implements org.j8unit.repository.java.util.concurrent.RunnableScheduledFutureClassTests<java.util.concurrent.RunnableScheduledFuture> {

    @Override
    public Class<java.util.concurrent.RunnableScheduledFuture> createNewSUT() {
        return java.util.concurrent.RunnableScheduledFuture.class;
    }

}
