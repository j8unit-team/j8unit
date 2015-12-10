package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FutureTaskTest<V>
implements org.j8unit.repository.java.util.concurrent.FutureTaskTests<java.util.concurrent.FutureTask<V>, V> {

    @Override
    public java.util.concurrent.FutureTask<V> createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.util.concurrent.FutureTask] available.");
    }

}
