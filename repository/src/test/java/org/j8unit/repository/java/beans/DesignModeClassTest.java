package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DesignModeClassTest
implements org.j8unit.repository.java.beans.DesignModeClassTests<java.beans.DesignMode> {

    @Override
    public Class<java.beans.DesignMode> createNewSUT() {
        return java.beans.DesignMode.class;
    }

}
