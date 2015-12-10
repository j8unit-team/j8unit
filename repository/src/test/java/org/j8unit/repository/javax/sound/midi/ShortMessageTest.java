package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortMessageTest
implements org.j8unit.repository.javax.sound.midi.ShortMessageTests<javax.sound.midi.ShortMessage> {

    @Override
    public javax.sound.midi.ShortMessage createNewSUT() {
        return new javax.sound.midi.ShortMessage();
    }

}
