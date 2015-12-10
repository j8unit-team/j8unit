package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AtomicReferenceClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicReferenceClassTests<java.util.concurrent.atomic.AtomicReference> {

    @Override
    public Class<java.util.concurrent.atomic.AtomicReference> createNewSUT() {
        return java.util.concurrent.atomic.AtomicReference.class;
    }

}
