package org.j8unit.repository.java.math;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BigDecimalTest
implements org.j8unit.repository.java.math.BigDecimalTests<java.math.BigDecimal> {

    @Override
    public java.math.BigDecimal createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.math.BigDecimal] available.");
    }

}
