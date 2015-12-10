package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SoundbankClassTest
implements org.j8unit.repository.javax.sound.midi.SoundbankClassTests<javax.sound.midi.Soundbank> {

    @Override
    public Class<javax.sound.midi.Soundbank> createNewSUT() {
        return javax.sound.midi.Soundbank.class;
    }

}
