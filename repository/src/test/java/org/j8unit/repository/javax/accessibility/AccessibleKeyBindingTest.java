package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleKeyBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleKeyBindingTest
implements org.j8unit.repository.javax.accessibility.AccessibleKeyBindingTests<AccessibleKeyBinding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleKeyBinding]

    @Override
    public AccessibleKeyBinding createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleKeyBinding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleKeyBinding]

}
