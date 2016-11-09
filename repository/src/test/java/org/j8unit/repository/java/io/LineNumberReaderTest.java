package org.j8unit.repository.java.io;

import java.io.LineNumberReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LineNumberReader} (by simply reusing
 * the J8Unit test interface {@link LineNumberReaderTests}).
 */

@RunWith(J8Unit4.class)
public class LineNumberReaderTest
implements LineNumberReaderTests<LineNumberReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.LineNumberReader]

    @Override
    public LineNumberReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.LineNumberReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.LineNumberReader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.LineNumberReader]

}
