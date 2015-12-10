package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForkJoinWorkerThreadClassTest
implements org.j8unit.repository.java.util.concurrent.ForkJoinWorkerThreadClassTests<java.util.concurrent.ForkJoinWorkerThread> {

    @Override
    public Class<java.util.concurrent.ForkJoinWorkerThread> createNewSUT() {
        return java.util.concurrent.ForkJoinWorkerThread.class;
    }

}
