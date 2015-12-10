package org.j8unit.repository.java.math;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BigIntegerTest
implements org.j8unit.repository.java.math.BigIntegerTests<java.math.BigInteger> {

    @Override
    public java.math.BigInteger createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.math.BigInteger] available.");
    }

}
