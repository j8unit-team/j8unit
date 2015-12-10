package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletInitializerClassTest
implements org.j8unit.repository.java.beans.AppletInitializerClassTests<java.beans.AppletInitializer> {

    @Override
    public Class<java.beans.AppletInitializer> createNewSUT() {
        return java.beans.AppletInitializer.class;
    }

}
