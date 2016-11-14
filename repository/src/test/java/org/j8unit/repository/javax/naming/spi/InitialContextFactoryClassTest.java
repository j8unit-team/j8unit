package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.InitialContextFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InitialContextFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.spi.InitialContextFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class InitialContextFactoryClassTest
implements InitialContextFactoryClassTests<InitialContextFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.InitialContextFactory]

    @Override
    public Class<InitialContextFactory> createNewSUT() {
        return InitialContextFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.spi.InitialContextFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.InitialContextFactory]

}
