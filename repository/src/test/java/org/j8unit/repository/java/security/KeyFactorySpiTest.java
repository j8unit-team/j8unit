package org.j8unit.repository.java.security;

import java.security.KeyFactorySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyFactorySpiTest
implements org.j8unit.repository.java.security.KeyFactorySpiTests<KeyFactorySpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyFactorySpi]

    @Override
    public KeyFactorySpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.KeyFactorySpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyFactorySpi]

}
