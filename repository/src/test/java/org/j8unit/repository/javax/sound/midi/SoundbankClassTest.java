package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Soundbank;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Soundbank} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.midi.SoundbankClassTests}).
 */

@RunWith(J8Unit4.class)
public class SoundbankClassTest
implements SoundbankClassTests<Soundbank> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Soundbank]

    @Override
    public Class<Soundbank> createNewSUT() {
        return Soundbank.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.Soundbank]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Soundbank]

}
