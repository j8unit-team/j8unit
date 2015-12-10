package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioInputStreamClassTest
implements org.j8unit.repository.javax.sound.sampled.AudioInputStreamClassTests<javax.sound.sampled.AudioInputStream> {

    @Override
    public Class<javax.sound.sampled.AudioInputStream> createNewSUT() {
        return javax.sound.sampled.AudioInputStream.class;
    }

}
