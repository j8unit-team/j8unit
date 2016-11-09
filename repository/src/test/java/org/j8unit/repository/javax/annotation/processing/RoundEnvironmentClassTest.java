package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.RoundEnvironment;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RoundEnvironment} (by simply reusing the
 * J8Unit test interface {@link RoundEnvironmentClassTests}).
 */

@RunWith(J8Unit4.class)
public class RoundEnvironmentClassTest
implements RoundEnvironmentClassTests<RoundEnvironment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.RoundEnvironment]

    @Override
    public Class<RoundEnvironment> createNewSUT() {
        return RoundEnvironment.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.RoundEnvironment]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.RoundEnvironment]

}
