package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAPrivateCrtKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPrivateCrtKeyTest
implements org.j8unit.repository.java.security.interfaces.RSAPrivateCrtKeyTests<RSAPrivateCrtKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.RSAPrivateCrtKey]

    @Override
    public RSAPrivateCrtKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.RSAPrivateCrtKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.interfaces.RSAPrivateCrtKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.interfaces.RSAPrivateCrtKey]

}
