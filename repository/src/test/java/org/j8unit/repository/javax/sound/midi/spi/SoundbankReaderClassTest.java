package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SoundbankReaderClassTest
implements org.j8unit.repository.javax.sound.midi.spi.SoundbankReaderClassTests<javax.sound.midi.spi.SoundbankReader> {

    @Override
    public Class<javax.sound.midi.spi.SoundbankReader> createNewSUT() {
        return javax.sound.midi.spi.SoundbankReader.class;
    }

}
