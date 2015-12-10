package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstrumentClassTest
implements org.j8unit.repository.javax.sound.midi.InstrumentClassTests<javax.sound.midi.Instrument> {

    @Override
    public Class<javax.sound.midi.Instrument> createNewSUT() {
        return javax.sound.midi.Instrument.class;
    }

}
