package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiSystem;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiSystemTest
implements org.j8unit.repository.javax.sound.midi.MidiSystemTests<MidiSystem> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.MidiSystem]

    @Override
    public MidiSystem createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.midi.MidiSystem], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.MidiSystem]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.MidiSystem]

}
