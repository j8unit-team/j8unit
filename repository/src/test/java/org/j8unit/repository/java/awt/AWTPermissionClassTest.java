package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTPermissionClassTest
implements org.j8unit.repository.java.awt.AWTPermissionClassTests<java.awt.AWTPermission> {

    @Override
    public Class<java.awt.AWTPermission> createNewSUT() {
        return java.awt.AWTPermission.class;
    }

}
