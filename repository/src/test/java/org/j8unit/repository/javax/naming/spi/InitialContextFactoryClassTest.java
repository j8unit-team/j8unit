package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.InitialContextFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialContextFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.InitialContextFactoryClassTests<InitialContextFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.InitialContextFactory]

    @Override
    public Class<InitialContextFactory> createNewSUT() {
        return InitialContextFactory.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.InitialContextFactory]

}
