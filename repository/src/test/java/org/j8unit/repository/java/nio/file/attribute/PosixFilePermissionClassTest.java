package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PosixFilePermissionClassTest
implements org.j8unit.repository.java.nio.file.attribute.PosixFilePermissionClassTests<java.nio.file.attribute.PosixFilePermission> {

    @Override
    public Class<java.nio.file.attribute.PosixFilePermission> createNewSUT() {
        return java.nio.file.attribute.PosixFilePermission.class;
    }

}
