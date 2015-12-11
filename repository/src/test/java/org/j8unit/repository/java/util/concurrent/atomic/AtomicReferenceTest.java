package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicReferenceTest<V>
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicReferenceTests<java.util.concurrent.atomic.AtomicReference<V>, V> {

    @Override
    public java.util.concurrent.atomic.AtomicReference<V> createNewSUT() {
        return new java.util.concurrent.atomic.AtomicReference<>();
    }

}
