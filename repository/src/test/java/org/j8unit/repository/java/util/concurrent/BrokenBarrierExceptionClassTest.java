package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BrokenBarrierExceptionClassTest
implements org.j8unit.repository.java.util.concurrent.BrokenBarrierExceptionClassTests<java.util.concurrent.BrokenBarrierException> {

    @Override
    public Class<java.util.concurrent.BrokenBarrierException> createNewSUT() {
        return java.util.concurrent.BrokenBarrierException.class;
    }

}
