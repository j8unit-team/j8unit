package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.SoundbankResource;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SoundbankResource} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.SoundbankResourceClassTests}).
 */

@RunWith(J8Unit4.class)
public class SoundbankResourceClassTest
implements SoundbankResourceClassTests<SoundbankResource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.SoundbankResource]

    @Override
    public Class<SoundbankResource> createNewSUT() {
        return SoundbankResource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.SoundbankResource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.SoundbankResource]

}
