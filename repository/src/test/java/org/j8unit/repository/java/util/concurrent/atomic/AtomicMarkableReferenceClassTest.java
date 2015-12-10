package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AtomicMarkableReferenceClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicMarkableReferenceClassTests<java.util.concurrent.atomic.AtomicMarkableReference> {

    @Override
    public Class<java.util.concurrent.atomic.AtomicMarkableReference> createNewSUT() {
        return java.util.concurrent.atomic.AtomicMarkableReference.class;
    }

}
