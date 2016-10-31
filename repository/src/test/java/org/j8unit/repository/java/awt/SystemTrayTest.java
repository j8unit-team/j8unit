package org.j8unit.repository.java.awt;

import java.awt.SystemTray;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SystemTrayTest
implements org.j8unit.repository.java.awt.SystemTrayTests<SystemTray> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.SystemTray]

    @Override
    public SystemTray createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.SystemTray], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.SystemTray]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.SystemTray]

}
