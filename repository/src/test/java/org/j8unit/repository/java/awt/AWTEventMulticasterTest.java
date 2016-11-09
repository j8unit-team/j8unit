package org.j8unit.repository.java.awt;

import java.awt.AWTEventMulticaster;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AWTEventMulticaster} (by simply
 * reusing the J8Unit test interface {@link AWTEventMulticasterTests}).
 */

@RunWith(J8Unit4.class)
public class AWTEventMulticasterTest
implements AWTEventMulticasterTests<AWTEventMulticaster> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.AWTEventMulticaster]

    @Override
    public AWTEventMulticaster createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.AWTEventMulticaster], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.AWTEventMulticaster]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.AWTEventMulticaster]

}
