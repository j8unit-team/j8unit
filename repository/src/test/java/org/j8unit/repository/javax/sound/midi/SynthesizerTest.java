package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Synthesizer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SynthesizerTest
implements org.j8unit.repository.javax.sound.midi.SynthesizerTests<Synthesizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Synthesizer]

    @Override
    public Synthesizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.Synthesizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Synthesizer]

}
