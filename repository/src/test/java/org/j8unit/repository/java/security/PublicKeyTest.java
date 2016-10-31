package org.j8unit.repository.java.security;

import java.security.PublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PublicKeyTest
implements org.j8unit.repository.java.security.PublicKeyTests<PublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PublicKey]

    @Override
    public PublicKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.PublicKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.PublicKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.PublicKey]

}
