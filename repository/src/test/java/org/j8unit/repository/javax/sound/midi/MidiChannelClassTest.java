package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiChannelClassTest
implements org.j8unit.repository.javax.sound.midi.MidiChannelClassTests<MidiChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiChannel]

    @Override
    public Class<MidiChannel> createNewSUT() {
        return MidiChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MidiChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiChannel]

}
