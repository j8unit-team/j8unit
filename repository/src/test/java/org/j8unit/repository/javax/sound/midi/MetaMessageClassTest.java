package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetaMessageClassTest
implements org.j8unit.repository.javax.sound.midi.MetaMessageClassTests<javax.sound.midi.MetaMessage> {

    @Override
    public Class<javax.sound.midi.MetaMessage> createNewSUT() {
        return javax.sound.midi.MetaMessage.class;
    }

}
