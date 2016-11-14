package org.j8unit.repository.java.beans;

import java.beans.DesignMode;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DesignMode} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.DesignModeTests}).
 */

@RunWith(J8Unit4.class)
public class DesignModeTest
implements DesignModeTests<DesignMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.DesignMode]

    @Override
    public DesignMode createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.DesignMode], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.DesignMode]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.DesignMode]

}
