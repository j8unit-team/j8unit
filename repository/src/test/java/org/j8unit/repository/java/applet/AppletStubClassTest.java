package org.j8unit.repository.java.applet;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletStubClassTest
implements org.j8unit.repository.java.applet.AppletStubClassTests<java.applet.AppletStub> {

    @Override
    public Class<java.applet.AppletStub> createNewSUT() {
        return java.applet.AppletStub.class;
    }

}