package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioSystemTest
implements org.j8unit.repository.javax.sound.sampled.AudioSystemTests<javax.sound.sampled.AudioSystem> {

    @Override
    public javax.sound.sampled.AudioSystem createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.sound.sampled.AudioSystem] available.");
    }

}
