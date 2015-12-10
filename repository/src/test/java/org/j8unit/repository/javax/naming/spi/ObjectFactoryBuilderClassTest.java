package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectFactoryBuilderClassTest
implements org.j8unit.repository.javax.naming.spi.ObjectFactoryBuilderClassTests<javax.naming.spi.ObjectFactoryBuilder> {

    @Override
    public Class<javax.naming.spi.ObjectFactoryBuilder> createNewSUT() {
        return javax.naming.spi.ObjectFactoryBuilder.class;
    }

}
