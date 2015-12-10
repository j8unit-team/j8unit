package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StateFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.StateFactoryClassTests<javax.naming.spi.StateFactory> {

    @Override
    public Class<javax.naming.spi.StateFactory> createNewSUT() {
        return javax.naming.spi.StateFactory.class;
    }

}
