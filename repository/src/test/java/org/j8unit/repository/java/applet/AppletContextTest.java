package org.j8unit.repository.java.applet;

import java.applet.AppletContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletContextTest
implements org.j8unit.repository.java.applet.AppletContextTests<AppletContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.applet.AppletContext]

    @Override
    public AppletContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.applet.AppletContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.applet.AppletContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.applet.AppletContext]

}
