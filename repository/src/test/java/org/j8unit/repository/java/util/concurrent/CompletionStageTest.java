package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CompletionStage;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionStageTest<T>
implements org.j8unit.repository.java.util.concurrent.CompletionStageTests<CompletionStage<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CompletionStage]

    @Override
    public CompletionStage<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.CompletionStage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CompletionStage]

}
