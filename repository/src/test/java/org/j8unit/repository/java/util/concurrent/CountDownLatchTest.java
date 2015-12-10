package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CountDownLatchTest
implements org.j8unit.repository.java.util.concurrent.CountDownLatchTests<java.util.concurrent.CountDownLatch> {

    @Override
    public java.util.concurrent.CountDownLatch createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.concurrent.CountDownLatch] available.");
    }

}
