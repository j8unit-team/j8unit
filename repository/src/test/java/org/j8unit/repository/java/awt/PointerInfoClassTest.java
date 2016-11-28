package org.j8unit.repository.java.awt;

import java.awt.PointerInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PointerInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.PointerInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class PointerInfoClassTest
implements PointerInfoClassTests<PointerInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PointerInfo]

    @Override
    public Class<PointerInfo> createNewSUT() {
        return PointerInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.PointerInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PointerInfo]

}
