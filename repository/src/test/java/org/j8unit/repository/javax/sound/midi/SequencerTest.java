package org.j8unit.repository.javax.sound.midi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Sequencer.SyncMode;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Sequencer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.SequencerTests}).
 */

@RunWith(J8Unit4.class)
public class SequencerTest
implements SequencerTests<Sequencer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Sequencer]

    @Override
    public Sequencer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.Sequencer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.Sequencer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.Sequencer]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link SyncMode} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.SequencerTests.SyncModeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class SyncModeTest
    implements SyncModeTests<SyncMode> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Sequencer$SyncMode]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(SyncMode.INTERNAL_CLOCK, //
                                    SyncMode.MIDI_SYNC, //
                                    SyncMode.NO_SYNC, //
                                    SyncMode.MIDI_TIME_CODE);
        }

        @Parameter(0)
        public SyncMode sut;

        @Override
        public SyncMode createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.Sequencer$SyncMode]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.Sequencer$SyncMode]

    }

}
