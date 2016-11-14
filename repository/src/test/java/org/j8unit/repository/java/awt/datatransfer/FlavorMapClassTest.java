package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.FlavorMap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FlavorMap} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.datatransfer.FlavorMapClassTests}).
 */

@RunWith(J8Unit4.class)
public class FlavorMapClassTest
implements FlavorMapClassTests<FlavorMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.datatransfer.FlavorMap]

    @Override
    public Class<FlavorMap> createNewSUT() {
        return FlavorMap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.datatransfer.FlavorMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.datatransfer.FlavorMap]

}
