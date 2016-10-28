package org.j8unit.repository.javax.sound.sampled.spi;

import javax.sound.sampled.spi.FormatConversionProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatConversionProviderTest
implements org.j8unit.repository.javax.sound.sampled.spi.FormatConversionProviderTests<FormatConversionProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.spi.FormatConversionProvider]

    @Override
    public FormatConversionProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.spi.FormatConversionProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.spi.FormatConversionProvider]

}
