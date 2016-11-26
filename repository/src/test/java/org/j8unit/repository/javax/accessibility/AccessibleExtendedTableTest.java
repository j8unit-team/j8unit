package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleExtendedTable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleExtendedTable} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleExtendedTableTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleExtendedTableTest
implements AccessibleExtendedTableTests<AccessibleExtendedTable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleExtendedTable]

    @Override
    public AccessibleExtendedTable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleExtendedTable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleExtendedTable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleExtendedTable]

}
