package org.j8unit.repository.java.math;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BigIntegerClassTest
implements org.j8unit.repository.java.math.BigIntegerClassTests<java.math.BigInteger> {

    @Override
    public Class<java.math.BigInteger> createNewSUT() {
        return java.math.BigInteger.class;
    }

}
