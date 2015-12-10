package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceReceiverClassTest
implements org.j8unit.repository.javax.sound.midi.MidiDeviceReceiverClassTests<javax.sound.midi.MidiDeviceReceiver> {

    @Override
    public Class<javax.sound.midi.MidiDeviceReceiver> createNewSUT() {
        return javax.sound.midi.MidiDeviceReceiver.class;
    }

}
