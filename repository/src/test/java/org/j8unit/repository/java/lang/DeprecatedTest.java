package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DeprecatedTest
implements org.j8unit.repository.java.lang.DeprecatedTests<Deprecated> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Deprecated]

    @Override
    public Deprecated createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.Deprecated], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Deprecated]

}
