package org.j8unit.repository.java.awt.font;

import java.awt.font.MultipleMaster;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MultipleMaster} (by simply reusing the
 * J8Unit test interface {@link MultipleMasterClassTests}).
 */

@RunWith(J8Unit4.class)
public class MultipleMasterClassTest
implements MultipleMasterClassTests<MultipleMaster> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.font.MultipleMaster]

    @Override
    public Class<MultipleMaster> createNewSUT() {
        return MultipleMaster.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.font.MultipleMaster]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.font.MultipleMaster]

}
