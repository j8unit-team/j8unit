package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialContextFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.InitialContextFactoryClassTests<javax.naming.spi.InitialContextFactory> {

    @Override
    public Class<javax.naming.spi.InitialContextFactory> createNewSUT() {
        return javax.naming.spi.InitialContextFactory.class;
    }

}
