package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceTransmitterClassTest
implements org.j8unit.repository.javax.sound.midi.MidiDeviceTransmitterClassTests<javax.sound.midi.MidiDeviceTransmitter> {

    @Override
    public Class<javax.sound.midi.MidiDeviceTransmitter> createNewSUT() {
        return javax.sound.midi.MidiDeviceTransmitter.class;
    }

}
