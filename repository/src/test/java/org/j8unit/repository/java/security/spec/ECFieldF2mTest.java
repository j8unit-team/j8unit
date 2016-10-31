package org.j8unit.repository.java.security.spec;

import java.security.spec.ECFieldF2m;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECFieldF2mTest
implements org.j8unit.repository.java.security.spec.ECFieldF2mTests<ECFieldF2m> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.ECFieldF2m]

    @Override
    public ECFieldF2m createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.ECFieldF2m], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.ECFieldF2m]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.ECFieldF2m]

}
