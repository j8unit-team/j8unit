package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Soundbank;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SoundbankClassTest
implements org.j8unit.repository.javax.sound.midi.SoundbankClassTests<Soundbank> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Soundbank]

    @Override
    public Class<Soundbank> createNewSUT() {
        return Soundbank.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Soundbank]

}
