package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiDeviceReceiver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceReceiverClassTest
implements org.j8unit.repository.javax.sound.midi.MidiDeviceReceiverClassTests<MidiDeviceReceiver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiDeviceReceiver]

    @Override
    public Class<MidiDeviceReceiver> createNewSUT() {
        return MidiDeviceReceiver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MidiDeviceReceiver]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiDeviceReceiver]

}
