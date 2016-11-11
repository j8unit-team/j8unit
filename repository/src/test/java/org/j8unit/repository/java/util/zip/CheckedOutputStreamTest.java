package org.j8unit.repository.java.util.zip;

import java.util.zip.CheckedOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CheckedOutputStream} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.zip.CheckedOutputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class CheckedOutputStreamTest
implements CheckedOutputStreamTests<CheckedOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.CheckedOutputStream]

    @Override
    public CheckedOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.CheckedOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.CheckedOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.CheckedOutputStream]

}
