package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiChannelClassTest
implements org.j8unit.repository.javax.sound.midi.MidiChannelClassTests<javax.sound.midi.MidiChannel> {

    @Override
    public Class<javax.sound.midi.MidiChannel> createNewSUT() {
        return javax.sound.midi.MidiChannel.class;
    }

}
