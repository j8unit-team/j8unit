package org.j8unit.repository.java.applet;

import java.applet.AppletStub;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletStubTest
implements org.j8unit.repository.java.applet.AppletStubTests<AppletStub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.applet.AppletStub]

    @Override
    public AppletStub createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.applet.AppletStub], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.applet.AppletStub]

}
