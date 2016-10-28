package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Completion;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionTest
implements org.j8unit.repository.javax.annotation.processing.CompletionTests<Completion> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Completion]

    @Override
    public Completion createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.Completion], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Completion]

}
