package org.j8unit.repository.java.time.chrono;

import java.time.chrono.Era;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Era} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.time.chrono.EraClassTests}).
 */

@RunWith(J8Unit4.class)
public class EraClassTest
implements EraClassTests<Era> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.Era]

    @Override
    public Class<Era> createNewSUT() {
        return Era.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.chrono.Era]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.Era]

}
