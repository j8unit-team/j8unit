package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.InitialContextFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InitialContextFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.naming.spi.InitialContextFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class InitialContextFactoryTest
implements InitialContextFactoryTests<InitialContextFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.InitialContextFactory]

    @Override
    public InitialContextFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.spi.InitialContextFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.InitialContextFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.InitialContextFactory]

}
