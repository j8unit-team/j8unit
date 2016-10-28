package org.j8unit.repository.java.nio;

import java.nio.DoubleBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleBufferTest
implements org.j8unit.repository.java.nio.DoubleBufferTests<DoubleBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.DoubleBuffer]

    @Override
    public DoubleBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.DoubleBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.DoubleBuffer]

}
