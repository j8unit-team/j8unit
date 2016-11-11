package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Sequence;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Sequence} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.SequenceTests}).
 */

@RunWith(J8Unit4.class)
public class SequenceTest
implements SequenceTests<Sequence> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Sequence]

    @Override
    public Sequence createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.midi.Sequence], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.Sequence]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.Sequence]

}
