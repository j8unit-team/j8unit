package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SequenceClassTest
implements org.j8unit.repository.javax.sound.midi.SequenceClassTests<javax.sound.midi.Sequence> {

    @Override
    public Class<javax.sound.midi.Sequence> createNewSUT() {
        return javax.sound.midi.Sequence.class;
    }

}
