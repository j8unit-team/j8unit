package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoggingPermissionClassTest
implements org.j8unit.repository.java.util.logging.LoggingPermissionClassTests<java.util.logging.LoggingPermission> {

    @Override
    public Class<java.util.logging.LoggingPermission> createNewSUT() {
        return java.util.logging.LoggingPermission.class;
    }

}
