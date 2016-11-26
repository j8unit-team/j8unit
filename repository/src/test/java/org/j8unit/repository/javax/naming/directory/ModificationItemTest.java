package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.ModificationItem;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ModificationItem} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.directory.ModificationItemTests}).
 */
@RunWith(J8Unit4.class)
public class ModificationItemTest
implements ModificationItemTests<ModificationItem> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.ModificationItem]

    @Override
    public ModificationItem createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.directory.ModificationItem], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.directory.ModificationItem]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.directory.ModificationItem]

}
