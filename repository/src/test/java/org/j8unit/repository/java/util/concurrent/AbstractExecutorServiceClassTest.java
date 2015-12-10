package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractExecutorServiceClassTest
implements org.j8unit.repository.java.util.concurrent.AbstractExecutorServiceClassTests<java.util.concurrent.AbstractExecutorService> {

    @Override
    public Class<java.util.concurrent.AbstractExecutorService> createNewSUT() {
        return java.util.concurrent.AbstractExecutorService.class;
    }

}
