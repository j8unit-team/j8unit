package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.RoundEnvironment;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoundEnvironmentClassTest
implements org.j8unit.repository.javax.annotation.processing.RoundEnvironmentClassTests<RoundEnvironment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.RoundEnvironment]

    @Override
    public Class<RoundEnvironment> createNewSUT() {
        return RoundEnvironment.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.RoundEnvironment]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.RoundEnvironment]

}
