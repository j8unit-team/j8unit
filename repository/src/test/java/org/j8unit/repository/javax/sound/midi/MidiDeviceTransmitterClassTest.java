package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiDeviceTransmitter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceTransmitterClassTest
implements org.j8unit.repository.javax.sound.midi.MidiDeviceTransmitterClassTests<MidiDeviceTransmitter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiDeviceTransmitter]

    @Override
    public Class<MidiDeviceTransmitter> createNewSUT() {
        return MidiDeviceTransmitter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiDeviceTransmitter]

}
