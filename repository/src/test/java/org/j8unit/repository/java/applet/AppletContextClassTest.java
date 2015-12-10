package org.j8unit.repository.java.applet;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletContextClassTest
implements org.j8unit.repository.java.applet.AppletContextClassTests<java.applet.AppletContext> {

    @Override
    public Class<java.applet.AppletContext> createNewSUT() {
        return java.applet.AppletContext.class;
    }

}
