package org.j8unit.repository.java.util.zip;

import java.util.zip.GZIPOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GZIPOutputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.zip.GZIPOutputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class GZIPOutputStreamTest
implements GZIPOutputStreamTests<GZIPOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.GZIPOutputStream]

    @Override
    public GZIPOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.GZIPOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.GZIPOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.GZIPOutputStream]

}
