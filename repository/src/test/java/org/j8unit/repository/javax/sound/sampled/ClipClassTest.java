package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClipClassTest
implements org.j8unit.repository.javax.sound.sampled.ClipClassTests<javax.sound.sampled.Clip> {

    @Override
    public Class<javax.sound.sampled.Clip> createNewSUT() {
        return javax.sound.sampled.Clip.class;
    }

}
