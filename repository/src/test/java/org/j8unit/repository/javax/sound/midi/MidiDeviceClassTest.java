package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceClassTest
implements org.j8unit.repository.javax.sound.midi.MidiDeviceClassTests<javax.sound.midi.MidiDevice> {

    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements org.j8unit.repository.javax.sound.midi.MidiDeviceClassTests.InfoClassTests<javax.sound.midi.MidiDevice.Info> {

        @Override
        public Class<javax.sound.midi.MidiDevice.Info> createNewSUT() {
            return javax.sound.midi.MidiDevice.Info.class;
        }

    }

    @Override
    public Class<javax.sound.midi.MidiDevice> createNewSUT() {
        return javax.sound.midi.MidiDevice.class;
    }

}
