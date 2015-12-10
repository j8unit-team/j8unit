package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioSystemClassTest
implements org.j8unit.repository.javax.sound.sampled.AudioSystemClassTests<javax.sound.sampled.AudioSystem> {

    @Override
    public Class<javax.sound.sampled.AudioSystem> createNewSUT() {
        return javax.sound.sampled.AudioSystem.class;
    }

}
