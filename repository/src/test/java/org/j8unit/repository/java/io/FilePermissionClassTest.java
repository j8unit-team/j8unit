package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilePermissionClassTest
implements org.j8unit.repository.java.io.FilePermissionClassTests<java.io.FilePermission> {

    @Override
    public Class<java.io.FilePermission> createNewSUT() {
        return java.io.FilePermission.class;
    }

}
