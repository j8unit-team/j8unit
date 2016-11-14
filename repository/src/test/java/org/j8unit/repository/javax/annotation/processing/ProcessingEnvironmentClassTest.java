package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.ProcessingEnvironment;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProcessingEnvironment} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.annotation.processing.ProcessingEnvironmentClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProcessingEnvironmentClassTest
implements ProcessingEnvironmentClassTests<ProcessingEnvironment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.ProcessingEnvironment]

    @Override
    public Class<ProcessingEnvironment> createNewSUT() {
        return ProcessingEnvironment.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.ProcessingEnvironment]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.ProcessingEnvironment]

}
