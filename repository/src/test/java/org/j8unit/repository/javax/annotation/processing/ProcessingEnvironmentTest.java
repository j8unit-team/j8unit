package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.ProcessingEnvironment;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ProcessingEnvironment} (by simply
 * reusing the J8Unit test interface {@link ProcessingEnvironmentTests}).
 */

@RunWith(J8Unit4.class)
public class ProcessingEnvironmentTest
implements ProcessingEnvironmentTests<ProcessingEnvironment> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.ProcessingEnvironment]

    @Override
    public ProcessingEnvironment createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.ProcessingEnvironment], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.processing.ProcessingEnvironment]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.processing.ProcessingEnvironment]

}
