package org.j8unit.repository.java.applet;

import java.applet.AppletStub;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AppletStub} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.applet.AppletStubTests}).
 */
@RunWith(J8Unit4.class)
public class AppletStubTest
implements AppletStubTests<AppletStub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.applet.AppletStub]

    @Override
    public AppletStub createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.applet.AppletStub], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.applet.AppletStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.applet.AppletStub]

}
