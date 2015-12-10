package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CountDownLatchClassTest
implements org.j8unit.repository.java.util.concurrent.CountDownLatchClassTests<java.util.concurrent.CountDownLatch> {

    @Override
    public Class<java.util.concurrent.CountDownLatch> createNewSUT() {
        return java.util.concurrent.CountDownLatch.class;
    }

}
