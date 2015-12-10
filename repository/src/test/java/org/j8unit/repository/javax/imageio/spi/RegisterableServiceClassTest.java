package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RegisterableServiceClassTest
implements org.j8unit.repository.javax.imageio.spi.RegisterableServiceClassTests<javax.imageio.spi.RegisterableService> {

    @Override
    public Class<javax.imageio.spi.RegisterableService> createNewSUT() {
        return javax.imageio.spi.RegisterableService.class;
    }

}
