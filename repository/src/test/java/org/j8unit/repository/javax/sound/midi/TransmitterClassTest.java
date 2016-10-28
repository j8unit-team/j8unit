package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Transmitter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransmitterClassTest
implements org.j8unit.repository.javax.sound.midi.TransmitterClassTests<Transmitter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Transmitter]

    @Override
    public Class<Transmitter> createNewSUT() {
        return Transmitter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Transmitter]

}
