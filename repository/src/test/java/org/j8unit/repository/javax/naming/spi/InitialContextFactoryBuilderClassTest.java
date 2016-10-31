package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.InitialContextFactoryBuilder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialContextFactoryBuilderClassTest
implements org.j8unit.repository.javax.naming.spi.InitialContextFactoryBuilderClassTests<InitialContextFactoryBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.InitialContextFactoryBuilder]

    @Override
    public Class<InitialContextFactoryBuilder> createNewSUT() {
        return InitialContextFactoryBuilder.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.spi.InitialContextFactoryBuilder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.InitialContextFactoryBuilder]

}
