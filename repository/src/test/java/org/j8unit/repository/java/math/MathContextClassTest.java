package org.j8unit.repository.java.math;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MathContextClassTest
implements org.j8unit.repository.java.math.MathContextClassTests<java.math.MathContext> {

    @Override
    public Class<java.math.MathContext> createNewSUT() {
        return java.math.MathContext.class;
    }

}
