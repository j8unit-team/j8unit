package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SysexMessageClassTest
implements org.j8unit.repository.javax.sound.midi.SysexMessageClassTests<javax.sound.midi.SysexMessage> {

    @Override
    public Class<javax.sound.midi.SysexMessage> createNewSUT() {
        return javax.sound.midi.SysexMessage.class;
    }

}
