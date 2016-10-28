package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.StateFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StateFactoryTest
implements org.j8unit.repository.javax.naming.spi.StateFactoryTests<StateFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.StateFactory]

    @Override
    public StateFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.spi.StateFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.StateFactory]

}
