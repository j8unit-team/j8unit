package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicBooleanClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicBooleanClassTests<java.util.concurrent.atomic.AtomicBoolean> {

    @Override
    public Class<java.util.concurrent.atomic.AtomicBoolean> createNewSUT() {
        return java.util.concurrent.atomic.AtomicBoolean.class;
    }

}
