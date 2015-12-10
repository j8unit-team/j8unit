package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkPermissionClassTest
implements org.j8unit.repository.java.nio.file.LinkPermissionClassTests<java.nio.file.LinkPermission> {

    @Override
    public Class<java.nio.file.LinkPermission> createNewSUT() {
        return java.nio.file.LinkPermission.class;
    }

}
