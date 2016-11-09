package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Patch;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Patch} (by simply reusing the J8Unit
 * test interface {@link PatchTests}).
 */

@RunWith(J8Unit4.class)
public class PatchTest
implements PatchTests<Patch> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Patch]

    @Override
    public Patch createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.midi.Patch], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.Patch]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.Patch]

}
