package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.ObjectFactoryBuilder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectFactoryBuilderTest
implements org.j8unit.repository.javax.naming.spi.ObjectFactoryBuilderTests<ObjectFactoryBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.ObjectFactoryBuilder]

    @Override
    public ObjectFactoryBuilder createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.spi.ObjectFactoryBuilder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.ObjectFactoryBuilder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.ObjectFactoryBuilder]

}
