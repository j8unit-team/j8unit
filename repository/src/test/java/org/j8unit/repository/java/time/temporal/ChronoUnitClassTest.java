package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChronoUnitClassTest
implements org.j8unit.repository.java.time.temporal.ChronoUnitClassTests<java.time.temporal.ChronoUnit> {

    @Override
    public Class<java.time.temporal.ChronoUnit> createNewSUT() {
        return java.time.temporal.ChronoUnit.class;
    }

}
