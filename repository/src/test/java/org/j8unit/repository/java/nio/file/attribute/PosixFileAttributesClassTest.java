package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PosixFileAttributesClassTest
implements org.j8unit.repository.java.nio.file.attribute.PosixFileAttributesClassTests<PosixFileAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.PosixFileAttributes]

    @Override
    public Class<PosixFileAttributes> createNewSUT() {
        return PosixFileAttributes.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.PosixFileAttributes]

}
