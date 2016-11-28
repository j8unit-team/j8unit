package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Completion;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Completion} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.annotation.processing.CompletionTests}).
 */
@RunWith(J8Unit4.class)
public class CompletionTest
implements CompletionTests<Completion> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Completion]

    @Override
    public Completion createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.Completion], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.processing.Completion]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.processing.Completion]

}
