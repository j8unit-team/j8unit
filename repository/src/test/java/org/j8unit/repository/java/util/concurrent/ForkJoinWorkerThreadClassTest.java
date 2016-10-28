package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ForkJoinWorkerThread;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForkJoinWorkerThreadClassTest
implements org.j8unit.repository.java.util.concurrent.ForkJoinWorkerThreadClassTests<ForkJoinWorkerThread> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ForkJoinWorkerThread]

    @Override
    public Class<ForkJoinWorkerThread> createNewSUT() {
        return ForkJoinWorkerThread.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ForkJoinWorkerThread]

}
