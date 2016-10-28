package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.Mixer;
import javax.sound.sampled.Mixer.Info;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MixerTest
implements org.j8unit.repository.javax.sound.sampled.MixerTests<Mixer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Mixer]

    @Override
    public Mixer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.Mixer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Mixer]

    @RunWith(J8Unit4.class)
    public static class InfoTest
    implements org.j8unit.repository.javax.sound.sampled.MixerTests.InfoTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Mixer$Info]

        @Override
        public Info createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.sampled.Mixer.Info], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Mixer$Info]

    }

}
