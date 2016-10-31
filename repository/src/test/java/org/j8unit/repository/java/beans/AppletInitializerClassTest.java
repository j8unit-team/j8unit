package org.j8unit.repository.java.beans;

import java.beans.AppletInitializer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletInitializerClassTest
implements org.j8unit.repository.java.beans.AppletInitializerClassTests<AppletInitializer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.AppletInitializer]

    @Override
    public Class<AppletInitializer> createNewSUT() {
        return AppletInitializer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.AppletInitializer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.AppletInitializer]

}
