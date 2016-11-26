package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Byte} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.ByteTests}).
 */
@RunWith(J8Unit4.class)
public class ByteTest
implements ByteTests<Byte> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Byte]

    @Override
    public Byte createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.Byte], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Byte]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Byte]

}
