package org.j8unit.repository.java.nio;

import java.nio.Buffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferTest
implements org.j8unit.repository.java.nio.BufferTests<Buffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.Buffer]

    @Override
    public Buffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.Buffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.Buffer]

}
