package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeyFactoryTest
implements org.j8unit.repository.javax.crypto.SecretKeyFactoryTests<javax.crypto.SecretKeyFactory> {

    @Override
    public javax.crypto.SecretKeyFactory createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.SecretKeyFactory] available.");
    }

}
