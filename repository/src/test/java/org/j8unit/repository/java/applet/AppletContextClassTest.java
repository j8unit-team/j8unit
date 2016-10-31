package org.j8unit.repository.java.applet;

import java.applet.AppletContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletContextClassTest
implements org.j8unit.repository.java.applet.AppletContextClassTests<AppletContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.applet.AppletContext]

    @Override
    public Class<AppletContext> createNewSUT() {
        return AppletContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.applet.AppletContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.applet.AppletContext]

}
