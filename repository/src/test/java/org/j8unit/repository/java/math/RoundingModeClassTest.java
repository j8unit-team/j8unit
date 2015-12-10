package org.j8unit.repository.java.math;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoundingModeClassTest
implements org.j8unit.repository.java.math.RoundingModeClassTests<java.math.RoundingMode> {

    @Override
    public Class<java.math.RoundingMode> createNewSUT() {
        return java.math.RoundingMode.class;
    }

}
