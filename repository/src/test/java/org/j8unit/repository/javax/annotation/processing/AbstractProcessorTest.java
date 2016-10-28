package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.AbstractProcessor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractProcessorTest
implements org.j8unit.repository.javax.annotation.processing.AbstractProcessorTests<AbstractProcessor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.AbstractProcessor]

    @Override
    public AbstractProcessor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.AbstractProcessor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.AbstractProcessor]

}
