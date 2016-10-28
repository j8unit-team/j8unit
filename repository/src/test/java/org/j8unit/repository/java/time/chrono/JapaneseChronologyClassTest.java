package org.j8unit.repository.java.time.chrono;

import java.time.chrono.JapaneseChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JapaneseChronologyClassTest
implements org.j8unit.repository.java.time.chrono.JapaneseChronologyClassTests<JapaneseChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.JapaneseChronology]

    @Override
    public Class<JapaneseChronology> createNewSUT() {
        return JapaneseChronology.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.JapaneseChronology]

}
