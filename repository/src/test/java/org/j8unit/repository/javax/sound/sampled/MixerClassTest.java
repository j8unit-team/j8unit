package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MixerClassTest
implements org.j8unit.repository.javax.sound.sampled.MixerClassTests<javax.sound.sampled.Mixer> {

    @Override
    public Class<javax.sound.sampled.Mixer> createNewSUT() {
        return javax.sound.sampled.Mixer.class;
    }

    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements org.j8unit.repository.javax.sound.sampled.MixerClassTests.InfoClassTests<javax.sound.sampled.Mixer.Info> {

        @Override
        public Class<javax.sound.sampled.Mixer.Info> createNewSUT() {
            return javax.sound.sampled.Mixer.Info.class;
        }

    }

}
