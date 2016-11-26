package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Processor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Processor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.annotation.processing.ProcessorTests}).
 */
@RunWith(J8Unit4.class)
public class ProcessorTest
implements ProcessorTests<Processor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Processor]

    @Override
    public Processor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.Processor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.processing.Processor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.processing.Processor]

}
