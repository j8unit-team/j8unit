package org.j8unit.repository.javax.sound.midi.spi;

import javax.sound.midi.spi.MidiFileWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MidiFileWriter} (by simply reusing
 * the J8Unit test interface {@link MidiFileWriterTests}).
 */

@RunWith(J8Unit4.class)
public class MidiFileWriterTest
implements MidiFileWriterTests<MidiFileWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.spi.MidiFileWriter]

    @Override
    public MidiFileWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.spi.MidiFileWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.spi.MidiFileWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.spi.MidiFileWriter]

}
