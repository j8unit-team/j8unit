package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocalDateClassTest
implements org.j8unit.repository.java.time.LocalDateClassTests<java.time.LocalDate> {

    @Override
    public Class<java.time.LocalDate> createNewSUT() {
        return java.time.LocalDate.class;
    }

}
