package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleTable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleTableTest
implements org.j8unit.repository.javax.accessibility.AccessibleTableTests<AccessibleTable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleTable]

    @Override
    public AccessibleTable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleTable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleTable]

}
