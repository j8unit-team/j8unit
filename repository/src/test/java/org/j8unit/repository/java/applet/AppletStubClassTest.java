package org.j8unit.repository.java.applet;

import java.applet.AppletStub;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AppletStub} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.applet.AppletStubClassTests}).
 */

@RunWith(J8Unit4.class)
public class AppletStubClassTest
implements AppletStubClassTests<AppletStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.applet.AppletStub]

    @Override
    public Class<AppletStub> createNewSUT() {
        return AppletStub.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.applet.AppletStub]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.applet.AppletStub]

}
