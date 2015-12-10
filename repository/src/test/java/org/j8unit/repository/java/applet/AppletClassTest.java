package org.j8unit.repository.java.applet;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletClassTest
implements org.j8unit.repository.java.applet.AppletClassTests<java.applet.Applet> {

    @Override
    public Class<java.applet.Applet> createNewSUT() {
        return java.applet.Applet.class;
    }

}
