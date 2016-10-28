package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.ObjectFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.ObjectFactoryClassTests<ObjectFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.ObjectFactory]

    @Override
    public Class<ObjectFactory> createNewSUT() {
        return ObjectFactory.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.ObjectFactory]

}
