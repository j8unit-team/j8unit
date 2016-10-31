package org.j8unit.repository.java.beans;

import java.beans.DesignMode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DesignModeClassTest
implements org.j8unit.repository.java.beans.DesignModeClassTests<DesignMode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.DesignMode]

    @Override
    public Class<DesignMode> createNewSUT() {
        return DesignMode.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.DesignMode]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.DesignMode]

}
