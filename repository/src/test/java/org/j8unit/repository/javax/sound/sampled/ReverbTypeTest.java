package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.ReverbType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReverbTypeTest
implements org.j8unit.repository.javax.sound.sampled.ReverbTypeTests<ReverbType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.ReverbType]

    @Override
    public ReverbType createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.sampled.ReverbType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.ReverbType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.ReverbType]

}
