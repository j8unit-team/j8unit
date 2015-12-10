package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JapaneseChronologyClassTest
implements org.j8unit.repository.java.time.chrono.JapaneseChronologyClassTests<java.time.chrono.JapaneseChronology> {

    @Override
    public Class<java.time.chrono.JapaneseChronology> createNewSUT() {
        return java.time.chrono.JapaneseChronology.class;
    }

}
