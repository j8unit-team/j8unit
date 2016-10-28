package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Instrument;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstrumentTest
implements org.j8unit.repository.javax.sound.midi.InstrumentTests<Instrument> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Instrument]

    @Override
    public Instrument createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.Instrument], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Instrument]

}
