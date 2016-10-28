package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ExecutorService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutorServiceClassTest
implements org.j8unit.repository.java.util.concurrent.ExecutorServiceClassTests<ExecutorService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ExecutorService]

    @Override
    public Class<ExecutorService> createNewSUT() {
        return ExecutorService.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ExecutorService]

}
