package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.RegisterableService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RegisterableServiceClassTest
implements org.j8unit.repository.javax.imageio.spi.RegisterableServiceClassTests<RegisterableService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.spi.RegisterableService]

    @Override
    public Class<RegisterableService> createNewSUT() {
        return RegisterableService.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.spi.RegisterableService]

}
