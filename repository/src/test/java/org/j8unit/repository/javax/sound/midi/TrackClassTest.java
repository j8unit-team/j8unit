package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrackClassTest
implements org.j8unit.repository.javax.sound.midi.TrackClassTests<javax.sound.midi.Track> {

    @Override
    public Class<javax.sound.midi.Track> createNewSUT() {
        return javax.sound.midi.Track.class;
    }

}
