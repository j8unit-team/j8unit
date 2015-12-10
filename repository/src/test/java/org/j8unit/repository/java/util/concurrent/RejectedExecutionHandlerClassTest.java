package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RejectedExecutionHandlerClassTest
implements org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerClassTests<java.util.concurrent.RejectedExecutionHandler> {

    @Override
    public Class<java.util.concurrent.RejectedExecutionHandler> createNewSUT() {
        return java.util.concurrent.RejectedExecutionHandler.class;
    }

}
