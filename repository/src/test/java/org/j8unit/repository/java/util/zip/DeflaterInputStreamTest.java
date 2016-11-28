package org.j8unit.repository.java.util.zip;

import java.util.zip.DeflaterInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DeflaterInputStream} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.zip.DeflaterInputStreamTests}).
 */
@RunWith(J8Unit4.class)
public class DeflaterInputStreamTest
implements DeflaterInputStreamTests<DeflaterInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.DeflaterInputStream]

    @Override
    public DeflaterInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.DeflaterInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.DeflaterInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.DeflaterInputStream]

}
