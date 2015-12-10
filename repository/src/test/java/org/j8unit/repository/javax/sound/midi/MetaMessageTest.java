package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetaMessageTest
implements org.j8unit.repository.javax.sound.midi.MetaMessageTests<javax.sound.midi.MetaMessage> {

    @Override
    public javax.sound.midi.MetaMessage createNewSUT() {
        return new javax.sound.midi.MetaMessage();
    }

}
