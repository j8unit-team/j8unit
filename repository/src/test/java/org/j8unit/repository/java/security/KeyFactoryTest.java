package org.j8unit.repository.java.security;

import java.security.KeyFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyFactoryTest
implements org.j8unit.repository.java.security.KeyFactoryTests<KeyFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyFactory]

    @Override
    public KeyFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.KeyFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyFactory]

}
