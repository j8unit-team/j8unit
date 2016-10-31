package org.j8unit.repository.java.io;

import java.io.Closeable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CloseableTest
implements org.j8unit.repository.java.io.CloseableTests<Closeable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.Closeable]

    @Override
    public Closeable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.Closeable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.Closeable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.Closeable]

}
