package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForkJoinPoolTest
implements org.j8unit.repository.java.util.concurrent.ForkJoinPoolTests<java.util.concurrent.ForkJoinPool> {

    @Override
    public java.util.concurrent.ForkJoinPool createNewSUT() {
        return new java.util.concurrent.ForkJoinPool();
    }

}
