package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Track;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrackClassTest
implements org.j8unit.repository.javax.sound.midi.TrackClassTests<Track> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Track]

    @Override
    public Class<Track> createNewSUT() {
        return Track.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.Track]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Track]

}
