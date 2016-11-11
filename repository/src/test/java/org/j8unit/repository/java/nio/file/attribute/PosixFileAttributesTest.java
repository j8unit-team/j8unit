package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PosixFileAttributes} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.PosixFileAttributesTests}).
 */

@RunWith(J8Unit4.class)
public class PosixFileAttributesTest
implements PosixFileAttributesTests<PosixFileAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.PosixFileAttributes]

    @Override
    public PosixFileAttributes createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.attribute.PosixFileAttributes], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.attribute.PosixFileAttributes]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.attribute.PosixFileAttributes]

}
