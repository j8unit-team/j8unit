package org.j8unit.repository.java.io;

import java.io.SequenceInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SequenceInputStream} (by simply
 * reusing the J8Unit test interface {@link SequenceInputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class SequenceInputStreamTest
implements SequenceInputStreamTests<SequenceInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.SequenceInputStream]

    @Override
    public SequenceInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.SequenceInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.SequenceInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.SequenceInputStream]

}
