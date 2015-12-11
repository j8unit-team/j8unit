package org.j8unit.repository.java.lang.ref;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceQueueTest<T>
implements org.j8unit.repository.java.lang.ref.ReferenceQueueTests<java.lang.ref.ReferenceQueue<T>, T> {

    @Override
    public java.lang.ref.ReferenceQueue<T> createNewSUT() {
        return new java.lang.ref.ReferenceQueue<>();
    }

}
