package org.j8unit.repository.java.beans;

import java.beans.DesignMode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DesignMode} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.beans.DesignModeClassTests}).
 */

@RunWith(J8Unit4.class)
public class DesignModeClassTest
implements DesignModeClassTests<DesignMode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.DesignMode]

    @Override
    public Class<DesignMode> createNewSUT() {
        return DesignMode.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.DesignMode]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.DesignMode]

}
