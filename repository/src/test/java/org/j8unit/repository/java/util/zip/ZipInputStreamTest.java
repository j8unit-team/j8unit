package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ZipInputStream} (by simply reusing
 * the J8Unit test interface {@link ZipInputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class ZipInputStreamTest
implements ZipInputStreamTests<ZipInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.ZipInputStream]

    @Override
    public ZipInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.ZipInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.ZipInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.ZipInputStream]

}
