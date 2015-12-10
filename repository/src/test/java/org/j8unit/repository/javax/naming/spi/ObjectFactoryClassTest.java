package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.ObjectFactoryClassTests<javax.naming.spi.ObjectFactory> {

    @Override
    public Class<javax.naming.spi.ObjectFactory> createNewSUT() {
        return javax.naming.spi.ObjectFactory.class;
    }

}
