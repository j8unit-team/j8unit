package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiSystemClassTest
implements org.j8unit.repository.javax.sound.midi.MidiSystemClassTests<javax.sound.midi.MidiSystem> {

    @Override
    public Class<javax.sound.midi.MidiSystem> createNewSUT() {
        return javax.sound.midi.MidiSystem.class;
    }

}
