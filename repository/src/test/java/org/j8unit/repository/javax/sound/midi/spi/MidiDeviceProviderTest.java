package org.j8unit.repository.javax.sound.midi.spi;

import javax.sound.midi.spi.MidiDeviceProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceProviderTest
implements org.j8unit.repository.javax.sound.midi.spi.MidiDeviceProviderTests<MidiDeviceProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.spi.MidiDeviceProvider]

    @Override
    public MidiDeviceProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.spi.MidiDeviceProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.spi.MidiDeviceProvider]

}
