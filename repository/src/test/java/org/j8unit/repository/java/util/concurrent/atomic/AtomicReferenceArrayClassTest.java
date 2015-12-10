package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AtomicReferenceArrayClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicReferenceArrayClassTests<java.util.concurrent.atomic.AtomicReferenceArray> {

    @Override
    public Class<java.util.concurrent.atomic.AtomicReferenceArray> createNewSUT() {
        return java.util.concurrent.atomic.AtomicReferenceArray.class;
    }

}
