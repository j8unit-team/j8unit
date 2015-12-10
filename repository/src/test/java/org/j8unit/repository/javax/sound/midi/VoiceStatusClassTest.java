package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VoiceStatusClassTest
implements org.j8unit.repository.javax.sound.midi.VoiceStatusClassTests<javax.sound.midi.VoiceStatus> {

    @Override
    public Class<javax.sound.midi.VoiceStatus> createNewSUT() {
        return javax.sound.midi.VoiceStatus.class;
    }

}
