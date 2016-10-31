package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.InitialContextFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialContextFactoryTest
implements org.j8unit.repository.javax.naming.spi.InitialContextFactoryTests<InitialContextFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.InitialContextFactory]

    @Override
    public InitialContextFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.spi.InitialContextFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.InitialContextFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.InitialContextFactory]

}
