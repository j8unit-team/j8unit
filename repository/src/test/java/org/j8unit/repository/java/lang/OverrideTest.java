package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OverrideTest
implements org.j8unit.repository.java.lang.OverrideTests<Override> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Override]

    @Override
    public Override createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.Override], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Override]

}
