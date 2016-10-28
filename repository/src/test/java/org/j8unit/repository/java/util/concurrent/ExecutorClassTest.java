package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Executor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutorClassTest
implements org.j8unit.repository.java.util.concurrent.ExecutorClassTests<Executor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Executor]

    @Override
    public Class<Executor> createNewSUT() {
        return Executor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Executor]

}
