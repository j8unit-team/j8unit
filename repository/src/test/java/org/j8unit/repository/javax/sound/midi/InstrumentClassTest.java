package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Instrument;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstrumentClassTest
implements org.j8unit.repository.javax.sound.midi.InstrumentClassTests<Instrument> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Instrument]

    @Override
    public Class<Instrument> createNewSUT() {
        return Instrument.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Instrument]

}
