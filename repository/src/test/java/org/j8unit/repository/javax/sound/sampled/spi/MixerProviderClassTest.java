package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MixerProviderClassTest
implements org.j8unit.repository.javax.sound.sampled.spi.MixerProviderClassTests<javax.sound.sampled.spi.MixerProvider> {

    @Override
    public Class<javax.sound.sampled.spi.MixerProvider> createNewSUT() {
        return javax.sound.sampled.spi.MixerProvider.class;
    }

}
