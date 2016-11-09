package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.Clip;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Clip} (by simply reusing the J8Unit test
 * interface {@link ClipClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClipClassTest
implements ClipClassTests<Clip> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Clip]

    @Override
    public Class<Clip> createNewSUT() {
        return Clip.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.Clip]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Clip]

}
