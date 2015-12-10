package org.j8unit.repository.java.applet;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletTest
implements org.j8unit.repository.java.applet.AppletTests<java.applet.Applet> {

    @Override
    public java.applet.Applet createNewSUT() {
        return new java.applet.Applet();
    }

}
