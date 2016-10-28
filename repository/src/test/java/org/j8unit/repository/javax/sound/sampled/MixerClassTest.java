package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.Mixer;
import javax.sound.sampled.Mixer.Info;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MixerClassTest
implements org.j8unit.repository.javax.sound.sampled.MixerClassTests<Mixer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Mixer]

    @Override
    public Class<Mixer> createNewSUT() {
        return Mixer.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Mixer]

    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements org.j8unit.repository.javax.sound.sampled.MixerClassTests.InfoClassTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Mixer$Info]

        @Override
        public Class<Info> createNewSUT() {
            return Info.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Mixer$Info]

    }

}
