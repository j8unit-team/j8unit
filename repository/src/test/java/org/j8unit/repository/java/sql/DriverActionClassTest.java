package org.j8unit.repository.java.sql;

import java.sql.DriverAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverActionClassTest
implements org.j8unit.repository.java.sql.DriverActionClassTests<DriverAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.DriverAction]

    @Override
    public Class<DriverAction> createNewSUT() {
        return DriverAction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.DriverAction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.DriverAction]

}
