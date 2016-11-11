package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiMessage;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MidiMessage} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.MidiMessageTests}).
 */

@RunWith(J8Unit4.class)
public class MidiMessageTest
implements MidiMessageTests<MidiMessage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.MidiMessage]

    @Override
    public MidiMessage createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.MidiMessage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.MidiMessage]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.MidiMessage]

}
