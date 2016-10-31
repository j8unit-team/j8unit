package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.InitialContextFactoryBuilder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialContextFactoryBuilderTest
implements org.j8unit.repository.javax.naming.spi.InitialContextFactoryBuilderTests<InitialContextFactoryBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.InitialContextFactoryBuilder]

    @Override
    public InitialContextFactoryBuilder createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.spi.InitialContextFactoryBuilder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.InitialContextFactoryBuilder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.InitialContextFactoryBuilder]

}
