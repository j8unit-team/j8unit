package org.j8unit.repository.java.applet;

import java.applet.AppletStub;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletStubClassTest
implements org.j8unit.repository.java.applet.AppletStubClassTests<AppletStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.applet.AppletStub]

    @Override
    public Class<AppletStub> createNewSUT() {
        return AppletStub.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.applet.AppletStub]

}
