package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.RegisterableService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RegisterableService} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.imageio.spi.RegisterableServiceTests}).
 */
@RunWith(J8Unit4.class)
public class RegisterableServiceTest
implements RegisterableServiceTests<RegisterableService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.RegisterableService]

    @Override
    public RegisterableService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.spi.RegisterableService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.spi.RegisterableService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.spi.RegisterableService]

}
