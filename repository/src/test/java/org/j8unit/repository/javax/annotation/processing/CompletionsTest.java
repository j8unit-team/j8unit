package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Completions;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionsTest
implements org.j8unit.repository.javax.annotation.processing.CompletionsTests<Completions> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Completions]

    @Override
    public Completions createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.annotation.processing.Completions], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Completions]

}
