package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDevice.Info;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceTest
implements org.j8unit.repository.javax.sound.midi.MidiDeviceTests<MidiDevice> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.MidiDevice]

    @Override
    public MidiDevice createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.MidiDevice], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.MidiDevice]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.MidiDevice]

    @RunWith(J8Unit4.class)
    public static class InfoTest
    implements org.j8unit.repository.javax.sound.midi.MidiDeviceTests.InfoTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.MidiDevice$Info]

        @Override
        public Info createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.midi.MidiDevice.Info], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.MidiDevice$Info]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.MidiDevice$Info]

    }

}
