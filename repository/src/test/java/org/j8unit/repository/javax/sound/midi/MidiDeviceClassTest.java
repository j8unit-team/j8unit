package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDevice.Info;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceClassTest
implements org.j8unit.repository.javax.sound.midi.MidiDeviceClassTests<MidiDevice> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiDevice]

    @Override
    public Class<MidiDevice> createNewSUT() {
        return MidiDevice.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiDevice]

    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements org.j8unit.repository.javax.sound.midi.MidiDeviceClassTests.InfoClassTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiDevice$Info]

        @Override
        public Class<Info> createNewSUT() {
            return Info.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiDevice$Info]

    }

}
