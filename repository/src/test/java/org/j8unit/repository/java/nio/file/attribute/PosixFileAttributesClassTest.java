package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PosixFileAttributes} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.PosixFileAttributesClassTests}).
 */

@RunWith(J8Unit4.class)
public class PosixFileAttributesClassTest
implements PosixFileAttributesClassTests<PosixFileAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.PosixFileAttributes]

    @Override
    public Class<PosixFileAttributes> createNewSUT() {
        return PosixFileAttributes.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.PosixFileAttributes]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.PosixFileAttributes]

}
