package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIORegistryClassTest
implements org.j8unit.repository.javax.imageio.spi.IIORegistryClassTests<javax.imageio.spi.IIORegistry> {

    @Override
    public Class<javax.imageio.spi.IIORegistry> createNewSUT() {
        return javax.imageio.spi.IIORegistry.class;
    }

}
