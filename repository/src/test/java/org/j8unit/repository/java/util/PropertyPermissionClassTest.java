package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyPermissionClassTest
implements org.j8unit.repository.java.util.PropertyPermissionClassTests<java.util.PropertyPermission> {

    @Override
    public Class<java.util.PropertyPermission> createNewSUT() {
        return java.util.PropertyPermission.class;
    }

}
