package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Track;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Track} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.midi.TrackTests}).
 */

@RunWith(J8Unit4.class)
public class TrackTest
implements TrackTests<Track> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Track]

    @Override
    public Track createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.midi.Track], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.Track]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.Track]

}
