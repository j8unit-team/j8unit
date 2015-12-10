package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicReferenceArrayTest<E>
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicReferenceArrayTests<java.util.concurrent.atomic.AtomicReferenceArray<E>, E> {

    @Override
    public java.util.concurrent.atomic.AtomicReferenceArray<E> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.concurrent.atomic.AtomicReferenceArray] available.");
    }

}
