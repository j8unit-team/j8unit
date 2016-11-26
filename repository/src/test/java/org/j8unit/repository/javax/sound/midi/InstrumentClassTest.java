package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Instrument;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Instrument} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.midi.InstrumentClassTests}).
 */
@RunWith(J8Unit4.class)
public class InstrumentClassTest
implements InstrumentClassTests<Instrument> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Instrument]

    @Override
    public Class<Instrument> createNewSUT() {
        return Instrument.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.Instrument]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Instrument]

}
