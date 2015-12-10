package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AtomicStampedReferenceClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicStampedReferenceClassTests<java.util.concurrent.atomic.AtomicStampedReference> {

    @Override
    public Class<java.util.concurrent.atomic.AtomicStampedReference> createNewSUT() {
        return java.util.concurrent.atomic.AtomicStampedReference.class;
    }

}
