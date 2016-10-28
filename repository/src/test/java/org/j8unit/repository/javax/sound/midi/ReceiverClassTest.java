package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Receiver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReceiverClassTest
implements org.j8unit.repository.javax.sound.midi.ReceiverClassTests<Receiver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Receiver]

    @Override
    public Class<Receiver> createNewSUT() {
        return Receiver.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Receiver]

}
