package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.StateFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StateFactory} (by simply reusing the
 * J8Unit test interface {@link StateFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class StateFactoryClassTest
implements StateFactoryClassTests<StateFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.StateFactory]

    @Override
    public Class<StateFactory> createNewSUT() {
        return StateFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.spi.StateFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.StateFactory]

}
