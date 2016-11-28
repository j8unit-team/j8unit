package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleExtendedTable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleExtendedTable} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.accessibility.AccessibleExtendedTableClassTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleExtendedTableClassTest
implements AccessibleExtendedTableClassTests<AccessibleExtendedTable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleExtendedTable]

    @Override
    public Class<AccessibleExtendedTable> createNewSUT() {
        return AccessibleExtendedTable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleExtendedTable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleExtendedTable]

}
