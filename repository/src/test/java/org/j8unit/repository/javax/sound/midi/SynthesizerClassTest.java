package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Synthesizer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SynthesizerClassTest
implements org.j8unit.repository.javax.sound.midi.SynthesizerClassTests<Synthesizer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Synthesizer]

    @Override
    public Class<Synthesizer> createNewSUT() {
        return Synthesizer.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Synthesizer]

}
