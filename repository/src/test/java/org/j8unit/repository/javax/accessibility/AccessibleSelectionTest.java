package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleSelection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleSelectionTest
implements org.j8unit.repository.javax.accessibility.AccessibleSelectionTests<AccessibleSelection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleSelection]

    @Override
    public AccessibleSelection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleSelection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleSelection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleSelection]

}
