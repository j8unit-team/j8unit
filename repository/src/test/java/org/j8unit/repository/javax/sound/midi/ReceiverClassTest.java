package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReceiverClassTest
implements org.j8unit.repository.javax.sound.midi.ReceiverClassTests<javax.sound.midi.Receiver> {

    @Override
    public Class<javax.sound.midi.Receiver> createNewSUT() {
        return javax.sound.midi.Receiver.class;
    }

}
