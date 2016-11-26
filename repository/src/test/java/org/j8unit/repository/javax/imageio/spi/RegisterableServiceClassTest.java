package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.RegisterableService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RegisterableService} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.spi.RegisterableServiceClassTests}).
 */
@RunWith(J8Unit4.class)
public class RegisterableServiceClassTest
implements RegisterableServiceClassTests<RegisterableService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.spi.RegisterableService]

    @Override
    public Class<RegisterableService> createNewSUT() {
        return RegisterableService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.spi.RegisterableService]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.spi.RegisterableService]

}
