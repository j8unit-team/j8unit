package org.j8unit.repository.java.security;

import java.security.SignatureSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignatureSpiTest
implements org.j8unit.repository.java.security.SignatureSpiTests<SignatureSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.SignatureSpi]

    @Override
    public SignatureSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.SignatureSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.SignatureSpi]

}
