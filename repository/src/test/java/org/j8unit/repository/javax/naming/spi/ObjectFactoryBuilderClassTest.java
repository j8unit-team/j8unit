package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.ObjectFactoryBuilder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectFactoryBuilder} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.spi.ObjectFactoryBuilderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectFactoryBuilderClassTest
implements ObjectFactoryBuilderClassTests<ObjectFactoryBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.ObjectFactoryBuilder]

    @Override
    public Class<ObjectFactoryBuilder> createNewSUT() {
        return ObjectFactoryBuilder.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.spi.ObjectFactoryBuilder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.ObjectFactoryBuilder]

}
