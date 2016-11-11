package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiDeviceTransmitter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MidiDeviceTransmitter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.MidiDeviceTransmitterClassTests}).
 */

@RunWith(J8Unit4.class)
public class MidiDeviceTransmitterClassTest
implements MidiDeviceTransmitterClassTests<MidiDeviceTransmitter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiDeviceTransmitter]

    @Override
    public Class<MidiDeviceTransmitter> createNewSUT() {
        return MidiDeviceTransmitter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MidiDeviceTransmitter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiDeviceTransmitter]

}
