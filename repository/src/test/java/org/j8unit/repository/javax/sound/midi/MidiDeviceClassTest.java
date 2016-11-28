package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDevice.Info;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MidiDevice} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.midi.MidiDeviceClassTests}).
 */
@RunWith(J8Unit4.class)
public class MidiDeviceClassTest
implements MidiDeviceClassTests<MidiDevice> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiDevice]

    @Override
    public Class<MidiDevice> createNewSUT() {
        return MidiDevice.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MidiDevice]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiDevice]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Info} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.sound.midi.MidiDeviceClassTests.InfoClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements InfoClassTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiDevice$Info]

        @Override
        public Class<Info> createNewSUT() {
            return Info.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MidiDevice$Info]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiDevice$Info]

    }

}
