package org.j8unit.repository.java.time.chrono;

import java.time.chrono.JapaneseChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JapaneseChronology} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.time.chrono.JapaneseChronologyClassTests}).
 */

@RunWith(J8Unit4.class)
public class JapaneseChronologyClassTest
implements JapaneseChronologyClassTests<JapaneseChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.JapaneseChronology]

    @Override
    public Class<JapaneseChronology> createNewSUT() {
        return JapaneseChronology.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.chrono.JapaneseChronology]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.JapaneseChronology]

}
