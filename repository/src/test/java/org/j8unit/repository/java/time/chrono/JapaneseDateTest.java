package org.j8unit.repository.java.time.chrono;

import java.time.chrono.JapaneseDate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JapaneseDate} (by simply reusing the
 * J8Unit test interface {@link JapaneseDateTests}).
 */

@RunWith(J8Unit4.class)
public class JapaneseDateTest
implements JapaneseDateTests<JapaneseDate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.JapaneseDate]

    @Override
    public JapaneseDate createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.chrono.JapaneseDate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.JapaneseDate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.JapaneseDate]

}
