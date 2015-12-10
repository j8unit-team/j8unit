package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PosixFilePermissionsClassTest
implements org.j8unit.repository.java.nio.file.attribute.PosixFilePermissionsClassTests<java.nio.file.attribute.PosixFilePermissions> {

    @Override
    public Class<java.nio.file.attribute.PosixFilePermissions> createNewSUT() {
        return java.nio.file.attribute.PosixFilePermissions.class;
    }

}
