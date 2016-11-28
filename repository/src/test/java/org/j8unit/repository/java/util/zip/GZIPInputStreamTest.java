package org.j8unit.repository.java.util.zip;

import java.util.zip.GZIPInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GZIPInputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.zip.GZIPInputStreamTests}).
 */
@RunWith(J8Unit4.class)
public class GZIPInputStreamTest
implements GZIPInputStreamTests<GZIPInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.GZIPInputStream]

    @Override
    public GZIPInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.GZIPInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.GZIPInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.GZIPInputStream]

}
