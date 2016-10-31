package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.TargetDataLine;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TargetDataLineTest
implements org.j8unit.repository.javax.sound.sampled.TargetDataLineTests<TargetDataLine> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.TargetDataLine]

    @Override
    public TargetDataLine createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.TargetDataLine], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.TargetDataLine]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.TargetDataLine]

}
