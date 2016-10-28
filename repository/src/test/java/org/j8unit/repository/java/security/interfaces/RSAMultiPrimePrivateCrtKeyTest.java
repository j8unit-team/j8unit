package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAMultiPrimePrivateCrtKeyTest
implements org.j8unit.repository.java.security.interfaces.RSAMultiPrimePrivateCrtKeyTests<RSAMultiPrimePrivateCrtKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.RSAMultiPrimePrivateCrtKey]

    @Override
    public RSAMultiPrimePrivateCrtKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.RSAMultiPrimePrivateCrtKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.RSAMultiPrimePrivateCrtKey]

}
