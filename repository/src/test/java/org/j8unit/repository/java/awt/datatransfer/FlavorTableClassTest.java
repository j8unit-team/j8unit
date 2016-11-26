package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.FlavorTable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FlavorTable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.datatransfer.FlavorTableClassTests}).
 */
@RunWith(J8Unit4.class)
public class FlavorTableClassTest
implements FlavorTableClassTests<FlavorTable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.datatransfer.FlavorTable]

    @Override
    public Class<FlavorTable> createNewSUT() {
        return FlavorTable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.datatransfer.FlavorTable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.datatransfer.FlavorTable]

}
