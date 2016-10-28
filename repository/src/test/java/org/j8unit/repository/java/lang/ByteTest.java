package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteTest
implements org.j8unit.repository.java.lang.ByteTests<Byte> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Byte]

    @Override
    public Byte createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.Byte], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Byte]

}
