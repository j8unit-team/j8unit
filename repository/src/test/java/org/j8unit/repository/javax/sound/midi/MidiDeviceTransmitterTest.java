package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiDeviceTransmitter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceTransmitterTest
implements org.j8unit.repository.javax.sound.midi.MidiDeviceTransmitterTests<MidiDeviceTransmitter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.MidiDeviceTransmitter]

    @Override
    public MidiDeviceTransmitter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.MidiDeviceTransmitter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.MidiDeviceTransmitter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.MidiDeviceTransmitter]

}
