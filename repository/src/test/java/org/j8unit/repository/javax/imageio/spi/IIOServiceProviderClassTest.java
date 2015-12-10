package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOServiceProviderClassTest
implements org.j8unit.repository.javax.imageio.spi.IIOServiceProviderClassTests<javax.imageio.spi.IIOServiceProvider> {

    @Override
    public Class<javax.imageio.spi.IIOServiceProvider> createNewSUT() {
        return javax.imageio.spi.IIOServiceProvider.class;
    }

}
