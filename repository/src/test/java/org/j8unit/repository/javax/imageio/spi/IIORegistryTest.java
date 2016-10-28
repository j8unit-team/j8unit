package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.IIORegistry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIORegistryTest
implements org.j8unit.repository.javax.imageio.spi.IIORegistryTests<IIORegistry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.IIORegistry]

    @Override
    public IIORegistry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.spi.IIORegistry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.IIORegistry]

}
