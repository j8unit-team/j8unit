package org.j8unit.repository.javax.crypto;

import javax.crypto.SecretKeyFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeyFactoryTest
implements org.j8unit.repository.javax.crypto.SecretKeyFactoryTests<SecretKeyFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.SecretKeyFactory]

    @Override
    public SecretKeyFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.SecretKeyFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.SecretKeyFactory]

}
