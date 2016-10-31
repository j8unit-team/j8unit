package org.j8unit.repository.java.io;

import java.io.Flushable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FlushableTest
implements org.j8unit.repository.java.io.FlushableTests<Flushable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.Flushable]

    @Override
    public Flushable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.Flushable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.Flushable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.Flushable]

}
