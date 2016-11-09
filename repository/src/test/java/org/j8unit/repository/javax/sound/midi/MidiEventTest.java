package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MidiEvent} (by simply reusing the
 * J8Unit test interface {@link MidiEventTests}).
 */

@RunWith(J8Unit4.class)
public class MidiEventTest
implements MidiEventTests<MidiEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.MidiEvent]

    @Override
    public MidiEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.midi.MidiEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.MidiEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.MidiEvent]

}
