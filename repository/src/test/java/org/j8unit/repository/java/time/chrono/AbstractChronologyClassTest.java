package org.j8unit.repository.java.time.chrono;

import java.time.chrono.AbstractChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractChronologyClassTest
implements org.j8unit.repository.java.time.chrono.AbstractChronologyClassTests<AbstractChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.AbstractChronology]

    @Override
    public Class<AbstractChronology> createNewSUT() {
        return AbstractChronology.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.AbstractChronology]

}
