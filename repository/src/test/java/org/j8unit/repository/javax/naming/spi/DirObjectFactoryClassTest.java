package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirObjectFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.DirObjectFactoryClassTests<javax.naming.spi.DirObjectFactory> {

    @Override
    public Class<javax.naming.spi.DirObjectFactory> createNewSUT() {
        return javax.naming.spi.DirObjectFactory.class;
    }

}
