package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Sequencer;
import javax.sound.midi.Sequencer.SyncMode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SequencerClassTest
implements org.j8unit.repository.javax.sound.midi.SequencerClassTests<Sequencer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Sequencer]

    @Override
    public Class<Sequencer> createNewSUT() {
        return Sequencer.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Sequencer]

    @RunWith(J8Unit4.class)
    public static class SyncModeClassTest
    implements org.j8unit.repository.javax.sound.midi.SequencerClassTests.SyncModeClassTests<SyncMode> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Sequencer$SyncMode]

        @Override
        public Class<SyncMode> createNewSUT() {
            return SyncMode.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Sequencer$SyncMode]

    }

}
