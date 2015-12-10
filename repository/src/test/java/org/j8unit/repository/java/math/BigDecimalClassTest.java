package org.j8unit.repository.java.math;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BigDecimalClassTest
implements org.j8unit.repository.java.math.BigDecimalClassTests<java.math.BigDecimal> {

    @Override
    public Class<java.math.BigDecimal> createNewSUT() {
        return java.math.BigDecimal.class;
    }

}
