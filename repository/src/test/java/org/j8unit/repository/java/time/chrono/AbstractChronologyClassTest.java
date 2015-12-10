package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractChronologyClassTest
implements org.j8unit.repository.java.time.chrono.AbstractChronologyClassTests<java.time.chrono.AbstractChronology> {

    @Override
    public Class<java.time.chrono.AbstractChronology> createNewSUT() {
        return java.time.chrono.AbstractChronology.class;
    }

}
