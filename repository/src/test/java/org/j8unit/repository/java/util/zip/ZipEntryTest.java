package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ZipEntry} (by simply reusing the
 * J8Unit test interface {@link ZipEntryTests}).
 */

@RunWith(J8Unit4.class)
public class ZipEntryTest
implements ZipEntryTests<ZipEntry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.ZipEntry]

    @Override
    public ZipEntry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.ZipEntry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.ZipEntry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.ZipEntry]

}
