package org.j8unit.repository.java.awt.image;

import java.awt.image.LookupTable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LookupTable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.LookupTableClassTests}).
 */
@RunWith(J8Unit4.class)
public class LookupTableClassTest
implements LookupTableClassTests<LookupTable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.LookupTable]

    @Override
    public Class<LookupTable> createNewSUT() {
        return LookupTable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.LookupTable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.LookupTable]

}
