package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChronoFieldClassTest
implements org.j8unit.repository.java.time.temporal.ChronoFieldClassTests<java.time.temporal.ChronoField> {

    @Override
    public Class<java.time.temporal.ChronoField> createNewSUT() {
        return java.time.temporal.ChronoField.class;
    }

}
