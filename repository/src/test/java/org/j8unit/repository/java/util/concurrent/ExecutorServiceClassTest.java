package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutorServiceClassTest
implements org.j8unit.repository.java.util.concurrent.ExecutorServiceClassTests<java.util.concurrent.ExecutorService> {

    @Override
    public Class<java.util.concurrent.ExecutorService> createNewSUT() {
        return java.util.concurrent.ExecutorService.class;
    }

}
