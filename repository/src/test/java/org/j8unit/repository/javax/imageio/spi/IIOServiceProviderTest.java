package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.IIOServiceProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOServiceProviderTest
implements org.j8unit.repository.javax.imageio.spi.IIOServiceProviderTests<IIOServiceProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.IIOServiceProvider]

    @Override
    public IIOServiceProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.spi.IIOServiceProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.spi.IIOServiceProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.spi.IIOServiceProvider]

}
