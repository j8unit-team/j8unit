package org.j8unit.repository.java.awt;

import java.awt.AWTPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTPermissionTest
implements org.j8unit.repository.java.awt.AWTPermissionTests<AWTPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.AWTPermission]

    @Override
    public AWTPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.AWTPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.AWTPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.AWTPermission]

}
