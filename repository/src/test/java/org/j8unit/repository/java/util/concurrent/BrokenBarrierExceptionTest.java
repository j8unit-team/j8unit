package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BrokenBarrierExceptionTest
implements org.j8unit.repository.java.util.concurrent.BrokenBarrierExceptionTests<java.util.concurrent.BrokenBarrierException> {

    @Override
    public java.util.concurrent.BrokenBarrierException createNewSUT() {
        return new java.util.concurrent.BrokenBarrierException();
    }

}
