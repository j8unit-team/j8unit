package org.j8unit.repository.java.nio;

import java.nio.ShortBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortBufferTest
implements org.j8unit.repository.java.nio.ShortBufferTests<ShortBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.ShortBuffer]

    @Override
    public ShortBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.ShortBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.ShortBuffer]

}
