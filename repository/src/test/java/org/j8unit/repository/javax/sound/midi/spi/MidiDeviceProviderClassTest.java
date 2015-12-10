package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiDeviceProviderClassTest
implements org.j8unit.repository.javax.sound.midi.spi.MidiDeviceProviderClassTests<javax.sound.midi.spi.MidiDeviceProvider> {

    @Override
    public Class<javax.sound.midi.spi.MidiDeviceProvider> createNewSUT() {
        return javax.sound.midi.spi.MidiDeviceProvider.class;
    }

}
