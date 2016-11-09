package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ForkJoinWorkerThread;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ForkJoinWorkerThread} (by simply reusing
 * the J8Unit test interface {@link ForkJoinWorkerThreadClassTests}).
 */

@RunWith(J8Unit4.class)
public class ForkJoinWorkerThreadClassTest
implements ForkJoinWorkerThreadClassTests<ForkJoinWorkerThread> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ForkJoinWorkerThread]

    @Override
    public Class<ForkJoinWorkerThread> createNewSUT() {
        return ForkJoinWorkerThread.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ForkJoinWorkerThread]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ForkJoinWorkerThread]

}
