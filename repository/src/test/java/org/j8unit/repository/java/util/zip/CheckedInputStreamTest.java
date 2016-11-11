package org.j8unit.repository.java.util.zip;

import java.util.zip.CheckedInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CheckedInputStream} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.zip.CheckedInputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class CheckedInputStreamTest
implements CheckedInputStreamTests<CheckedInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.CheckedInputStream]

    @Override
    public CheckedInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.CheckedInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.CheckedInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.CheckedInputStream]

}
