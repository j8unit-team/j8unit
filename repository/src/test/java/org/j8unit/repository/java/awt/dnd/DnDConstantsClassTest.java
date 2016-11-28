package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DnDConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DnDConstants} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DnDConstantsClassTests}).
 */
@RunWith(J8Unit4.class)
public class DnDConstantsClassTest
implements DnDConstantsClassTests<DnDConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DnDConstants]

    @Override
    public Class<DnDConstants> createNewSUT() {
        return DnDConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DnDConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DnDConstants]

}
