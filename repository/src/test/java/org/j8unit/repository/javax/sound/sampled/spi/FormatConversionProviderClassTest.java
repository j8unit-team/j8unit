package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatConversionProviderClassTest
implements org.j8unit.repository.javax.sound.sampled.spi.FormatConversionProviderClassTests<javax.sound.sampled.spi.FormatConversionProvider> {

    @Override
    public Class<javax.sound.sampled.spi.FormatConversionProvider> createNewSUT() {
        return javax.sound.sampled.spi.FormatConversionProvider.class;
    }

}
