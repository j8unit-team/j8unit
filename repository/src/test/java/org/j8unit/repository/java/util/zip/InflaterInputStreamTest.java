package org.j8unit.repository.java.util.zip;

import java.util.zip.InflaterInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InflaterInputStream} (by simply
 * reusing the J8Unit test interface {@link InflaterInputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class InflaterInputStreamTest
implements InflaterInputStreamTests<InflaterInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.InflaterInputStream]

    @Override
    public InflaterInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.InflaterInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.InflaterInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.InflaterInputStream]

}
