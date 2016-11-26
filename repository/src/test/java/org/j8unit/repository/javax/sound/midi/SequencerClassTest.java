package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Sequencer;
import javax.sound.midi.Sequencer.SyncMode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Sequencer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.midi.SequencerClassTests}).
 */
@RunWith(J8Unit4.class)
public class SequencerClassTest
implements SequencerClassTests<Sequencer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Sequencer]

    @Override
    public Class<Sequencer> createNewSUT() {
        return Sequencer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.Sequencer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Sequencer]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link SyncMode} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.SequencerClassTests.SyncModeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class SyncModeClassTest
    implements SyncModeClassTests<SyncMode> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Sequencer$SyncMode]

        @Override
        public Class<SyncMode> createNewSUT() {
            return SyncMode.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.Sequencer$SyncMode]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Sequencer$SyncMode]

    }

}
