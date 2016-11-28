package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.Mixer;
import javax.sound.sampled.Mixer.Info;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Mixer} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.sound.sampled.MixerClassTests}).
 */
@RunWith(J8Unit4.class)
public class MixerClassTest
implements MixerClassTests<Mixer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Mixer]

    @Override
    public Class<Mixer> createNewSUT() {
        return Mixer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.Mixer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Mixer]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Info} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.sound.sampled.MixerClassTests.InfoClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements org.j8unit.repository.javax.sound.sampled.MixerClassTests.InfoClassTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Mixer$Info]

        @Override
        public Class<Info> createNewSUT() {
            return Info.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.Mixer$Info]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Mixer$Info]

    }

}
