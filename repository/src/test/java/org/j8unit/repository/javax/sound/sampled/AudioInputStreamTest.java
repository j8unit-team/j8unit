package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.AudioInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AudioInputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.AudioInputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class AudioInputStreamTest
implements AudioInputStreamTests<AudioInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.AudioInputStream]

    @Override
    public AudioInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.sampled.AudioInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.AudioInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.AudioInputStream]

}
