package org.j8unit.repository.java.beans;

import java.beans.AppletInitializer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AppletInitializer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.AppletInitializerTests}).
 */

@RunWith(J8Unit4.class)
public class AppletInitializerTest
implements AppletInitializerTests<AppletInitializer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.AppletInitializer]

    @Override
    public AppletInitializer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.AppletInitializer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.AppletInitializer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.AppletInitializer]

}
