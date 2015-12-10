package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VoiceStatusTest
implements org.j8unit.repository.javax.sound.midi.VoiceStatusTests<javax.sound.midi.VoiceStatus> {

    @Override
    public javax.sound.midi.VoiceStatus createNewSUT() {
        return new javax.sound.midi.VoiceStatus();
    }

}
