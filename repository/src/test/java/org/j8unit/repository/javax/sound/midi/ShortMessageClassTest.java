package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortMessageClassTest
implements org.j8unit.repository.javax.sound.midi.ShortMessageClassTests<javax.sound.midi.ShortMessage> {

    @Override
    public Class<javax.sound.midi.ShortMessage> createNewSUT() {
        return javax.sound.midi.ShortMessage.class;
    }

}
