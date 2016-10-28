package org.j8unit.repository.java.nio;

import java.nio.CharBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharBufferTest
implements org.j8unit.repository.java.nio.CharBufferTests<CharBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.CharBuffer]

    @Override
    public CharBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.CharBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.CharBuffer]

}
