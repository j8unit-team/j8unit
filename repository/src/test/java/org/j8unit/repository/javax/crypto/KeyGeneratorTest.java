package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyGeneratorTest
implements org.j8unit.repository.javax.crypto.KeyGeneratorTests<javax.crypto.KeyGenerator> {

    @Override
    public javax.crypto.KeyGenerator createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.KeyGenerator] available.");
    }

}
