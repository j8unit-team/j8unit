package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiDeviceReceiver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MidiDeviceReceiver} (by simply reusing
 * the J8Unit test interface {@link MidiDeviceReceiverClassTests}).
 */

@RunWith(J8Unit4.class)
public class MidiDeviceReceiverClassTest
implements MidiDeviceReceiverClassTests<MidiDeviceReceiver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiDeviceReceiver]

    @Override
    public Class<MidiDeviceReceiver> createNewSUT() {
        return MidiDeviceReceiver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MidiDeviceReceiver]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiDeviceReceiver]

}
