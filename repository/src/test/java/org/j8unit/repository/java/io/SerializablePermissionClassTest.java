package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerializablePermissionClassTest
implements org.j8unit.repository.java.io.SerializablePermissionClassTests<java.io.SerializablePermission> {

    @Override
    public Class<java.io.SerializablePermission> createNewSUT() {
        return java.io.SerializablePermission.class;
    }

}
