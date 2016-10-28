package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.StateFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StateFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.StateFactoryClassTests<StateFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.StateFactory]

    @Override
    public Class<StateFactory> createNewSUT() {
        return StateFactory.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.StateFactory]

}
