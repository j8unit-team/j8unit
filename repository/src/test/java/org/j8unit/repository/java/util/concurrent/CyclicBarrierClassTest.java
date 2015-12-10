package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CyclicBarrierClassTest
implements org.j8unit.repository.java.util.concurrent.CyclicBarrierClassTests<java.util.concurrent.CyclicBarrier> {

    @Override
    public Class<java.util.concurrent.CyclicBarrier> createNewSUT() {
        return java.util.concurrent.CyclicBarrier.class;
    }

}
