package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiFileFormat;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiFileFormatTest
implements org.j8unit.repository.javax.sound.midi.MidiFileFormatTests<MidiFileFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.MidiFileFormat]

    @Override
    public MidiFileFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.midi.MidiFileFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.MidiFileFormat]

}
