package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SynthesizerClassTest
implements org.j8unit.repository.javax.sound.midi.SynthesizerClassTests<javax.sound.midi.Synthesizer> {

    @Override
    public Class<javax.sound.midi.Synthesizer> createNewSUT() {
        return javax.sound.midi.Synthesizer.class;
    }

}
