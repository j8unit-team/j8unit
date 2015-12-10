package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransmitterClassTest
implements org.j8unit.repository.javax.sound.midi.TransmitterClassTests<javax.sound.midi.Transmitter> {

    @Override
    public Class<javax.sound.midi.Transmitter> createNewSUT() {
        return javax.sound.midi.Transmitter.class;
    }

}
