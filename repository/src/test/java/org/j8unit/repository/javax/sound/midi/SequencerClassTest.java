package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SequencerClassTest
implements org.j8unit.repository.javax.sound.midi.SequencerClassTests<javax.sound.midi.Sequencer> {

    @Override
    public Class<javax.sound.midi.Sequencer> createNewSUT() {
        return javax.sound.midi.Sequencer.class;
    }

    @RunWith(J8Unit4.class)
    public static class SyncModeClassTest
    implements org.j8unit.repository.javax.sound.midi.SequencerClassTests.SyncModeClassTests<javax.sound.midi.Sequencer.SyncMode> {

        @Override
        public Class<javax.sound.midi.Sequencer.SyncMode> createNewSUT() {
            return javax.sound.midi.Sequencer.SyncMode.class;
        }

    }

}
