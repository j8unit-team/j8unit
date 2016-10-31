package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.Clip;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClipClassTest
implements org.j8unit.repository.javax.sound.sampled.ClipClassTests<Clip> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Clip]

    @Override
    public Class<Clip> createNewSUT() {
        return Clip.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.Clip]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Clip]

}
