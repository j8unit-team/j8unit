package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutorClassTest
implements org.j8unit.repository.java.util.concurrent.ExecutorClassTests<java.util.concurrent.Executor> {

    @Override
    public Class<java.util.concurrent.Executor> createNewSUT() {
        return java.util.concurrent.Executor.class;
    }

}
