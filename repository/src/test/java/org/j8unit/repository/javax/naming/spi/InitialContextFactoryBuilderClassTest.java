package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialContextFactoryBuilderClassTest
implements org.j8unit.repository.javax.naming.spi.InitialContextFactoryBuilderClassTests<javax.naming.spi.InitialContextFactoryBuilder> {

    @Override
    public Class<javax.naming.spi.InitialContextFactoryBuilder> createNewSUT() {
        return javax.naming.spi.InitialContextFactoryBuilder.class;
    }

}
