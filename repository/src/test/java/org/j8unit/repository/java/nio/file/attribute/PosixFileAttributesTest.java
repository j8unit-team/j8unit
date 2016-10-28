package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PosixFileAttributesTest
implements org.j8unit.repository.java.nio.file.attribute.PosixFileAttributesTests<PosixFileAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.PosixFileAttributes]

    @Override
    public PosixFileAttributes createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.attribute.PosixFileAttributes], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.PosixFileAttributes]

}
